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
 * Provides a wrapper for {@link RoundLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RoundLocalService
 * @generated
 */
public class RoundLocalServiceWrapper
	implements RoundLocalService, ServiceWrapper<RoundLocalService> {

	public RoundLocalServiceWrapper(RoundLocalService roundLocalService) {
		_roundLocalService = roundLocalService;
	}

	@Override
	public it.bastianelli.personale.burraco.model.Round addRound(
			long gameId, long userId, long opponentUserId, boolean pot,
			int cleanRun, int dirtyRun, int score, boolean opponentPot,
			int opponentCleanRun, int opponentDirtyRun, int opponentScore,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _roundLocalService.addRound(
			gameId, userId, opponentUserId, pot, cleanRun, dirtyRun, score,
			opponentPot, opponentCleanRun, opponentDirtyRun, opponentScore,
			serviceContext);
	}

	/**
	 * Adds the round to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RoundLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param round the round
	 * @return the round that was added
	 */
	@Override
	public it.bastianelli.personale.burraco.model.Round addRound(
		it.bastianelli.personale.burraco.model.Round round) {

		return _roundLocalService.addRound(round);
	}

	/**
	 * Creates a new round with the primary key. Does not add the round to the database.
	 *
	 * @param roundId the primary key for the new round
	 * @return the new round
	 */
	@Override
	public it.bastianelli.personale.burraco.model.Round createRound(
		long roundId) {

		return _roundLocalService.createRound(roundId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _roundLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the round with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RoundLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param roundId the primary key of the round
	 * @return the round that was removed
	 * @throws PortalException if a round with the primary key could not be found
	 */
	@Override
	public it.bastianelli.personale.burraco.model.Round deleteRound(
			long roundId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _roundLocalService.deleteRound(roundId);
	}

	/**
	 * Deletes the round from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RoundLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param round the round
	 * @return the round that was removed
	 * @throws PortalException
	 */
	@Override
	public it.bastianelli.personale.burraco.model.Round deleteRound(
			it.bastianelli.personale.burraco.model.Round round)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _roundLocalService.deleteRound(round);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _roundLocalService.dynamicQuery();
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

		return _roundLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.bastianelli.personale.burraco.model.impl.RoundModelImpl</code>.
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

		return _roundLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.bastianelli.personale.burraco.model.impl.RoundModelImpl</code>.
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

		return _roundLocalService.dynamicQuery(
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

		return _roundLocalService.dynamicQueryCount(dynamicQuery);
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

		return _roundLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public it.bastianelli.personale.burraco.model.Round fetchRound(
		long roundId) {

		return _roundLocalService.fetchRound(roundId);
	}

	/**
	 * Returns the round matching the UUID and group.
	 *
	 * @param uuid the round's UUID
	 * @param groupId the primary key of the group
	 * @return the matching round, or <code>null</code> if a matching round could not be found
	 */
	@Override
	public it.bastianelli.personale.burraco.model.Round
		fetchRoundByUuidAndGroupId(String uuid, long groupId) {

		return _roundLocalService.fetchRoundByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _roundLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _roundLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _roundLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _roundLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _roundLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the round with the primary key.
	 *
	 * @param roundId the primary key of the round
	 * @return the round
	 * @throws PortalException if a round with the primary key could not be found
	 */
	@Override
	public it.bastianelli.personale.burraco.model.Round getRound(long roundId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _roundLocalService.getRound(roundId);
	}

	/**
	 * Returns the round matching the UUID and group.
	 *
	 * @param uuid the round's UUID
	 * @param groupId the primary key of the group
	 * @return the matching round
	 * @throws PortalException if a matching round could not be found
	 */
	@Override
	public it.bastianelli.personale.burraco.model.Round
			getRoundByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _roundLocalService.getRoundByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public int getRoundCount(long gameId) {
		return _roundLocalService.getRoundCount(gameId);
	}

	/**
	 * Returns a range of all the rounds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.bastianelli.personale.burraco.model.impl.RoundModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rounds
	 * @param end the upper bound of the range of rounds (not inclusive)
	 * @return the range of rounds
	 */
	@Override
	public java.util.List<it.bastianelli.personale.burraco.model.Round>
		getRounds(int start, int end) {

		return _roundLocalService.getRounds(start, end);
	}

	@Override
	public java.util.List<it.bastianelli.personale.burraco.model.Round>
		getRounds(long gameId) {

		return _roundLocalService.getRounds(gameId);
	}

	@Override
	public java.util.List<it.bastianelli.personale.burraco.model.Round>
			getRounds(long gameId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _roundLocalService.getRounds(gameId, start, end);
	}

	@Override
	public java.util.List<it.bastianelli.personale.burraco.model.Round>
		getRounds(
			long gameId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<it.bastianelli.personale.burraco.model.Round> obc) {

		return _roundLocalService.getRounds(gameId, start, end, obc);
	}

	/**
	 * Returns all the rounds matching the UUID and company.
	 *
	 * @param uuid the UUID of the rounds
	 * @param companyId the primary key of the company
	 * @return the matching rounds, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<it.bastianelli.personale.burraco.model.Round>
		getRoundsByUuidAndCompanyId(String uuid, long companyId) {

		return _roundLocalService.getRoundsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of rounds matching the UUID and company.
	 *
	 * @param uuid the UUID of the rounds
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of rounds
	 * @param end the upper bound of the range of rounds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching rounds, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<it.bastianelli.personale.burraco.model.Round>
		getRoundsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<it.bastianelli.personale.burraco.model.Round>
					orderByComparator) {

		return _roundLocalService.getRoundsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rounds.
	 *
	 * @return the number of rounds
	 */
	@Override
	public int getRoundsCount() {
		return _roundLocalService.getRoundsCount();
	}

	@Override
	public it.bastianelli.personale.burraco.model.Round updateRound(
			long roundId, boolean pot, int cleanRun, int dirtyRun, int score,
			boolean opponentPot, int opponentCleanRun, int opponentDirtyRun,
			int opponentScore,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _roundLocalService.updateRound(
			roundId, pot, cleanRun, dirtyRun, score, opponentPot,
			opponentCleanRun, opponentDirtyRun, opponentScore, serviceContext);
	}

	/**
	 * Updates the round in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RoundLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param round the round
	 * @return the round that was updated
	 */
	@Override
	public it.bastianelli.personale.burraco.model.Round updateRound(
		it.bastianelli.personale.burraco.model.Round round) {

		return _roundLocalService.updateRound(round);
	}

	@Override
	public RoundLocalService getWrappedService() {
		return _roundLocalService;
	}

	@Override
	public void setWrappedService(RoundLocalService roundLocalService) {
		_roundLocalService = roundLocalService;
	}

	private RoundLocalService _roundLocalService;

}