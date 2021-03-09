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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import it.bastianelli.personale.burraco.exception.NoSuchGameException;
import it.bastianelli.personale.burraco.model.Game;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the game service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GameUtil
 * @generated
 */
@ProviderType
public interface GamePersistence extends BasePersistence<Game> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link GameUtil} to access the game persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the games where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching games
	 */
	public java.util.List<Game> findByUuid(String uuid);

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
	public java.util.List<Game> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Game> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Game>
			orderByComparator);

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
	public java.util.List<Game> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Game>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first game in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching game
	 * @throws NoSuchGameException if a matching game could not be found
	 */
	public Game findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Game>
				orderByComparator)
		throws NoSuchGameException;

	/**
	 * Returns the first game in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching game, or <code>null</code> if a matching game could not be found
	 */
	public Game fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Game>
			orderByComparator);

	/**
	 * Returns the last game in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching game
	 * @throws NoSuchGameException if a matching game could not be found
	 */
	public Game findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Game>
				orderByComparator)
		throws NoSuchGameException;

	/**
	 * Returns the last game in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching game, or <code>null</code> if a matching game could not be found
	 */
	public Game fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Game>
			orderByComparator);

	/**
	 * Returns the games before and after the current game in the ordered set where uuid = &#63;.
	 *
	 * @param gameId the primary key of the current game
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next game
	 * @throws NoSuchGameException if a game with the primary key could not be found
	 */
	public Game[] findByUuid_PrevAndNext(
			long gameId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Game>
				orderByComparator)
		throws NoSuchGameException;

	/**
	 * Removes all the games where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of games where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching games
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the game where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchGameException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching game
	 * @throws NoSuchGameException if a matching game could not be found
	 */
	public Game findByUUID_G(String uuid, long groupId)
		throws NoSuchGameException;

	/**
	 * Returns the game where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching game, or <code>null</code> if a matching game could not be found
	 */
	public Game fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the game where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching game, or <code>null</code> if a matching game could not be found
	 */
	public Game fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the game where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the game that was removed
	 */
	public Game removeByUUID_G(String uuid, long groupId)
		throws NoSuchGameException;

	/**
	 * Returns the number of games where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching games
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the games where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching games
	 */
	public java.util.List<Game> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Game> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Game> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Game>
			orderByComparator);

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
	public java.util.List<Game> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Game>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first game in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching game
	 * @throws NoSuchGameException if a matching game could not be found
	 */
	public Game findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Game>
				orderByComparator)
		throws NoSuchGameException;

	/**
	 * Returns the first game in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching game, or <code>null</code> if a matching game could not be found
	 */
	public Game fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Game>
			orderByComparator);

	/**
	 * Returns the last game in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching game
	 * @throws NoSuchGameException if a matching game could not be found
	 */
	public Game findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Game>
				orderByComparator)
		throws NoSuchGameException;

	/**
	 * Returns the last game in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching game, or <code>null</code> if a matching game could not be found
	 */
	public Game fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Game>
			orderByComparator);

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
	public Game[] findByUuid_C_PrevAndNext(
			long gameId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Game>
				orderByComparator)
		throws NoSuchGameException;

	/**
	 * Removes all the games where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of games where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching games
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the games where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching games
	 */
	public java.util.List<Game> findByUserId(long userId);

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
	public java.util.List<Game> findByUserId(long userId, int start, int end);

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
	public java.util.List<Game> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Game>
			orderByComparator);

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
	public java.util.List<Game> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Game>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first game in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching game
	 * @throws NoSuchGameException if a matching game could not be found
	 */
	public Game findByUserId_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Game>
				orderByComparator)
		throws NoSuchGameException;

	/**
	 * Returns the first game in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching game, or <code>null</code> if a matching game could not be found
	 */
	public Game fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Game>
			orderByComparator);

	/**
	 * Returns the last game in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching game
	 * @throws NoSuchGameException if a matching game could not be found
	 */
	public Game findByUserId_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Game>
				orderByComparator)
		throws NoSuchGameException;

	/**
	 * Returns the last game in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching game, or <code>null</code> if a matching game could not be found
	 */
	public Game fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Game>
			orderByComparator);

	/**
	 * Returns the games before and after the current game in the ordered set where userId = &#63;.
	 *
	 * @param gameId the primary key of the current game
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next game
	 * @throws NoSuchGameException if a game with the primary key could not be found
	 */
	public Game[] findByUserId_PrevAndNext(
			long gameId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Game>
				orderByComparator)
		throws NoSuchGameException;

	/**
	 * Removes all the games where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByUserId(long userId);

	/**
	 * Returns the number of games where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching games
	 */
	public int countByUserId(long userId);

	/**
	 * Returns all the games where userId = &#63; and result = &#63;.
	 *
	 * @param userId the user ID
	 * @param result the result
	 * @return the matching games
	 */
	public java.util.List<Game> findByU_R(long userId, String result);

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
	public java.util.List<Game> findByU_R(
		long userId, String result, int start, int end);

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
	public java.util.List<Game> findByU_R(
		long userId, String result, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Game>
			orderByComparator);

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
	public java.util.List<Game> findByU_R(
		long userId, String result, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Game>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first game in the ordered set where userId = &#63; and result = &#63;.
	 *
	 * @param userId the user ID
	 * @param result the result
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching game
	 * @throws NoSuchGameException if a matching game could not be found
	 */
	public Game findByU_R_First(
			long userId, String result,
			com.liferay.portal.kernel.util.OrderByComparator<Game>
				orderByComparator)
		throws NoSuchGameException;

	/**
	 * Returns the first game in the ordered set where userId = &#63; and result = &#63;.
	 *
	 * @param userId the user ID
	 * @param result the result
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching game, or <code>null</code> if a matching game could not be found
	 */
	public Game fetchByU_R_First(
		long userId, String result,
		com.liferay.portal.kernel.util.OrderByComparator<Game>
			orderByComparator);

	/**
	 * Returns the last game in the ordered set where userId = &#63; and result = &#63;.
	 *
	 * @param userId the user ID
	 * @param result the result
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching game
	 * @throws NoSuchGameException if a matching game could not be found
	 */
	public Game findByU_R_Last(
			long userId, String result,
			com.liferay.portal.kernel.util.OrderByComparator<Game>
				orderByComparator)
		throws NoSuchGameException;

	/**
	 * Returns the last game in the ordered set where userId = &#63; and result = &#63;.
	 *
	 * @param userId the user ID
	 * @param result the result
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching game, or <code>null</code> if a matching game could not be found
	 */
	public Game fetchByU_R_Last(
		long userId, String result,
		com.liferay.portal.kernel.util.OrderByComparator<Game>
			orderByComparator);

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
	public Game[] findByU_R_PrevAndNext(
			long gameId, long userId, String result,
			com.liferay.portal.kernel.util.OrderByComparator<Game>
				orderByComparator)
		throws NoSuchGameException;

	/**
	 * Removes all the games where userId = &#63; and result = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param result the result
	 */
	public void removeByU_R(long userId, String result);

	/**
	 * Returns the number of games where userId = &#63; and result = &#63;.
	 *
	 * @param userId the user ID
	 * @param result the result
	 * @return the number of matching games
	 */
	public int countByU_R(long userId, String result);

	/**
	 * Returns all the games where userId = &#63; and opponentId = &#63;.
	 *
	 * @param userId the user ID
	 * @param opponentId the opponent ID
	 * @return the matching games
	 */
	public java.util.List<Game> findByU_O(long userId, long opponentId);

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
	public java.util.List<Game> findByU_O(
		long userId, long opponentId, int start, int end);

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
	public java.util.List<Game> findByU_O(
		long userId, long opponentId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Game>
			orderByComparator);

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
	public java.util.List<Game> findByU_O(
		long userId, long opponentId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Game>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first game in the ordered set where userId = &#63; and opponentId = &#63;.
	 *
	 * @param userId the user ID
	 * @param opponentId the opponent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching game
	 * @throws NoSuchGameException if a matching game could not be found
	 */
	public Game findByU_O_First(
			long userId, long opponentId,
			com.liferay.portal.kernel.util.OrderByComparator<Game>
				orderByComparator)
		throws NoSuchGameException;

	/**
	 * Returns the first game in the ordered set where userId = &#63; and opponentId = &#63;.
	 *
	 * @param userId the user ID
	 * @param opponentId the opponent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching game, or <code>null</code> if a matching game could not be found
	 */
	public Game fetchByU_O_First(
		long userId, long opponentId,
		com.liferay.portal.kernel.util.OrderByComparator<Game>
			orderByComparator);

	/**
	 * Returns the last game in the ordered set where userId = &#63; and opponentId = &#63;.
	 *
	 * @param userId the user ID
	 * @param opponentId the opponent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching game
	 * @throws NoSuchGameException if a matching game could not be found
	 */
	public Game findByU_O_Last(
			long userId, long opponentId,
			com.liferay.portal.kernel.util.OrderByComparator<Game>
				orderByComparator)
		throws NoSuchGameException;

	/**
	 * Returns the last game in the ordered set where userId = &#63; and opponentId = &#63;.
	 *
	 * @param userId the user ID
	 * @param opponentId the opponent ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching game, or <code>null</code> if a matching game could not be found
	 */
	public Game fetchByU_O_Last(
		long userId, long opponentId,
		com.liferay.portal.kernel.util.OrderByComparator<Game>
			orderByComparator);

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
	public Game[] findByU_O_PrevAndNext(
			long gameId, long userId, long opponentId,
			com.liferay.portal.kernel.util.OrderByComparator<Game>
				orderByComparator)
		throws NoSuchGameException;

	/**
	 * Removes all the games where userId = &#63; and opponentId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param opponentId the opponent ID
	 */
	public void removeByU_O(long userId, long opponentId);

	/**
	 * Returns the number of games where userId = &#63; and opponentId = &#63;.
	 *
	 * @param userId the user ID
	 * @param opponentId the opponent ID
	 * @return the number of matching games
	 */
	public int countByU_O(long userId, long opponentId);

	/**
	 * Returns all the games where userId = &#63; and state = &#63;.
	 *
	 * @param userId the user ID
	 * @param state the state
	 * @return the matching games
	 */
	public java.util.List<Game> findByU_S(long userId, String state);

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
	public java.util.List<Game> findByU_S(
		long userId, String state, int start, int end);

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
	public java.util.List<Game> findByU_S(
		long userId, String state, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Game>
			orderByComparator);

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
	public java.util.List<Game> findByU_S(
		long userId, String state, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Game>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first game in the ordered set where userId = &#63; and state = &#63;.
	 *
	 * @param userId the user ID
	 * @param state the state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching game
	 * @throws NoSuchGameException if a matching game could not be found
	 */
	public Game findByU_S_First(
			long userId, String state,
			com.liferay.portal.kernel.util.OrderByComparator<Game>
				orderByComparator)
		throws NoSuchGameException;

	/**
	 * Returns the first game in the ordered set where userId = &#63; and state = &#63;.
	 *
	 * @param userId the user ID
	 * @param state the state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching game, or <code>null</code> if a matching game could not be found
	 */
	public Game fetchByU_S_First(
		long userId, String state,
		com.liferay.portal.kernel.util.OrderByComparator<Game>
			orderByComparator);

	/**
	 * Returns the last game in the ordered set where userId = &#63; and state = &#63;.
	 *
	 * @param userId the user ID
	 * @param state the state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching game
	 * @throws NoSuchGameException if a matching game could not be found
	 */
	public Game findByU_S_Last(
			long userId, String state,
			com.liferay.portal.kernel.util.OrderByComparator<Game>
				orderByComparator)
		throws NoSuchGameException;

	/**
	 * Returns the last game in the ordered set where userId = &#63; and state = &#63;.
	 *
	 * @param userId the user ID
	 * @param state the state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching game, or <code>null</code> if a matching game could not be found
	 */
	public Game fetchByU_S_Last(
		long userId, String state,
		com.liferay.portal.kernel.util.OrderByComparator<Game>
			orderByComparator);

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
	public Game[] findByU_S_PrevAndNext(
			long gameId, long userId, String state,
			com.liferay.portal.kernel.util.OrderByComparator<Game>
				orderByComparator)
		throws NoSuchGameException;

	/**
	 * Removes all the games where userId = &#63; and state = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param state the state
	 */
	public void removeByU_S(long userId, String state);

	/**
	 * Returns the number of games where userId = &#63; and state = &#63;.
	 *
	 * @param userId the user ID
	 * @param state the state
	 * @return the number of matching games
	 */
	public int countByU_S(long userId, String state);

	/**
	 * Caches the game in the entity cache if it is enabled.
	 *
	 * @param game the game
	 */
	public void cacheResult(Game game);

	/**
	 * Caches the games in the entity cache if it is enabled.
	 *
	 * @param games the games
	 */
	public void cacheResult(java.util.List<Game> games);

	/**
	 * Creates a new game with the primary key. Does not add the game to the database.
	 *
	 * @param gameId the primary key for the new game
	 * @return the new game
	 */
	public Game create(long gameId);

	/**
	 * Removes the game with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param gameId the primary key of the game
	 * @return the game that was removed
	 * @throws NoSuchGameException if a game with the primary key could not be found
	 */
	public Game remove(long gameId) throws NoSuchGameException;

	public Game updateImpl(Game game);

	/**
	 * Returns the game with the primary key or throws a <code>NoSuchGameException</code> if it could not be found.
	 *
	 * @param gameId the primary key of the game
	 * @return the game
	 * @throws NoSuchGameException if a game with the primary key could not be found
	 */
	public Game findByPrimaryKey(long gameId) throws NoSuchGameException;

	/**
	 * Returns the game with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param gameId the primary key of the game
	 * @return the game, or <code>null</code> if a game with the primary key could not be found
	 */
	public Game fetchByPrimaryKey(long gameId);

	/**
	 * Returns all the games.
	 *
	 * @return the games
	 */
	public java.util.List<Game> findAll();

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
	public java.util.List<Game> findAll(int start, int end);

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
	public java.util.List<Game> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Game>
			orderByComparator);

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
	public java.util.List<Game> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Game>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the games from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of games.
	 *
	 * @return the number of games
	 */
	public int countAll();

}