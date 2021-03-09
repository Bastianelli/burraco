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

import it.bastianelli.personale.burraco.model.Game;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the game service. This utility wraps <code>it.bastianelli.personale.burraco.service.persistence.impl.GamePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GamePersistence
 * @generated
 */
public class GameUtil {

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
	public static void clearCache(Game game) {
		getPersistence().clearCache(game);
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
	public static Map<Serializable, Game> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Game> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Game> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Game> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Game> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Game update(Game game) {
		return getPersistence().update(game);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Game update(Game game, ServiceContext serviceContext) {
		return getPersistence().update(game, serviceContext);
	}

	/**
	 * Returns all the games where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching games
	 */
	public static List<Game> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the games where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GameModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of games
	 * @param end the upper bound of the range of games (not inclusive)
	 * @return the range of matching games
	 */
	public static List<Game> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the games where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GameModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of games
	 * @param end the upper bound of the range of games (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching games
	 */
	public static List<Game> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Game> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the games where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GameModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of games
	 * @param end the upper bound of the range of games (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching games
	 */
	public static List<Game> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Game> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first game in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching game
	 * @throws NoSuchGameException if a matching game could not be found
	 */
	public static Game findByUuid_First(
			String uuid, OrderByComparator<Game> orderByComparator)
		throws it.bastianelli.personale.burraco.exception.NoSuchGameException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first game in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching game, or <code>null</code> if a matching game could not be found
	 */
	public static Game fetchByUuid_First(
		String uuid, OrderByComparator<Game> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last game in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching game
	 * @throws NoSuchGameException if a matching game could not be found
	 */
	public static Game findByUuid_Last(
			String uuid, OrderByComparator<Game> orderByComparator)
		throws it.bastianelli.personale.burraco.exception.NoSuchGameException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last game in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching game, or <code>null</code> if a matching game could not be found
	 */
	public static Game fetchByUuid_Last(
		String uuid, OrderByComparator<Game> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the games before and after the current game in the ordered set where uuid = &#63;.
	 *
	 * @param gameId the primary key of the current game
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next game
	 * @throws NoSuchGameException if a game with the primary key could not be found
	 */
	public static Game[] findByUuid_PrevAndNext(
			long gameId, String uuid, OrderByComparator<Game> orderByComparator)
		throws it.bastianelli.personale.burraco.exception.NoSuchGameException {

		return getPersistence().findByUuid_PrevAndNext(
			gameId, uuid, orderByComparator);
	}

	/**
	 * Removes all the games where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of games where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching games
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the game where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchGameException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching game
	 * @throws NoSuchGameException if a matching game could not be found
	 */
	public static Game findByUUID_G(String uuid, long groupId)
		throws it.bastianelli.personale.burraco.exception.NoSuchGameException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the game where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching game, or <code>null</code> if a matching game could not be found
	 */
	public static Game fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the game where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching game, or <code>null</code> if a matching game could not be found
	 */
	public static Game fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the game where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the game that was removed
	 */
	public static Game removeByUUID_G(String uuid, long groupId)
		throws it.bastianelli.personale.burraco.exception.NoSuchGameException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of games where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching games
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the games where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching games
	 */
	public static List<Game> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the games where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GameModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of games
	 * @param end the upper bound of the range of games (not inclusive)
	 * @return the range of matching games
	 */
	public static List<Game> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the games where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GameModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of games
	 * @param end the upper bound of the range of games (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching games
	 */
	public static List<Game> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Game> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the games where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GameModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of games
	 * @param end the upper bound of the range of games (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching games
	 */
	public static List<Game> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Game> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first game in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching game
	 * @throws NoSuchGameException if a matching game could not be found
	 */
	public static Game findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Game> orderByComparator)
		throws it.bastianelli.personale.burraco.exception.NoSuchGameException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first game in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching game, or <code>null</code> if a matching game could not be found
	 */
	public static Game fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Game> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last game in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching game
	 * @throws NoSuchGameException if a matching game could not be found
	 */
	public static Game findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Game> orderByComparator)
		throws it.bastianelli.personale.burraco.exception.NoSuchGameException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last game in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching game, or <code>null</code> if a matching game could not be found
	 */
	public static Game fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Game> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the games before and after the current game in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param gameId the primary key of the current game
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next game
	 * @throws NoSuchGameException if a game with the primary key could not be found
	 */
	public static Game[] findByUuid_C_PrevAndNext(
			long gameId, String uuid, long companyId,
			OrderByComparator<Game> orderByComparator)
		throws it.bastianelli.personale.burraco.exception.NoSuchGameException {

		return getPersistence().findByUuid_C_PrevAndNext(
			gameId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the games where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of games where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching games
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the games where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching games
	 */
	public static List<Game> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	 * Returns a range of all the games where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GameModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of games
	 * @param end the upper bound of the range of games (not inclusive)
	 * @return the range of matching games
	 */
	public static List<Game> findByUserId(long userId, int start, int end) {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	 * Returns an ordered range of all the games where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GameModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of games
	 * @param end the upper bound of the range of games (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching games
	 */
	public static List<Game> findByUserId(
		long userId, int start, int end,
		OrderByComparator<Game> orderByComparator) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the games where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GameModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of games
	 * @param end the upper bound of the range of games (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching games
	 */
	public static List<Game> findByUserId(
		long userId, int start, int end,
		OrderByComparator<Game> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first game in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching game
	 * @throws NoSuchGameException if a matching game could not be found
	 */
	public static Game findByUserId_First(
			long userId, OrderByComparator<Game> orderByComparator)
		throws it.bastianelli.personale.burraco.exception.NoSuchGameException {

		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the first game in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching game, or <code>null</code> if a matching game could not be found
	 */
	public static Game fetchByUserId_First(
		long userId, OrderByComparator<Game> orderByComparator) {

		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the last game in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching game
	 * @throws NoSuchGameException if a matching game could not be found
	 */
	public static Game findByUserId_Last(
			long userId, OrderByComparator<Game> orderByComparator)
		throws it.bastianelli.personale.burraco.exception.NoSuchGameException {

		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the last game in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching game, or <code>null</code> if a matching game could not be found
	 */
	public static Game fetchByUserId_Last(
		long userId, OrderByComparator<Game> orderByComparator) {

		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the games before and after the current game in the ordered set where userId = &#63;.
	 *
	 * @param gameId the primary key of the current game
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next game
	 * @throws NoSuchGameException if a game with the primary key could not be found
	 */
	public static Game[] findByUserId_PrevAndNext(
			long gameId, long userId, OrderByComparator<Game> orderByComparator)
		throws it.bastianelli.personale.burraco.exception.NoSuchGameException {

		return getPersistence().findByUserId_PrevAndNext(
			gameId, userId, orderByComparator);
	}

	/**
	 * Removes all the games where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	 * Returns the number of games where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching games
	 */
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	 * Returns all the games where userId = &#63; and result = &#63;.
	 *
	 * @param userId the user ID
	 * @param result the result
	 * @return the matching games
	 */
	public static List<Game> findByU_R(long userId, String result) {
		return getPersistence().findByU_R(userId, result);
	}

	/**
	 * Returns a range of all the games where userId = &#63; and result = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GameModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param result the result
	 * @param start the lower bound of the range of games
	 * @param end the upper bound of the range of games (not inclusive)
	 * @return the range of matching games
	 */
	public static List<Game> findByU_R(
		long userId, String result, int start, int end) {

		return getPersistence().findByU_R(userId, result, start, end);
	}

	/**
	 * Returns an ordered range of all the games where userId = &#63; and result = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GameModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param result the result
	 * @param start the lower bound of the range of games
	 * @param end the upper bound of the range of games (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching games
	 */
	public static List<Game> findByU_R(
		long userId, String result, int start, int end,
		OrderByComparator<Game> orderByComparator) {

		return getPersistence().findByU_R(
			userId, result, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the games where userId = &#63; and result = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GameModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param result the result
	 * @param start the lower bound of the range of games
	 * @param end the upper bound of the range of games (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching games
	 */
	public static List<Game> findByU_R(
		long userId, String result, int start, int end,
		OrderByComparator<Game> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByU_R(
			userId, result, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first game in the ordered set where userId = &#63; and result = &#63;.
	 *
	 * @param userId the user ID
	 * @param result the result
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching game
	 * @throws NoSuchGameException if a matching game could not be found
	 */
	public static Game findByU_R_First(
			long userId, String result,
			OrderByComparator<Game> orderByComparator)
		throws it.bastianelli.personale.burraco.exception.NoSuchGameException {

		return getPersistence().findByU_R_First(
			userId, result, orderByComparator);
	}

	/**
	 * Returns the first game in the ordered set where userId = &#63; and result = &#63;.
	 *
	 * @param userId the user ID
	 * @param result the result
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching game, or <code>null</code> if a matching game could not be found
	 */
	public static Game fetchByU_R_First(
		long userId, String result, OrderByComparator<Game> orderByComparator) {

		return getPersistence().fetchByU_R_First(
			userId, result, orderByComparator);
	}

	/**
	 * Returns the last game in the ordered set where userId = &#63; and result = &#63;.
	 *
	 * @param userId the user ID
	 * @param result the result
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching game
	 * @throws NoSuchGameException if a matching game could not be found
	 */
	public static Game findByU_R_Last(
			long userId, String result,
			OrderByComparator<Game> orderByComparator)
		throws it.bastianelli.personale.burraco.exception.NoSuchGameException {

		return getPersistence().findByU_R_Last(
			userId, result, orderByComparator);
	}

	/**
	 * Returns the last game in the ordered set where userId = &#63; and result = &#63;.
	 *
	 * @param userId the user ID
	 * @param result the result
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching game, or <code>null</code> if a matching game could not be found
	 */
	public static Game fetchByU_R_Last(
		long userId, String result, OrderByComparator<Game> orderByComparator) {

		return getPersistence().fetchByU_R_Last(
			userId, result, orderByComparator);
	}

	/**
	 * Returns the games before and after the current game in the ordered set where userId = &#63; and result = &#63;.
	 *
	 * @param gameId the primary key of the current game
	 * @param userId the user ID
	 * @param result the result
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next game
	 * @throws NoSuchGameException if a game with the primary key could not be found
	 */
	public static Game[] findByU_R_PrevAndNext(
			long gameId, long userId, String result,
			OrderByComparator<Game> orderByComparator)
		throws it.bastianelli.personale.burraco.exception.NoSuchGameException {

		return getPersistence().findByU_R_PrevAndNext(
			gameId, userId, result, orderByComparator);
	}

	/**
	 * Removes all the games where userId = &#63; and result = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param result the result
	 */
	public static void removeByU_R(long userId, String result) {
		getPersistence().removeByU_R(userId, result);
	}

	/**
	 * Returns the number of games where userId = &#63; and result = &#63;.
	 *
	 * @param userId the user ID
	 * @param result the result
	 * @return the number of matching games
	 */
	public static int countByU_R(long userId, String result) {
		return getPersistence().countByU_R(userId, result);
	}

	/**
	 * Returns all the games where userId = &#63; and opponentId = &#63;.
	 *
	 * @param userId the user ID
	 * @param opponentId the opponent ID
	 * @return the matching games
	 */
	public static List<Game> findByU_O(long userId, long opponentId) {
		return getPersistence().findByU_O(userId, opponentId);
	}

	/**
	 * Returns a range of all the games where userId = &#63; and opponentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GameModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param opponentId the opponent ID
	 * @param start the lower bound of the range of games
	 * @param end the upper bound of the range of games (not inclusive)
	 * @return the range of matching games
	 */
	public static List<Game> findByU_O(
		long userId, long opponentId, int start, int end) {

		return getPersistence().findByU_O(userId, opponentId, start, end);
	}

	/**
	 * Returns an ordered range of all the games where userId = &#63; and opponentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GameModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param opponentId the opponent ID
	 * @param start the lower bound of the range of games
	 * @param end the upper bound of the range of games (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching games
	 */
	public static List<Game> findByU_O(
		long userId, long opponentId, int start, int end,
		OrderByComparator<Game> orderByComparator) {

		return getPersistence().findByU_O(
			userId, opponentId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the games where userId = &#63; and opponentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GameModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param opponentId the opponent ID
	 * @param start the lower bound of the range of games
	 * @param end the upper bound of the range of games (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching games
	 */
	public static List<Game> findByU_O(
		long userId, long opponentId, int start, int end,
		OrderByComparator<Game> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByU_O(
			userId, opponentId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first game in the ordered set where userId = &#63; and opponentId = &#63;.
	 *
	 * @param userId the user ID
	 * @param opponentId the opponent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching game
	 * @throws NoSuchGameException if a matching game could not be found
	 */
	public static Game findByU_O_First(
			long userId, long opponentId,
			OrderByComparator<Game> orderByComparator)
		throws it.bastianelli.personale.burraco.exception.NoSuchGameException {

		return getPersistence().findByU_O_First(
			userId, opponentId, orderByComparator);
	}

	/**
	 * Returns the first game in the ordered set where userId = &#63; and opponentId = &#63;.
	 *
	 * @param userId the user ID
	 * @param opponentId the opponent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching game, or <code>null</code> if a matching game could not be found
	 */
	public static Game fetchByU_O_First(
		long userId, long opponentId,
		OrderByComparator<Game> orderByComparator) {

		return getPersistence().fetchByU_O_First(
			userId, opponentId, orderByComparator);
	}

	/**
	 * Returns the last game in the ordered set where userId = &#63; and opponentId = &#63;.
	 *
	 * @param userId the user ID
	 * @param opponentId the opponent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching game
	 * @throws NoSuchGameException if a matching game could not be found
	 */
	public static Game findByU_O_Last(
			long userId, long opponentId,
			OrderByComparator<Game> orderByComparator)
		throws it.bastianelli.personale.burraco.exception.NoSuchGameException {

		return getPersistence().findByU_O_Last(
			userId, opponentId, orderByComparator);
	}

	/**
	 * Returns the last game in the ordered set where userId = &#63; and opponentId = &#63;.
	 *
	 * @param userId the user ID
	 * @param opponentId the opponent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching game, or <code>null</code> if a matching game could not be found
	 */
	public static Game fetchByU_O_Last(
		long userId, long opponentId,
		OrderByComparator<Game> orderByComparator) {

		return getPersistence().fetchByU_O_Last(
			userId, opponentId, orderByComparator);
	}

	/**
	 * Returns the games before and after the current game in the ordered set where userId = &#63; and opponentId = &#63;.
	 *
	 * @param gameId the primary key of the current game
	 * @param userId the user ID
	 * @param opponentId the opponent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next game
	 * @throws NoSuchGameException if a game with the primary key could not be found
	 */
	public static Game[] findByU_O_PrevAndNext(
			long gameId, long userId, long opponentId,
			OrderByComparator<Game> orderByComparator)
		throws it.bastianelli.personale.burraco.exception.NoSuchGameException {

		return getPersistence().findByU_O_PrevAndNext(
			gameId, userId, opponentId, orderByComparator);
	}

	/**
	 * Removes all the games where userId = &#63; and opponentId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param opponentId the opponent ID
	 */
	public static void removeByU_O(long userId, long opponentId) {
		getPersistence().removeByU_O(userId, opponentId);
	}

	/**
	 * Returns the number of games where userId = &#63; and opponentId = &#63;.
	 *
	 * @param userId the user ID
	 * @param opponentId the opponent ID
	 * @return the number of matching games
	 */
	public static int countByU_O(long userId, long opponentId) {
		return getPersistence().countByU_O(userId, opponentId);
	}

	/**
	 * Returns all the games where userId = &#63; and state = &#63;.
	 *
	 * @param userId the user ID
	 * @param state the state
	 * @return the matching games
	 */
	public static List<Game> findByU_S(long userId, String state) {
		return getPersistence().findByU_S(userId, state);
	}

	/**
	 * Returns a range of all the games where userId = &#63; and state = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GameModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param state the state
	 * @param start the lower bound of the range of games
	 * @param end the upper bound of the range of games (not inclusive)
	 * @return the range of matching games
	 */
	public static List<Game> findByU_S(
		long userId, String state, int start, int end) {

		return getPersistence().findByU_S(userId, state, start, end);
	}

	/**
	 * Returns an ordered range of all the games where userId = &#63; and state = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GameModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param state the state
	 * @param start the lower bound of the range of games
	 * @param end the upper bound of the range of games (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching games
	 */
	public static List<Game> findByU_S(
		long userId, String state, int start, int end,
		OrderByComparator<Game> orderByComparator) {

		return getPersistence().findByU_S(
			userId, state, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the games where userId = &#63; and state = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GameModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param state the state
	 * @param start the lower bound of the range of games
	 * @param end the upper bound of the range of games (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching games
	 */
	public static List<Game> findByU_S(
		long userId, String state, int start, int end,
		OrderByComparator<Game> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByU_S(
			userId, state, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first game in the ordered set where userId = &#63; and state = &#63;.
	 *
	 * @param userId the user ID
	 * @param state the state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching game
	 * @throws NoSuchGameException if a matching game could not be found
	 */
	public static Game findByU_S_First(
			long userId, String state,
			OrderByComparator<Game> orderByComparator)
		throws it.bastianelli.personale.burraco.exception.NoSuchGameException {

		return getPersistence().findByU_S_First(
			userId, state, orderByComparator);
	}

	/**
	 * Returns the first game in the ordered set where userId = &#63; and state = &#63;.
	 *
	 * @param userId the user ID
	 * @param state the state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching game, or <code>null</code> if a matching game could not be found
	 */
	public static Game fetchByU_S_First(
		long userId, String state, OrderByComparator<Game> orderByComparator) {

		return getPersistence().fetchByU_S_First(
			userId, state, orderByComparator);
	}

	/**
	 * Returns the last game in the ordered set where userId = &#63; and state = &#63;.
	 *
	 * @param userId the user ID
	 * @param state the state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching game
	 * @throws NoSuchGameException if a matching game could not be found
	 */
	public static Game findByU_S_Last(
			long userId, String state,
			OrderByComparator<Game> orderByComparator)
		throws it.bastianelli.personale.burraco.exception.NoSuchGameException {

		return getPersistence().findByU_S_Last(
			userId, state, orderByComparator);
	}

	/**
	 * Returns the last game in the ordered set where userId = &#63; and state = &#63;.
	 *
	 * @param userId the user ID
	 * @param state the state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching game, or <code>null</code> if a matching game could not be found
	 */
	public static Game fetchByU_S_Last(
		long userId, String state, OrderByComparator<Game> orderByComparator) {

		return getPersistence().fetchByU_S_Last(
			userId, state, orderByComparator);
	}

	/**
	 * Returns the games before and after the current game in the ordered set where userId = &#63; and state = &#63;.
	 *
	 * @param gameId the primary key of the current game
	 * @param userId the user ID
	 * @param state the state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next game
	 * @throws NoSuchGameException if a game with the primary key could not be found
	 */
	public static Game[] findByU_S_PrevAndNext(
			long gameId, long userId, String state,
			OrderByComparator<Game> orderByComparator)
		throws it.bastianelli.personale.burraco.exception.NoSuchGameException {

		return getPersistence().findByU_S_PrevAndNext(
			gameId, userId, state, orderByComparator);
	}

	/**
	 * Removes all the games where userId = &#63; and state = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param state the state
	 */
	public static void removeByU_S(long userId, String state) {
		getPersistence().removeByU_S(userId, state);
	}

	/**
	 * Returns the number of games where userId = &#63; and state = &#63;.
	 *
	 * @param userId the user ID
	 * @param state the state
	 * @return the number of matching games
	 */
	public static int countByU_S(long userId, String state) {
		return getPersistence().countByU_S(userId, state);
	}

	/**
	 * Caches the game in the entity cache if it is enabled.
	 *
	 * @param game the game
	 */
	public static void cacheResult(Game game) {
		getPersistence().cacheResult(game);
	}

	/**
	 * Caches the games in the entity cache if it is enabled.
	 *
	 * @param games the games
	 */
	public static void cacheResult(List<Game> games) {
		getPersistence().cacheResult(games);
	}

	/**
	 * Creates a new game with the primary key. Does not add the game to the database.
	 *
	 * @param gameId the primary key for the new game
	 * @return the new game
	 */
	public static Game create(long gameId) {
		return getPersistence().create(gameId);
	}

	/**
	 * Removes the game with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param gameId the primary key of the game
	 * @return the game that was removed
	 * @throws NoSuchGameException if a game with the primary key could not be found
	 */
	public static Game remove(long gameId)
		throws it.bastianelli.personale.burraco.exception.NoSuchGameException {

		return getPersistence().remove(gameId);
	}

	public static Game updateImpl(Game game) {
		return getPersistence().updateImpl(game);
	}

	/**
	 * Returns the game with the primary key or throws a <code>NoSuchGameException</code> if it could not be found.
	 *
	 * @param gameId the primary key of the game
	 * @return the game
	 * @throws NoSuchGameException if a game with the primary key could not be found
	 */
	public static Game findByPrimaryKey(long gameId)
		throws it.bastianelli.personale.burraco.exception.NoSuchGameException {

		return getPersistence().findByPrimaryKey(gameId);
	}

	/**
	 * Returns the game with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param gameId the primary key of the game
	 * @return the game, or <code>null</code> if a game with the primary key could not be found
	 */
	public static Game fetchByPrimaryKey(long gameId) {
		return getPersistence().fetchByPrimaryKey(gameId);
	}

	/**
	 * Returns all the games.
	 *
	 * @return the games
	 */
	public static List<Game> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the games.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GameModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of games
	 * @param end the upper bound of the range of games (not inclusive)
	 * @return the range of games
	 */
	public static List<Game> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the games.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GameModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of games
	 * @param end the upper bound of the range of games (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of games
	 */
	public static List<Game> findAll(
		int start, int end, OrderByComparator<Game> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the games.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GameModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of games
	 * @param end the upper bound of the range of games (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of games
	 */
	public static List<Game> findAll(
		int start, int end, OrderByComparator<Game> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the games from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of games.
	 *
	 * @return the number of games
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static GamePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<GamePersistence, GamePersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(GamePersistence.class);

		ServiceTracker<GamePersistence, GamePersistence> serviceTracker =
			new ServiceTracker<GamePersistence, GamePersistence>(
				bundle.getBundleContext(), GamePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}