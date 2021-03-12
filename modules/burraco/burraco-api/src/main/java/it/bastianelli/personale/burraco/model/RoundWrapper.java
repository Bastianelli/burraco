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
 * This class is a wrapper for {@link Round}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Round
 * @generated
 */
public class RoundWrapper
	extends BaseModelWrapper<Round> implements ModelWrapper<Round>, Round {

	public RoundWrapper(Round round) {
		super(round);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("roundId", getRoundId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("gameId", getGameId());
		attributes.put("pots", isPots());
		attributes.put("closing", isClosing());
		attributes.put("cleanRun", getCleanRun());
		attributes.put("dirtyRun", getDirtyRun());
		attributes.put("score", getScore());
		attributes.put("opponentUserId", getOpponentUserId());
		attributes.put("opponentUserName", getOpponentUserName());
		attributes.put("opponentPots", isOpponentPots());
		attributes.put("opponentClosing", isOpponentClosing());
		attributes.put("opponentCleanRun", getOpponentCleanRun());
		attributes.put("opponentDirtyRun", getOpponentDirtyRun());
		attributes.put("opponentScore", getOpponentScore());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long roundId = (Long)attributes.get("roundId");

		if (roundId != null) {
			setRoundId(roundId);
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

		Long gameId = (Long)attributes.get("gameId");

		if (gameId != null) {
			setGameId(gameId);
		}

		Boolean pots = (Boolean)attributes.get("pots");

		if (pots != null) {
			setPots(pots);
		}

		Boolean closing = (Boolean)attributes.get("closing");

		if (closing != null) {
			setClosing(closing);
		}

		Integer cleanRun = (Integer)attributes.get("cleanRun");

		if (cleanRun != null) {
			setCleanRun(cleanRun);
		}

		Integer dirtyRun = (Integer)attributes.get("dirtyRun");

		if (dirtyRun != null) {
			setDirtyRun(dirtyRun);
		}

		Integer score = (Integer)attributes.get("score");

		if (score != null) {
			setScore(score);
		}

		Long opponentUserId = (Long)attributes.get("opponentUserId");

		if (opponentUserId != null) {
			setOpponentUserId(opponentUserId);
		}

		String opponentUserName = (String)attributes.get("opponentUserName");

		if (opponentUserName != null) {
			setOpponentUserName(opponentUserName);
		}

		Boolean opponentPots = (Boolean)attributes.get("opponentPots");

		if (opponentPots != null) {
			setOpponentPots(opponentPots);
		}

		Boolean opponentClosing = (Boolean)attributes.get("opponentClosing");

		if (opponentClosing != null) {
			setOpponentClosing(opponentClosing);
		}

		Integer opponentCleanRun = (Integer)attributes.get("opponentCleanRun");

		if (opponentCleanRun != null) {
			setOpponentCleanRun(opponentCleanRun);
		}

		Integer opponentDirtyRun = (Integer)attributes.get("opponentDirtyRun");

		if (opponentDirtyRun != null) {
			setOpponentDirtyRun(opponentDirtyRun);
		}

		Integer opponentScore = (Integer)attributes.get("opponentScore");

		if (opponentScore != null) {
			setOpponentScore(opponentScore);
		}
	}

	/**
	 * Returns the clean run of this round.
	 *
	 * @return the clean run of this round
	 */
	@Override
	public int getCleanRun() {
		return model.getCleanRun();
	}

	/**
	 * Returns the closing of this round.
	 *
	 * @return the closing of this round
	 */
	@Override
	public boolean getClosing() {
		return model.getClosing();
	}

	/**
	 * Returns the company ID of this round.
	 *
	 * @return the company ID of this round
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this round.
	 *
	 * @return the create date of this round
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the dirty run of this round.
	 *
	 * @return the dirty run of this round
	 */
	@Override
	public int getDirtyRun() {
		return model.getDirtyRun();
	}

	/**
	 * Returns the game ID of this round.
	 *
	 * @return the game ID of this round
	 */
	@Override
	public long getGameId() {
		return model.getGameId();
	}

	/**
	 * Returns the group ID of this round.
	 *
	 * @return the group ID of this round
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this round.
	 *
	 * @return the modified date of this round
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the opponent clean run of this round.
	 *
	 * @return the opponent clean run of this round
	 */
	@Override
	public int getOpponentCleanRun() {
		return model.getOpponentCleanRun();
	}

	/**
	 * Returns the opponent closing of this round.
	 *
	 * @return the opponent closing of this round
	 */
	@Override
	public boolean getOpponentClosing() {
		return model.getOpponentClosing();
	}

	/**
	 * Returns the opponent dirty run of this round.
	 *
	 * @return the opponent dirty run of this round
	 */
	@Override
	public int getOpponentDirtyRun() {
		return model.getOpponentDirtyRun();
	}

	/**
	 * Returns the opponent pots of this round.
	 *
	 * @return the opponent pots of this round
	 */
	@Override
	public boolean getOpponentPots() {
		return model.getOpponentPots();
	}

	/**
	 * Returns the opponent score of this round.
	 *
	 * @return the opponent score of this round
	 */
	@Override
	public int getOpponentScore() {
		return model.getOpponentScore();
	}

	/**
	 * Returns the opponent user ID of this round.
	 *
	 * @return the opponent user ID of this round
	 */
	@Override
	public long getOpponentUserId() {
		return model.getOpponentUserId();
	}

	/**
	 * Returns the opponent user name of this round.
	 *
	 * @return the opponent user name of this round
	 */
	@Override
	public String getOpponentUserName() {
		return model.getOpponentUserName();
	}

	/**
	 * Returns the opponent user uuid of this round.
	 *
	 * @return the opponent user uuid of this round
	 */
	@Override
	public String getOpponentUserUuid() {
		return model.getOpponentUserUuid();
	}

	/**
	 * Returns the pots of this round.
	 *
	 * @return the pots of this round
	 */
	@Override
	public boolean getPots() {
		return model.getPots();
	}

	/**
	 * Returns the primary key of this round.
	 *
	 * @return the primary key of this round
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the round ID of this round.
	 *
	 * @return the round ID of this round
	 */
	@Override
	public long getRoundId() {
		return model.getRoundId();
	}

	/**
	 * Returns the score of this round.
	 *
	 * @return the score of this round
	 */
	@Override
	public int getScore() {
		return model.getScore();
	}

	/**
	 * Returns the user ID of this round.
	 *
	 * @return the user ID of this round
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this round.
	 *
	 * @return the user name of this round
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this round.
	 *
	 * @return the user uuid of this round
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this round.
	 *
	 * @return the uuid of this round
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this round is closing.
	 *
	 * @return <code>true</code> if this round is closing; <code>false</code> otherwise
	 */
	@Override
	public boolean isClosing() {
		return model.isClosing();
	}

	/**
	 * Returns <code>true</code> if this round is opponent closing.
	 *
	 * @return <code>true</code> if this round is opponent closing; <code>false</code> otherwise
	 */
	@Override
	public boolean isOpponentClosing() {
		return model.isOpponentClosing();
	}

	/**
	 * Returns <code>true</code> if this round is opponent pots.
	 *
	 * @return <code>true</code> if this round is opponent pots; <code>false</code> otherwise
	 */
	@Override
	public boolean isOpponentPots() {
		return model.isOpponentPots();
	}

	/**
	 * Returns <code>true</code> if this round is pots.
	 *
	 * @return <code>true</code> if this round is pots; <code>false</code> otherwise
	 */
	@Override
	public boolean isPots() {
		return model.isPots();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the clean run of this round.
	 *
	 * @param cleanRun the clean run of this round
	 */
	@Override
	public void setCleanRun(int cleanRun) {
		model.setCleanRun(cleanRun);
	}

	/**
	 * Sets whether this round is closing.
	 *
	 * @param closing the closing of this round
	 */
	@Override
	public void setClosing(boolean closing) {
		model.setClosing(closing);
	}

	/**
	 * Sets the company ID of this round.
	 *
	 * @param companyId the company ID of this round
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this round.
	 *
	 * @param createDate the create date of this round
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the dirty run of this round.
	 *
	 * @param dirtyRun the dirty run of this round
	 */
	@Override
	public void setDirtyRun(int dirtyRun) {
		model.setDirtyRun(dirtyRun);
	}

	/**
	 * Sets the game ID of this round.
	 *
	 * @param gameId the game ID of this round
	 */
	@Override
	public void setGameId(long gameId) {
		model.setGameId(gameId);
	}

	/**
	 * Sets the group ID of this round.
	 *
	 * @param groupId the group ID of this round
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this round.
	 *
	 * @param modifiedDate the modified date of this round
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the opponent clean run of this round.
	 *
	 * @param opponentCleanRun the opponent clean run of this round
	 */
	@Override
	public void setOpponentCleanRun(int opponentCleanRun) {
		model.setOpponentCleanRun(opponentCleanRun);
	}

	/**
	 * Sets whether this round is opponent closing.
	 *
	 * @param opponentClosing the opponent closing of this round
	 */
	@Override
	public void setOpponentClosing(boolean opponentClosing) {
		model.setOpponentClosing(opponentClosing);
	}

	/**
	 * Sets the opponent dirty run of this round.
	 *
	 * @param opponentDirtyRun the opponent dirty run of this round
	 */
	@Override
	public void setOpponentDirtyRun(int opponentDirtyRun) {
		model.setOpponentDirtyRun(opponentDirtyRun);
	}

	/**
	 * Sets whether this round is opponent pots.
	 *
	 * @param opponentPots the opponent pots of this round
	 */
	@Override
	public void setOpponentPots(boolean opponentPots) {
		model.setOpponentPots(opponentPots);
	}

	/**
	 * Sets the opponent score of this round.
	 *
	 * @param opponentScore the opponent score of this round
	 */
	@Override
	public void setOpponentScore(int opponentScore) {
		model.setOpponentScore(opponentScore);
	}

	/**
	 * Sets the opponent user ID of this round.
	 *
	 * @param opponentUserId the opponent user ID of this round
	 */
	@Override
	public void setOpponentUserId(long opponentUserId) {
		model.setOpponentUserId(opponentUserId);
	}

	/**
	 * Sets the opponent user name of this round.
	 *
	 * @param opponentUserName the opponent user name of this round
	 */
	@Override
	public void setOpponentUserName(String opponentUserName) {
		model.setOpponentUserName(opponentUserName);
	}

	/**
	 * Sets the opponent user uuid of this round.
	 *
	 * @param opponentUserUuid the opponent user uuid of this round
	 */
	@Override
	public void setOpponentUserUuid(String opponentUserUuid) {
		model.setOpponentUserUuid(opponentUserUuid);
	}

	/**
	 * Sets whether this round is pots.
	 *
	 * @param pots the pots of this round
	 */
	@Override
	public void setPots(boolean pots) {
		model.setPots(pots);
	}

	/**
	 * Sets the primary key of this round.
	 *
	 * @param primaryKey the primary key of this round
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the round ID of this round.
	 *
	 * @param roundId the round ID of this round
	 */
	@Override
	public void setRoundId(long roundId) {
		model.setRoundId(roundId);
	}

	/**
	 * Sets the score of this round.
	 *
	 * @param score the score of this round
	 */
	@Override
	public void setScore(int score) {
		model.setScore(score);
	}

	/**
	 * Sets the user ID of this round.
	 *
	 * @param userId the user ID of this round
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this round.
	 *
	 * @param userName the user name of this round
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this round.
	 *
	 * @param userUuid the user uuid of this round
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this round.
	 *
	 * @param uuid the uuid of this round
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
	protected RoundWrapper wrap(Round round) {
		return new RoundWrapper(round);
	}

}