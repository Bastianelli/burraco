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

package it.bastianelli.personale.burraco.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Game. This utility wraps
 * <code>it.bastianelli.personale.burraco.service.impl.GameLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see GameLocalService
 * @generated
 */
public class GameLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>it.bastianelli.personale.burraco.service.impl.GameLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the game to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GameLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param game the game
	 * @return the game that was added
	 */
	public static it.bastianelli.personale.burraco.model.Game addGame(
		it.bastianelli.personale.burraco.model.Game game) {

		return getService().addGame(game);
	}

	public static it.bastianelli.personale.burraco.model.Game addGame(
			long userId, long opponentId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addGame(userId, opponentId, serviceContext);
	}

	/**
	 * Creates a new game with the primary key. Does not add the game to the database.
	 *
	 * @param gameId the primary key for the new game
	 * @return the new game
	 */
	public static it.bastianelli.personale.burraco.model.Game createGame(
		long gameId) {

		return getService().createGame(gameId);
	}

	/**
	 * Deletes the game from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GameLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param game the game
	 * @return the game that was removed
	 */
	public static it.bastianelli.personale.burraco.model.Game deleteGame(
		it.bastianelli.personale.burraco.model.Game game) {

		return getService().deleteGame(game);
	}

	/**
	 * Deletes the game with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GameLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param gameId the primary key of the game
	 * @return the game that was removed
	 * @throws PortalException if a game with the primary key could not be found
	 */
	public static it.bastianelli.personale.burraco.model.Game deleteGame(
			long gameId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteGame(gameId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.bastianelli.personale.burraco.model.impl.GameModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.bastianelli.personale.burraco.model.impl.GameModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static it.bastianelli.personale.burraco.model.Game fetchGame(
		long gameId) {

		return getService().fetchGame(gameId);
	}

	/**
	 * Returns the game matching the UUID and group.
	 *
	 * @param uuid the game's UUID
	 * @param groupId the primary key of the group
	 * @return the matching game, or <code>null</code> if a matching game could not be found
	 */
	public static it.bastianelli.personale.burraco.model.Game
		fetchGameByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchGameByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	/**
	 * Returns the game with the primary key.
	 *
	 * @param gameId the primary key of the game
	 * @return the game
	 * @throws PortalException if a game with the primary key could not be found
	 */
	public static it.bastianelli.personale.burraco.model.Game getGame(
			long gameId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getGame(gameId);
	}

	/**
	 * Returns the game matching the UUID and group.
	 *
	 * @param uuid the game's UUID
	 * @param groupId the primary key of the group
	 * @return the matching game
	 * @throws PortalException if a matching game could not be found
	 */
	public static it.bastianelli.personale.burraco.model.Game
			getGameByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getGameByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the games.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.bastianelli.personale.burraco.model.impl.GameModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of games
	 * @param end the upper bound of the range of games (not inclusive)
	 * @return the range of games
	 */
	public static java.util.List<it.bastianelli.personale.burraco.model.Game>
		getGames(int start, int end) {

		return getService().getGames(start, end);
	}

	public static java.util.List<it.bastianelli.personale.burraco.model.Game>
		getGames(long userId) {

		return getService().getGames(userId);
	}

	public static java.util.List<it.bastianelli.personale.burraco.model.Game>
		getGames(long userId, int start, int end) {

		return getService().getGames(userId, start, end);
	}

	public static java.util.List<it.bastianelli.personale.burraco.model.Game>
		getGames(
			long userId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<it.bastianelli.personale.burraco.model.Game> obc) {

		return getService().getGames(userId, start, end, obc);
	}

	/**
	 * Returns all the games matching the UUID and company.
	 *
	 * @param uuid the UUID of the games
	 * @param companyId the primary key of the company
	 * @return the matching games, or an empty list if no matches were found
	 */
	public static java.util.List<it.bastianelli.personale.burraco.model.Game>
		getGamesByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getGamesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of games matching the UUID and company.
	 *
	 * @param uuid the UUID of the games
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of games
	 * @param end the upper bound of the range of games (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching games, or an empty list if no matches were found
	 */
	public static java.util.List<it.bastianelli.personale.burraco.model.Game>
		getGamesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<it.bastianelli.personale.burraco.model.Game>
					orderByComparator) {

		return getService().getGamesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of games.
	 *
	 * @return the number of games
	 */
	public static int getGamesCount() {
		return getService().getGamesCount();
	}

	public static int getGamesCount(long userId) {
		return getService().getGamesCount(userId);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the game in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GameLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param game the game
	 * @return the game that was updated
	 */
	public static it.bastianelli.personale.burraco.model.Game updateGame(
		it.bastianelli.personale.burraco.model.Game game) {

		return getService().updateGame(game);
	}

	public static GameLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<GameLocalService, GameLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(GameLocalService.class);

		ServiceTracker<GameLocalService, GameLocalService> serviceTracker =
			new ServiceTracker<GameLocalService, GameLocalService>(
				bundle.getBundleContext(), GameLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}