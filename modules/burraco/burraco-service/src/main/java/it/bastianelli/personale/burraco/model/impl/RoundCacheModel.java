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

import it.bastianelli.personale.burraco.model.Round;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Round in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RoundCacheModel implements CacheModel<Round>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RoundCacheModel)) {
			return false;
		}

		RoundCacheModel roundCacheModel = (RoundCacheModel)object;

		if (roundId == roundCacheModel.roundId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, roundId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", roundId=");
		sb.append(roundId);
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
		sb.append(", gameId=");
		sb.append(gameId);
		sb.append(", pots=");
		sb.append(pots);
		sb.append(", closing=");
		sb.append(closing);
		sb.append(", cleanRun=");
		sb.append(cleanRun);
		sb.append(", dirtyRun=");
		sb.append(dirtyRun);
		sb.append(", score=");
		sb.append(score);
		sb.append(", opponentUserId=");
		sb.append(opponentUserId);
		sb.append(", opponentUserName=");
		sb.append(opponentUserName);
		sb.append(", opponentPots=");
		sb.append(opponentPots);
		sb.append(", opponentClosing=");
		sb.append(opponentClosing);
		sb.append(", opponentCleanRun=");
		sb.append(opponentCleanRun);
		sb.append(", opponentDirtyRun=");
		sb.append(opponentDirtyRun);
		sb.append(", opponentScore=");
		sb.append(opponentScore);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Round toEntityModel() {
		RoundImpl roundImpl = new RoundImpl();

		if (uuid == null) {
			roundImpl.setUuid("");
		}
		else {
			roundImpl.setUuid(uuid);
		}

		roundImpl.setRoundId(roundId);
		roundImpl.setGroupId(groupId);
		roundImpl.setCompanyId(companyId);
		roundImpl.setUserId(userId);

		if (userName == null) {
			roundImpl.setUserName("");
		}
		else {
			roundImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			roundImpl.setCreateDate(null);
		}
		else {
			roundImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			roundImpl.setModifiedDate(null);
		}
		else {
			roundImpl.setModifiedDate(new Date(modifiedDate));
		}

		roundImpl.setGameId(gameId);
		roundImpl.setPots(pots);
		roundImpl.setClosing(closing);
		roundImpl.setCleanRun(cleanRun);
		roundImpl.setDirtyRun(dirtyRun);
		roundImpl.setScore(score);
		roundImpl.setOpponentUserId(opponentUserId);

		if (opponentUserName == null) {
			roundImpl.setOpponentUserName("");
		}
		else {
			roundImpl.setOpponentUserName(opponentUserName);
		}

		roundImpl.setOpponentPots(opponentPots);
		roundImpl.setOpponentClosing(opponentClosing);
		roundImpl.setOpponentCleanRun(opponentCleanRun);
		roundImpl.setOpponentDirtyRun(opponentDirtyRun);
		roundImpl.setOpponentScore(opponentScore);

		roundImpl.resetOriginalValues();

		return roundImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		roundId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		gameId = objectInput.readLong();

		pots = objectInput.readBoolean();

		closing = objectInput.readBoolean();

		cleanRun = objectInput.readInt();

		dirtyRun = objectInput.readInt();

		score = objectInput.readInt();

		opponentUserId = objectInput.readLong();
		opponentUserName = objectInput.readUTF();

		opponentPots = objectInput.readBoolean();

		opponentClosing = objectInput.readBoolean();

		opponentCleanRun = objectInput.readInt();

		opponentDirtyRun = objectInput.readInt();

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

		objectOutput.writeLong(roundId);

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

		objectOutput.writeLong(gameId);

		objectOutput.writeBoolean(pots);

		objectOutput.writeBoolean(closing);

		objectOutput.writeInt(cleanRun);

		objectOutput.writeInt(dirtyRun);

		objectOutput.writeInt(score);

		objectOutput.writeLong(opponentUserId);

		if (opponentUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(opponentUserName);
		}

		objectOutput.writeBoolean(opponentPots);

		objectOutput.writeBoolean(opponentClosing);

		objectOutput.writeInt(opponentCleanRun);

		objectOutput.writeInt(opponentDirtyRun);

		objectOutput.writeInt(opponentScore);
	}

	public String uuid;
	public long roundId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long gameId;
	public boolean pots;
	public boolean closing;
	public int cleanRun;
	public int dirtyRun;
	public int score;
	public long opponentUserId;
	public String opponentUserName;
	public boolean opponentPots;
	public boolean opponentClosing;
	public int opponentCleanRun;
	public int opponentDirtyRun;
	public int opponentScore;

}