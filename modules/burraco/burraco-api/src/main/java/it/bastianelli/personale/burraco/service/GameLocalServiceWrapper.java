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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link GameLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see GameLocalService
 * @generated
 */
public class GameLocalServiceWrapper
	implements GameLocalService, ServiceWrapper<GameLocalService> {

	public GameLocalServiceWrapper(GameLocalService gameLocalService) {
		_gameLocalService = gameLocalService;
	}

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
	@Override
	public it.bastianelli.personale.burraco.model.Game addGame(
		it.bastianelli.personale.burraco.model.Game game) {

		return _gameLocalService.addGame(game);
	}

	@Override
	public it.bastianelli.personale.burraco.model.Game addGame(
			long userId, long opponentId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _gameLocalService.addGame(userId, opponentId, serviceContext);
	}

	/**
	 * Creates a new game with the primary key. Does not add the game to the database.
	 *
	 * @param gameId the primary key for the new game
	 * @return the new game
	 */
	@Override
	public it.bastianelli.personale.burraco.model.Game createGame(long gameId) {
		return _gameLocalService.createGame(gameId);
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
	@Override
	public it.bastianelli.personale.burraco.model.Game deleteGame(
		it.bastianelli.personale.burraco.model.Game game) {

		return _gameLocalService.deleteGame(game);
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
	@Override
	public it.bastianelli.personale.burraco.model.Game deleteGame(long gameId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _gameLocalService.deleteGame(gameId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _gameLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _gameLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _gameLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _gameLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _gameLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _gameLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _gameLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public it.bastianelli.personale.burraco.model.Game fetchGame(long gameId) {
		return _gameLocalService.fetchGame(gameId);
	}

	/**
	 * Returns the game matching the UUID and group.
	 *
	 * @param uuid the game's UUID
	 * @param groupId the primary key of the group
	 * @return the matching game, or <code>null</code> if a matching game could not be found
	 */
	@Override
	public it.bastianelli.personale.burraco.model.Game
		fetchGameByUuidAndGroupId(String uuid, long groupId) {

		return _gameLocalService.fetchGameByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _gameLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _gameLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	/**
	 * Returns the game with the primary key.
	 *
	 * @param gameId the primary key of the game
	 * @return the game
	 * @throws PortalException if a game with the primary key could not be found
	 */
	@Override
	public it.bastianelli.personale.burraco.model.Game getGame(long gameId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _gameLocalService.getGame(gameId);
	}

	/**
	 * Returns the game matching the UUID and group.
	 *
	 * @param uuid the game's UUID
	 * @param groupId the primary key of the group
	 * @return the matching game
	 * @throws PortalException if a matching game could not be found
	 */
	@Override
	public it.bastianelli.personale.burraco.model.Game getGameByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _gameLocalService.getGameByUuidAndGroupId(uuid, groupId);
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
	@Override
	public java.util.List<it.bastianelli.personale.burraco.model.Game> getGames(
		int start, int end) {

		return _gameLocalService.getGames(start, end);
	}

	@Override
	public java.util.List<it.bastianelli.personale.burraco.model.Game> getGames(
		long userId) {

		return _gameLocalService.getGames(userId);
	}

	@Override
	public java.util.List<it.bastianelli.personale.burraco.model.Game> getGames(
		long userId, int start, int end) {

		return _gameLocalService.getGames(userId, start, end);
	}

	@Override
	public java.util.List<it.bastianelli.personale.burraco.model.Game> getGames(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<it.bastianelli.personale.burraco.model.Game> obc) {

		return _gameLocalService.getGames(userId, start, end, obc);
	}

	/**
	 * Returns all the games matching the UUID and company.
	 *
	 * @param uuid the UUID of the games
	 * @param companyId the primary key of the company
	 * @return the matching games, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<it.bastianelli.personale.burraco.model.Game>
		getGamesByUuidAndCompanyId(String uuid, long companyId) {

		return _gameLocalService.getGamesByUuidAndCompanyId(uuid, companyId);
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
	@Override
	public java.util.List<it.bastianelli.personale.burraco.model.Game>
		getGamesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<it.bastianelli.personale.burraco.model.Game>
					orderByComparator) {

		return _gameLocalService.getGamesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of games.
	 *
	 * @return the number of games
	 */
	@Override
	public int getGamesCount() {
		return _gameLocalService.getGamesCount();
	}

	@Override
	public int getGamesCount(long userId) {
		return _gameLocalService.getGamesCount(userId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _gameLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _gameLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _gameLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public it.bastianelli.personale.burraco.model.Game updateGame(
		it.bastianelli.personale.burraco.model.Game game) {

		return _gameLocalService.updateGame(game);
	}

	@Override
	public GameLocalService getWrappedService() {
		return _gameLocalService;
	}

	@Override
	public void setWrappedService(GameLocalService gameLocalService) {
		_gameLocalService = gameLocalService;
	}

	private GameLocalService _gameLocalService;

}