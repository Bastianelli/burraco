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
 * Provides the local service utility for Round. This utility wraps
 * <code>it.bastianelli.personale.burraco.service.impl.RoundLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see RoundLocalService
 * @generated
 */
public class RoundLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>it.bastianelli.personale.burraco.service.impl.RoundLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static it.bastianelli.personale.burraco.model.Round addRound(
			long gameId, long userId, long opponentUserId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addRound(
			gameId, userId, opponentUserId, serviceContext);
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
	public static it.bastianelli.personale.burraco.model.Round addRound(
		it.bastianelli.personale.burraco.model.Round round) {

		return getService().addRound(round);
	}

	/**
	 * Creates a new round with the primary key. Does not add the round to the database.
	 *
	 * @param roundId the primary key for the new round
	 * @return the new round
	 */
	public static it.bastianelli.personale.burraco.model.Round createRound(
		long roundId) {

		return getService().createRound(roundId);
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
	public static it.bastianelli.personale.burraco.model.Round deleteRound(
			long roundId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteRound(roundId);
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
	 */
	public static it.bastianelli.personale.burraco.model.Round deleteRound(
		it.bastianelli.personale.burraco.model.Round round) {

		return getService().deleteRound(round);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.bastianelli.personale.burraco.model.impl.RoundModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>it.bastianelli.personale.burraco.model.impl.RoundModelImpl</code>.
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

	public static it.bastianelli.personale.burraco.model.Round fetchRound(
		long roundId) {

		return getService().fetchRound(roundId);
	}

	/**
	 * Returns the round matching the UUID and group.
	 *
	 * @param uuid the round's UUID
	 * @param groupId the primary key of the group
	 * @return the matching round, or <code>null</code> if a matching round could not be found
	 */
	public static it.bastianelli.personale.burraco.model.Round
		fetchRoundByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchRoundByUuidAndGroupId(uuid, groupId);
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
	 * Returns the round with the primary key.
	 *
	 * @param roundId the primary key of the round
	 * @return the round
	 * @throws PortalException if a round with the primary key could not be found
	 */
	public static it.bastianelli.personale.burraco.model.Round getRound(
			long roundId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getRound(roundId);
	}

	/**
	 * Returns the round matching the UUID and group.
	 *
	 * @param uuid the round's UUID
	 * @param groupId the primary key of the group
	 * @return the matching round
	 * @throws PortalException if a matching round could not be found
	 */
	public static it.bastianelli.personale.burraco.model.Round
			getRoundByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getRoundByUuidAndGroupId(uuid, groupId);
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
	public static java.util.List<it.bastianelli.personale.burraco.model.Round>
		getRounds(int start, int end) {

		return getService().getRounds(start, end);
	}

	/**
	 * Returns all the rounds matching the UUID and company.
	 *
	 * @param uuid the UUID of the rounds
	 * @param companyId the primary key of the company
	 * @return the matching rounds, or an empty list if no matches were found
	 */
	public static java.util.List<it.bastianelli.personale.burraco.model.Round>
		getRoundsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getRoundsByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<it.bastianelli.personale.burraco.model.Round>
		getRoundsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<it.bastianelli.personale.burraco.model.Round>
					orderByComparator) {

		return getService().getRoundsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rounds.
	 *
	 * @return the number of rounds
	 */
	public static int getRoundsCount() {
		return getService().getRoundsCount();
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
	public static it.bastianelli.personale.burraco.model.Round updateRound(
		it.bastianelli.personale.burraco.model.Round round) {

		return getService().updateRound(round);
	}

	public static RoundLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<RoundLocalService, RoundLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(RoundLocalService.class);

		ServiceTracker<RoundLocalService, RoundLocalService> serviceTracker =
			new ServiceTracker<RoundLocalService, RoundLocalService>(
				bundle.getBundleContext(), RoundLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}