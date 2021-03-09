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

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

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
			ServiceContext serviceContext) 
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
		//TODO COMPLETA addRound!!
		
		return null;
	}
	
}