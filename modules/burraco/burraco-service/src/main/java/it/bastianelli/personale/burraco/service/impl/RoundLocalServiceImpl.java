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
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import it.bastianelli.personale.burraco.model.Round;
import it.bastianelli.personale.burraco.service.base.RoundLocalServiceBaseImpl;

/**
 * The implementation of the round local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>it.bastianelli.personale.burraco.service.RoundLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RoundLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=it.bastianelli.personale.burraco.model.Round",
	service = AopService.class
)
public class RoundLocalServiceImpl extends RoundLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>it.bastianelli.personale.burraco.service.RoundLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>it.bastianelli.personale.burraco.service.RoundLocalServiceUtil</code>.
	 */
	
	public Round addRound(
			long gameId, long userId, long opponentUserId,
			boolean pot, int cleanRun, int dirtyRun, int score,
			boolean opponentPot, int opponentCleanRun, int opponentDirtyRun,
			int opponentScore, ServiceContext serviceContext) 
		throws PortalException {
		
		long roundId = counterLocalService.increment();
		User user = userLocalService.getUserById(userId);
		User opponent = userLocalService.getUserById(opponentUserId);
		long groupId = serviceContext.getScopeGroupId();
		
		Date now = new Date();
		
		Round round = roundPersistence.create(roundId);
		
		// Audit fields
		
		round.setGroupId(groupId);
		round.setCompanyId(user.getCompanyId());
		round.setUserId(userId);
		round.setUserName(user.getFirstName());
		round.setCreateDate(now);
		
		// Other fields
		
		round.setGameId(gameId);
		//TODO round.setOrder();
		
		// Player fields
		
		round.setPots(pot);
		round.setCleanRun(cleanRun);
		round.setDirtyRun(dirtyRun);
		round.setScore(score);
		
		// Opponent fields
		
		round.setOpponentUserId(opponentUserId);
		round.setOpponentUserName(opponent.getFirstName());
		round.setOpponentPots(opponentPot);
		round.setOpponentCleanRun(opponentCleanRun);
		round.setOpponentDirtyRun(opponentDirtyRun);
		round.setOpponentScore(opponentScore);
		
		// Round update
		
		round = roundPersistence.update(round);
		
		return round;
	}
	
	public Round deleteRound(Round round) throws PortalException {
		roundPersistence.remove(round);
		return round;
	}
	
	public Round deleteRound (long roundId) throws PortalException {
		
		Round round = roundPersistence.findByPrimaryKey(roundId);
		return deleteRound(round);
	}
	
	public List<Round> getRounds(long gameId) {
		
		return roundPersistence.findByGameId(gameId);
	}
	
	public List<Round> getRounds (long gameId, int start, int end) 
		throws SystemException {
		
		return roundPersistence.findByGameId(gameId, start, end);
	}
	
	public List<Round> getRounds (
			long gameId, int start, int end, OrderByComparator<Round> obc) {
		
		return roundPersistence.findByGameId(gameId, start, end, obc);
	}
	
	public Round getRound (long roundId) throws PortalException {
		
		return roundPersistence.findByPrimaryKey(roundId);
	}
	
	public int getRoundCount (long gameId) {
		
		return roundPersistence.countByGameId(gameId);
	}
	
	public Round updateRound(
			long roundId, boolean pot, int cleanRun, int dirtyRun, int score,
			boolean opponentPot, int opponentCleanRun, int opponentDirtyRun,
			int opponentScore, ServiceContext serviceContext) 
		throws PortalException, SystemException {
		
		Date now = new Date();
		
		Round round = roundPersistence.findByPrimaryKey(roundId);
		
		round.setModifiedDate(serviceContext.getModifiedDate(now));
		
		// Player fields
		
		round.setPots(pot);
		round.setCleanRun(cleanRun);
		round.setDirtyRun(dirtyRun);
		round.setScore(score);
		
		// Opponent fields
		
		round.setOpponentPots(opponentPot);
		round.setOpponentCleanRun(opponentCleanRun);
		round.setOpponentDirtyRun(opponentDirtyRun);
		round.setOpponentScore(opponentScore);
		
		// Round update
		
		round = roundPersistence.update(round);
		
		return round;
	}
	
}