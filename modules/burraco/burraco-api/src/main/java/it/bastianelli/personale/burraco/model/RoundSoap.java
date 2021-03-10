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

package it.bastianelli.personale.burraco.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link it.bastianelli.personale.burraco.service.http.RoundServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RoundSoap implements Serializable {

	public static RoundSoap toSoapModel(Round model) {
		RoundSoap soapModel = new RoundSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setRoundId(model.getRoundId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setGameId(model.getGameId());
		soapModel.setPots(model.isPots());
		soapModel.setCleanRun(model.getCleanRun());
		soapModel.setDirtyRun(model.getDirtyRun());
		soapModel.setScore(model.getScore());
		soapModel.setOpponentUserId(model.getOpponentUserId());
		soapModel.setOpponentUserName(model.getOpponentUserName());
		soapModel.setOpponentPots(model.isOpponentPots());
		soapModel.setOpponentCleanRun(model.getOpponentCleanRun());
		soapModel.setOpponentDirtyRun(model.getOpponentDirtyRun());
		soapModel.setOpponentScore(model.getOpponentScore());

		return soapModel;
	}

	public static RoundSoap[] toSoapModels(Round[] models) {
		RoundSoap[] soapModels = new RoundSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RoundSoap[][] toSoapModels(Round[][] models) {
		RoundSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RoundSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RoundSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RoundSoap[] toSoapModels(List<Round> models) {
		List<RoundSoap> soapModels = new ArrayList<RoundSoap>(models.size());

		for (Round model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RoundSoap[soapModels.size()]);
	}

	public RoundSoap() {
	}

	public long getPrimaryKey() {
		return _roundId;
	}

	public void setPrimaryKey(long pk) {
		setRoundId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getRoundId() {
		return _roundId;
	}

	public void setRoundId(long roundId) {
		_roundId = roundId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getGameId() {
		return _gameId;
	}

	public void setGameId(long gameId) {
		_gameId = gameId;
	}

	public boolean getPots() {
		return _pots;
	}

	public boolean isPots() {
		return _pots;
	}

	public void setPots(boolean pots) {
		_pots = pots;
	}

	public int getCleanRun() {
		return _cleanRun;
	}

	public void setCleanRun(int cleanRun) {
		_cleanRun = cleanRun;
	}

	public int getDirtyRun() {
		return _dirtyRun;
	}

	public void setDirtyRun(int dirtyRun) {
		_dirtyRun = dirtyRun;
	}

	public int getScore() {
		return _score;
	}

	public void setScore(int score) {
		_score = score;
	}

	public long getOpponentUserId() {
		return _opponentUserId;
	}

	public void setOpponentUserId(long opponentUserId) {
		_opponentUserId = opponentUserId;
	}

	public String getOpponentUserName() {
		return _opponentUserName;
	}

	public void setOpponentUserName(String opponentUserName) {
		_opponentUserName = opponentUserName;
	}

	public boolean getOpponentPots() {
		return _opponentPots;
	}

	public boolean isOpponentPots() {
		return _opponentPots;
	}

	public void setOpponentPots(boolean opponentPots) {
		_opponentPots = opponentPots;
	}

	public int getOpponentCleanRun() {
		return _opponentCleanRun;
	}

	public void setOpponentCleanRun(int opponentCleanRun) {
		_opponentCleanRun = opponentCleanRun;
	}

	public int getOpponentDirtyRun() {
		return _opponentDirtyRun;
	}

	public void setOpponentDirtyRun(int opponentDirtyRun) {
		_opponentDirtyRun = opponentDirtyRun;
	}

	public int getOpponentScore() {
		return _opponentScore;
	}

	public void setOpponentScore(int opponentScore) {
		_opponentScore = opponentScore;
	}

	private String _uuid;
	private long _roundId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _gameId;
	private boolean _pots;
	private int _cleanRun;
	private int _dirtyRun;
	private int _score;
	private long _opponentUserId;
	private String _opponentUserName;
	private boolean _opponentPots;
	private int _opponentCleanRun;
	private int _opponentDirtyRun;
	private int _opponentScore;

}