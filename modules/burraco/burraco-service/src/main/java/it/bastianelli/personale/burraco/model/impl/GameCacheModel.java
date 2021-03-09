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

package it.bastianelli.personale.burraco.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import it.bastianelli.personale.burraco.model.Game;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Game in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class GameCacheModel implements CacheModel<Game>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof GameCacheModel)) {
			return false;
		}

		GameCacheModel gameCacheModel = (GameCacheModel)object;

		if (gameId == gameCacheModel.gameId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, gameId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", gameId=");
		sb.append(gameId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", state=");
		sb.append(state);
		sb.append(", result=");
		sb.append(result);
		sb.append(", description=");
		sb.append(description);
		sb.append(", opponentId=");
		sb.append(opponentId);
		sb.append(", score=");
		sb.append(score);
		sb.append(", opponentScore=");
		sb.append(opponentScore);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Game toEntityModel() {
		GameImpl gameImpl = new GameImpl();

		if (uuid == null) {
			gameImpl.setUuid("");
		}
		else {
			gameImpl.setUuid(uuid);
		}

		gameImpl.setGameId(gameId);
		gameImpl.setGroupId(groupId);
		gameImpl.setCompanyId(companyId);
		gameImpl.setUserId(userId);

		if (userName == null) {
			gameImpl.setUserName("");
		}
		else {
			gameImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			gameImpl.setCreateDate(null);
		}
		else {
			gameImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			gameImpl.setModifiedDate(null);
		}
		else {
			gameImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (state == null) {
			gameImpl.setState("");
		}
		else {
			gameImpl.setState(state);
		}

		if (result == null) {
			gameImpl.setResult("");
		}
		else {
			gameImpl.setResult(result);
		}

		if (description == null) {
			gameImpl.setDescription("");
		}
		else {
			gameImpl.setDescription(description);
		}

		gameImpl.setOpponentId(opponentId);
		gameImpl.setScore(score);
		gameImpl.setOpponentScore(opponentScore);

		gameImpl.resetOriginalValues();

		return gameImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		gameId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		state = objectInput.readUTF();
		result = objectInput.readUTF();
		description = objectInput.readUTF();

		opponentId = objectInput.readLong();

		score = objectInput.readInt();

		opponentScore = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(gameId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (state == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(state);
		}

		if (result == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(result);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(opponentId);

		objectOutput.writeInt(score);

		objectOutput.writeInt(opponentScore);
	}

	public String uuid;
	public long gameId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String state;
	public String result;
	public String description;
	public long opponentId;
	public int score;
	public int opponentScore;

}