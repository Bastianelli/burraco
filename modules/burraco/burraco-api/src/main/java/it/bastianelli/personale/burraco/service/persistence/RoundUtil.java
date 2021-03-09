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

package it.bastianelli.personale.burraco.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import it.bastianelli.personale.burraco.model.Round;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the round service. This utility wraps <code>it.bastianelli.personale.burraco.service.persistence.impl.RoundPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RoundPersistence
 * @generated
 */
public class RoundUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Round round) {
		getPersistence().clearCache(round);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Round> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Round> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Round> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Round> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Round> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Round update(Round round) {
		return getPersistence().update(round);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Round update(Round round, ServiceContext serviceContext) {
		return getPersistence().update(round, serviceContext);
	}

	/**
	 * Returns all the rounds where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching rounds
	 */
	public static List<Round> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the rounds where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoundModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of rounds
	 * @param end the upper bound of the range of rounds (not inclusive)
	 * @return the range of matching rounds
	 */
	public static List<Round> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the rounds where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoundModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of rounds
	 * @param end the upper bound of the range of rounds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rounds
	 */
	public static List<Round> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Round> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the rounds where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoundModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of rounds
	 * @param end the upper bound of the range of rounds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching rounds
	 */
	public static List<Round> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Round> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first round in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching round
	 * @throws NoSuchRoundException if a matching round could not be found
	 */
	public static Round findByUuid_First(
			String uuid, OrderByComparator<Round> orderByComparator)
		throws it.bastianelli.personale.burraco.exception.NoSuchRoundException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first round in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching round, or <code>null</code> if a matching round could not be found
	 */
	public static Round fetchByUuid_First(
		String uuid, OrderByComparator<Round> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last round in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching round
	 * @throws NoSuchRoundException if a matching round could not be found
	 */
	public static Round findByUuid_Last(
			String uuid, OrderByComparator<Round> orderByComparator)
		throws it.bastianelli.personale.burraco.exception.NoSuchRoundException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last round in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching round, or <code>null</code> if a matching round could not be found
	 */
	public static Round fetchByUuid_Last(
		String uuid, OrderByComparator<Round> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the rounds before and after the current round in the ordered set where uuid = &#63;.
	 *
	 * @param roundId the primary key of the current round
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next round
	 * @throws NoSuchRoundException if a round with the primary key could not be found
	 */
	public static Round[] findByUuid_PrevAndNext(
			long roundId, String uuid,
			OrderByComparator<Round> orderByComparator)
		throws it.bastianelli.personale.burraco.exception.NoSuchRoundException {

		return getPersistence().findByUuid_PrevAndNext(
			roundId, uuid, orderByComparator);
	}

	/**
	 * Removes all the rounds where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of rounds where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching rounds
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the round where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchRoundException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching round
	 * @throws NoSuchRoundException if a matching round could not be found
	 */
	public static Round findByUUID_G(String uuid, long groupId)
		throws it.bastianelli.personale.burraco.exception.NoSuchRoundException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the round where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching round, or <code>null</code> if a matching round could not be found
	 */
	public static Round fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the round where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching round, or <code>null</code> if a matching round could not be found
	 */
	public static Round fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the round where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the round that was removed
	 */
	public static Round removeByUUID_G(String uuid, long groupId)
		throws it.bastianelli.personale.burraco.exception.NoSuchRoundException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of rounds where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching rounds
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the rounds where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching rounds
	 */
	public static List<Round> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the rounds where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoundModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of rounds
	 * @param end the upper bound of the range of rounds (not inclusive)
	 * @return the range of matching rounds
	 */
	public static List<Round> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the rounds where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoundModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of rounds
	 * @param end the upper bound of the range of rounds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rounds
	 */
	public static List<Round> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Round> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the rounds where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoundModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of rounds
	 * @param end the upper bound of the range of rounds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching rounds
	 */
	public static List<Round> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Round> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first round in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching round
	 * @throws NoSuchRoundException if a matching round could not be found
	 */
	public static Round findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Round> orderByComparator)
		throws it.bastianelli.personale.burraco.exception.NoSuchRoundException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first round in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching round, or <code>null</code> if a matching round could not be found
	 */
	public static Round fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Round> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last round in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching round
	 * @throws NoSuchRoundException if a matching round could not be found
	 */
	public static Round findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Round> orderByComparator)
		throws it.bastianelli.personale.burraco.exception.NoSuchRoundException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last round in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching round, or <code>null</code> if a matching round could not be found
	 */
	public static Round fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Round> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the rounds before and after the current round in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param roundId the primary key of the current round
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next round
	 * @throws NoSuchRoundException if a round with the primary key could not be found
	 */
	public static Round[] findByUuid_C_PrevAndNext(
			long roundId, String uuid, long companyId,
			OrderByComparator<Round> orderByComparator)
		throws it.bastianelli.personale.burraco.exception.NoSuchRoundException {

		return getPersistence().findByUuid_C_PrevAndNext(
			roundId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the rounds where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of rounds where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching rounds
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the rounds where gameId = &#63;.
	 *
	 * @param gameId the game ID
	 * @return the matching rounds
	 */
	public static List<Round> findByGameId(long gameId) {
		return getPersistence().findByGameId(gameId);
	}

	/**
	 * Returns a range of all the rounds where gameId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoundModelImpl</code>.
	 * </p>
	 *
	 * @param gameId the game ID
	 * @param start the lower bound of the range of rounds
	 * @param end the upper bound of the range of rounds (not inclusive)
	 * @return the range of matching rounds
	 */
	public static List<Round> findByGameId(long gameId, int start, int end) {
		return getPersistence().findByGameId(gameId, start, end);
	}

	/**
	 * Returns an ordered range of all the rounds where gameId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoundModelImpl</code>.
	 * </p>
	 *
	 * @param gameId the game ID
	 * @param start the lower bound of the range of rounds
	 * @param end the upper bound of the range of rounds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rounds
	 */
	public static List<Round> findByGameId(
		long gameId, int start, int end,
		OrderByComparator<Round> orderByComparator) {

		return getPersistence().findByGameId(
			gameId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the rounds where gameId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoundModelImpl</code>.
	 * </p>
	 *
	 * @param gameId the game ID
	 * @param start the lower bound of the range of rounds
	 * @param end the upper bound of the range of rounds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching rounds
	 */
	public static List<Round> findByGameId(
		long gameId, int start, int end,
		OrderByComparator<Round> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByGameId(
			gameId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first round in the ordered set where gameId = &#63;.
	 *
	 * @param gameId the game ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching round
	 * @throws NoSuchRoundException if a matching round could not be found
	 */
	public static Round findByGameId_First(
			long gameId, OrderByComparator<Round> orderByComparator)
		throws it.bastianelli.personale.burraco.exception.NoSuchRoundException {

		return getPersistence().findByGameId_First(gameId, orderByComparator);
	}

	/**
	 * Returns the first round in the ordered set where gameId = &#63;.
	 *
	 * @param gameId the game ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching round, or <code>null</code> if a matching round could not be found
	 */
	public static Round fetchByGameId_First(
		long gameId, OrderByComparator<Round> orderByComparator) {

		return getPersistence().fetchByGameId_First(gameId, orderByComparator);
	}

	/**
	 * Returns the last round in the ordered set where gameId = &#63;.
	 *
	 * @param gameId the game ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching round
	 * @throws NoSuchRoundException if a matching round could not be found
	 */
	public static Round findByGameId_Last(
			long gameId, OrderByComparator<Round> orderByComparator)
		throws it.bastianelli.personale.burraco.exception.NoSuchRoundException {

		return getPersistence().findByGameId_Last(gameId, orderByComparator);
	}

	/**
	 * Returns the last round in the ordered set where gameId = &#63;.
	 *
	 * @param gameId the game ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching round, or <code>null</code> if a matching round could not be found
	 */
	public static Round fetchByGameId_Last(
		long gameId, OrderByComparator<Round> orderByComparator) {

		return getPersistence().fetchByGameId_Last(gameId, orderByComparator);
	}

	/**
	 * Returns the rounds before and after the current round in the ordered set where gameId = &#63;.
	 *
	 * @param roundId the primary key of the current round
	 * @param gameId the game ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next round
	 * @throws NoSuchRoundException if a round with the primary key could not be found
	 */
	public static Round[] findByGameId_PrevAndNext(
			long roundId, long gameId,
			OrderByComparator<Round> orderByComparator)
		throws it.bastianelli.personale.burraco.exception.NoSuchRoundException {

		return getPersistence().findByGameId_PrevAndNext(
			roundId, gameId, orderByComparator);
	}

	/**
	 * Removes all the rounds where gameId = &#63; from the database.
	 *
	 * @param gameId the game ID
	 */
	public static void removeByGameId(long gameId) {
		getPersistence().removeByGameId(gameId);
	}

	/**
	 * Returns the number of rounds where gameId = &#63;.
	 *
	 * @param gameId the game ID
	 * @return the number of matching rounds
	 */
	public static int countByGameId(long gameId) {
		return getPersistence().countByGameId(gameId);
	}

	/**
	 * Caches the round in the entity cache if it is enabled.
	 *
	 * @param round the round
	 */
	public static void cacheResult(Round round) {
		getPersistence().cacheResult(round);
	}

	/**
	 * Caches the rounds in the entity cache if it is enabled.
	 *
	 * @param rounds the rounds
	 */
	public static void cacheResult(List<Round> rounds) {
		getPersistence().cacheResult(rounds);
	}

	/**
	 * Creates a new round with the primary key. Does not add the round to the database.
	 *
	 * @param roundId the primary key for the new round
	 * @return the new round
	 */
	public static Round create(long roundId) {
		return getPersistence().create(roundId);
	}

	/**
	 * Removes the round with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param roundId the primary key of the round
	 * @return the round that was removed
	 * @throws NoSuchRoundException if a round with the primary key could not be found
	 */
	public static Round remove(long roundId)
		throws it.bastianelli.personale.burraco.exception.NoSuchRoundException {

		return getPersistence().remove(roundId);
	}

	public static Round updateImpl(Round round) {
		return getPersistence().updateImpl(round);
	}

	/**
	 * Returns the round with the primary key or throws a <code>NoSuchRoundException</code> if it could not be found.
	 *
	 * @param roundId the primary key of the round
	 * @return the round
	 * @throws NoSuchRoundException if a round with the primary key could not be found
	 */
	public static Round findByPrimaryKey(long roundId)
		throws it.bastianelli.personale.burraco.exception.NoSuchRoundException {

		return getPersistence().findByPrimaryKey(roundId);
	}

	/**
	 * Returns the round with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param roundId the primary key of the round
	 * @return the round, or <code>null</code> if a round with the primary key could not be found
	 */
	public static Round fetchByPrimaryKey(long roundId) {
		return getPersistence().fetchByPrimaryKey(roundId);
	}

	/**
	 * Returns all the rounds.
	 *
	 * @return the rounds
	 */
	public static List<Round> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the rounds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoundModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rounds
	 * @param end the upper bound of the range of rounds (not inclusive)
	 * @return the range of rounds
	 */
	public static List<Round> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the rounds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoundModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rounds
	 * @param end the upper bound of the range of rounds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rounds
	 */
	public static List<Round> findAll(
		int start, int end, OrderByComparator<Round> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the rounds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoundModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rounds
	 * @param end the upper bound of the range of rounds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of rounds
	 */
	public static List<Round> findAll(
		int start, int end, OrderByComparator<Round> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the rounds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of rounds.
	 *
	 * @return the number of rounds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static RoundPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<RoundPersistence, RoundPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(RoundPersistence.class);

		ServiceTracker<RoundPersistence, RoundPersistence> serviceTracker =
			new ServiceTracker<RoundPersistence, RoundPersistence>(
				bundle.getBundleContext(), RoundPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}