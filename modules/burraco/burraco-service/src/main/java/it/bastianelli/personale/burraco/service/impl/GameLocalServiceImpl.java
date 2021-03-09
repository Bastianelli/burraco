/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package it.bastianelli.personale.burraco.service.impl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import it.bastianelli.personale.burraco.constants.GameConstants;
import it.bastianelli.personale.burraco.model.Game;
import it.bastianelli.personale.burraco.service.base.GameLocalServiceBaseImpl;

/**
 * The implementation of the game local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>it.bastianelli.personale.burraco.service.GameLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GameLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=it.bastianelli.personale.burraco.model.Game",
	service = AopService.class
)
public class GameLocalServiceImpl extends GameLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. 
	 * Use <code>it.bastianelli.personale.burraco.service.GameLocalService</code> 
	 * via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> 
	 * or use 
	 * <code>it.bastianelli.personale.burraco.service.GameLocalServiceUtil</code>.
	 */
	
	public Game addGame(long userId, long opponentId,
			ServiceContext serviceContext) throws PortalException {
		
		User user = userLocalService.getUserById(userId);
		Date now = new Date();
		
		long gameId = counterLocalService.increment();
		Game game = gamePersistence.create(gameId);
		
		// Audit fields
		
		game.setGroupId(serviceContext.getScopeGroupId());
		game.setCompanyId(user.getCompanyId());
		game.setUserId(userId);
		game.setUserName(user.getFirstName());
		game.setCreateDate(now);
		
		// Other fields
		
		game.setState(GameConstants.STATE_INIT);
		game.setOpponentId(opponentId);
		game.setScore(0);
		game.setOpponentScore(0);
		
		// Game update
		game = gamePersistence.update(game);
		
		return game;
	}
	
	public List<Game> getGames(long userId) {
		return gamePersistence.findByUserId(userId);
	}
	
	public List<Game> getGames(
			long userId, int start, int end, OrderByComparator<Game> obc) {
		return gamePersistence.findByUserId(userId, start, end, obc);
	}
	
	public List<Game> getGames(long userId, int start, int end) {
		return gamePersistence.findByUserId(userId, start, end);
	}
	
	public int getGamesCount(long userId) {
		return gamePersistence.countByUserId(userId);
	}
}