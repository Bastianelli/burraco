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

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Game}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Game
 * @generated
 */
public class GameWrapper
	extends BaseModelWrapper<Game> implements Game, ModelWrapper<Game> {

	public GameWrapper(Game game) {
		super(game);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("gameId", getGameId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("state", getState());
		attributes.put("result", getResult());
		attributes.put("description", getDescription());
		attributes.put("opponentId", getOpponentId());
		attributes.put("score", getScore());
		attributes.put("opponentScore", getOpponentScore());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long gameId = (Long)attributes.get("gameId");

		if (gameId != null) {
			setGameId(gameId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String state = (String)attributes.get("state");

		if (state != null) {
			setState(state);
		}

		String result = (String)attributes.get("result");

		if (result != null) {
			setResult(result);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long opponentId = (Long)attributes.get("opponentId");

		if (opponentId != null) {
			setOpponentId(opponentId);
		}

		Integer score = (Integer)attributes.get("score");

		if (score != null) {
			setScore(score);
		}

		Integer opponentScore = (Integer)attributes.get("opponentScore");

		if (opponentScore != null) {
			setOpponentScore(opponentScore);
		}
	}

	/**
	 * Returns the company ID of this game.
	 *
	 * @return the company ID of this game
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this game.
	 *
	 * @return the create date of this game
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of this game.
	 *
	 * @return the description of this game
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the game ID of this game.
	 *
	 * @return the game ID of this game
	 */
	@Override
	public long getGameId() {
		return model.getGameId();
	}

	/**
	 * Returns the group ID of this game.
	 *
	 * @return the group ID of this game
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this game.
	 *
	 * @return the modified date of this game
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the opponent ID of this game.
	 *
	 * @return the opponent ID of this game
	 */
	@Override
	public long getOpponentId() {
		return model.getOpponentId();
	}

	/**
	 * Returns the opponent score of this game.
	 *
	 * @return the opponent score of this game
	 */
	@Override
	public int getOpponentScore() {
		return model.getOpponentScore();
	}

	/**
	 * Returns the primary key of this game.
	 *
	 * @return the primary key of this game
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the result of this game.
	 *
	 * @return the result of this game
	 */
	@Override
	public String getResult() {
		return model.getResult();
	}

	/**
	 * Returns the score of this game.
	 *
	 * @return the score of this game
	 */
	@Override
	public int getScore() {
		return model.getScore();
	}

	/**
	 * Returns the state of this game.
	 *
	 * @return the state of this game
	 */
	@Override
	public String getState() {
		return model.getState();
	}

	/**
	 * Returns the user ID of this game.
	 *
	 * @return the user ID of this game
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this game.
	 *
	 * @return the user name of this game
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this game.
	 *
	 * @return the user uuid of this game
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this game.
	 *
	 * @return the uuid of this game
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this game.
	 *
	 * @param companyId the company ID of this game
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this game.
	 *
	 * @param createDate the create date of this game
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this game.
	 *
	 * @param description the description of this game
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the game ID of this game.
	 *
	 * @param gameId the game ID of this game
	 */
	@Override
	public void setGameId(long gameId) {
		model.setGameId(gameId);
	}

	/**
	 * Sets the group ID of this game.
	 *
	 * @param groupId the group ID of this game
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this game.
	 *
	 * @param modifiedDate the modified date of this game
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the opponent ID of this game.
	 *
	 * @param opponentId the opponent ID of this game
	 */
	@Override
	public void setOpponentId(long opponentId) {
		model.setOpponentId(opponentId);
	}

	/**
	 * Sets the opponent score of this game.
	 *
	 * @param opponentScore the opponent score of this game
	 */
	@Override
	public void setOpponentScore(int opponentScore) {
		model.setOpponentScore(opponentScore);
	}

	/**
	 * Sets the primary key of this game.
	 *
	 * @param primaryKey the primary key of this game
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the result of this game.
	 *
	 * @param result the result of this game
	 */
	@Override
	public void setResult(String result) {
		model.setResult(result);
	}

	/**
	 * Sets the score of this game.
	 *
	 * @param score the score of this game
	 */
	@Override
	public void setScore(int score) {
		model.setScore(score);
	}

	/**
	 * Sets the state of this game.
	 *
	 * @param state the state of this game
	 */
	@Override
	public void setState(String state) {
		model.setState(state);
	}

	/**
	 * Sets the user ID of this game.
	 *
	 * @param userId the user ID of this game
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this game.
	 *
	 * @param userName the user name of this game
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this game.
	 *
	 * @param userUuid the user uuid of this game
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this game.
	 *
	 * @param uuid the uuid of this game
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected GameWrapper wrap(Game game) {
		return new GameWrapper(game);
	}

}