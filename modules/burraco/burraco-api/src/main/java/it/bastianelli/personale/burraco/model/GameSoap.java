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
 * This class is used by SOAP remote services, specifically {@link it.bastianelli.personale.burraco.service.http.GameServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class GameSoap implements Serializable {

	public static GameSoap toSoapModel(Game model) {
		GameSoap soapModel = new GameSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setGameId(model.getGameId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setState(model.getState());
		soapModel.setResult(model.getResult());
		soapModel.setDescription(model.getDescription());
		soapModel.setOpponentId(model.getOpponentId());
		soapModel.setScore(model.getScore());
		soapModel.setOpponentScore(model.getOpponentScore());

		return soapModel;
	}

	public static GameSoap[] toSoapModels(Game[] models) {
		GameSoap[] soapModels = new GameSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static GameSoap[][] toSoapModels(Game[][] models) {
		GameSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new GameSoap[models.length][models[0].length];
		}
		else {
			soapModels = new GameSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static GameSoap[] toSoapModels(List<Game> models) {
		List<GameSoap> soapModels = new ArrayList<GameSoap>(models.size());

		for (Game model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new GameSoap[soapModels.size()]);
	}

	public GameSoap() {
	}

	public long getPrimaryKey() {
		return _gameId;
	}

	public void setPrimaryKey(long pk) {
		setGameId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getGameId() {
		return _gameId;
	}

	public void setGameId(long gameId) {
		_gameId = gameId;
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

	public String getState() {
		return _state;
	}

	public void setState(String state) {
		_state = state;
	}

	public String getResult() {
		return _result;
	}

	public void setResult(String result) {
		_result = result;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public long getOpponentId() {
		return _opponentId;
	}

	public void setOpponentId(long opponentId) {
		_opponentId = opponentId;
	}

	public int getScore() {
		return _score;
	}

	public void setScore(int score) {
		_score = score;
	}

	public int getOpponentScore() {
		return _opponentScore;
	}

	public void setOpponentScore(int opponentScore) {
		_opponentScore = opponentScore;
	}

	private String _uuid;
	private long _gameId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _state;
	private String _result;
	private String _description;
	private long _opponentId;
	private int _score;
	private int _opponentScore;

}