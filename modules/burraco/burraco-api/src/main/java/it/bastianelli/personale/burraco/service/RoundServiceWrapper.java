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
 * Provides a wrapper for {@link RoundService}.
 *
 * @author Brian Wing Shun Chan
 * @see RoundService
 * @generated
 */
public class RoundServiceWrapper
	implements RoundService, ServiceWrapper<RoundService> {

	public RoundServiceWrapper(RoundService roundService) {
		_roundService = roundService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _roundService.getOSGiServiceIdentifier();
	}

	@Override
	public RoundService getWrappedService() {
		return _roundService;
	}

	@Override
	public void setWrappedService(RoundService roundService) {
		_roundService = roundService;
	}

	private RoundService _roundService;

}