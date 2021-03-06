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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import it.bastianelli.personale.burraco.model.Game;
import it.bastianelli.personale.burraco.model.GameModel;
import it.bastianelli.personale.burraco.model.GameSoap;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the Game service. Represents a row in the &quot;BURRACO_Game&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>GameModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link GameImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GameImpl
 * @generated
 */
@JSON(strict = true)
public class GameModelImpl extends BaseModelImpl<Game> implements GameModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a game model instance should use the <code>Game</code> interface instead.
	 */
	public static final String TABLE_NAME = "BURRACO_Game";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"gameId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"state_", Types.VARCHAR}, {"result", Types.VARCHAR},
		{"description", Types.VARCHAR}, {"opponentId", Types.BIGINT},
		{"score", Types.INTEGER}, {"opponentScore", Types.INTEGER}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("gameId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("state_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("result", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("opponentId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("score", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("opponentScore", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE =
		"create table BURRACO_Game (uuid_ VARCHAR(75) null,gameId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,state_ VARCHAR(75) null,result VARCHAR(75) null,description VARCHAR(75) null,opponentId LONG,score INTEGER,opponentScore INTEGER)";

	public static final String TABLE_SQL_DROP = "drop table BURRACO_Game";

	public static final String ORDER_BY_JPQL = " ORDER BY game.state ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY BURRACO_Game.state_ ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	public static final long GROUPID_COLUMN_BITMASK = 2L;

	public static final long OPPONENTID_COLUMN_BITMASK = 4L;

	public static final long RESULT_COLUMN_BITMASK = 8L;

	public static final long STATE_COLUMN_BITMASK = 16L;

	public static final long USERID_COLUMN_BITMASK = 32L;

	public static final long UUID_COLUMN_BITMASK = 64L;

	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
		_entityCacheEnabled = entityCacheEnabled;
	}

	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
		_finderCacheEnabled = finderCacheEnabled;
	}

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Game toModel(GameSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Game model = new GameImpl();

		model.setUuid(soapModel.getUuid());
		model.setGameId(soapModel.getGameId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setState(soapModel.getState());
		model.setResult(soapModel.getResult());
		model.setDescription(soapModel.getDescription());
		model.setOpponentId(soapModel.getOpponentId());
		model.setScore(soapModel.getScore());
		model.setOpponentScore(soapModel.getOpponentScore());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Game> toModels(GameSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Game> models = new ArrayList<Game>(soapModels.length);

		for (GameSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public GameModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _gameId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setGameId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _gameId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Game.class;
	}

	@Override
	public String getModelClassName() {
		return Game.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Game, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Game, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Game, Object> attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Game)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Game, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Game, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept((Game)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Game, Object>> getAttributeGetterFunctions() {
		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Game, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Game>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Game.class.getClassLoader(), Game.class, ModelWrapper.class);

		try {
			Constructor<Game> constructor =
				(Constructor<Game>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<Game, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Game, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Game, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Game, Object>>();
		Map<String, BiConsumer<Game, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Game, ?>>();

		attributeGetterFunctions.put("uuid", Game::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<Game, String>)Game::setUuid);
		attributeGetterFunctions.put("gameId", Game::getGameId);
		attributeSetterBiConsumers.put(
			"gameId", (BiConsumer<Game, Long>)Game::setGameId);
		attributeGetterFunctions.put("groupId", Game::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<Game, Long>)Game::setGroupId);
		attributeGetterFunctions.put("companyId", Game::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId", (BiConsumer<Game, Long>)Game::setCompanyId);
		attributeGetterFunctions.put("userId", Game::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<Game, Long>)Game::setUserId);
		attributeGetterFunctions.put("userName", Game::getUserName);
		attributeSetterBiConsumers.put(
			"userName", (BiConsumer<Game, String>)Game::setUserName);
		attributeGetterFunctions.put("createDate", Game::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate", (BiConsumer<Game, Date>)Game::setCreateDate);
		attributeGetterFunctions.put("modifiedDate", Game::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate", (BiConsumer<Game, Date>)Game::setModifiedDate);
		attributeGetterFunctions.put("state", Game::getState);
		attributeSetterBiConsumers.put(
			"state", (BiConsumer<Game, String>)Game::setState);
		attributeGetterFunctions.put("result", Game::getResult);
		attributeSetterBiConsumers.put(
			"result", (BiConsumer<Game, String>)Game::setResult);
		attributeGetterFunctions.put("description", Game::getDescription);
		attributeSetterBiConsumers.put(
			"description", (BiConsumer<Game, String>)Game::setDescription);
		attributeGetterFunctions.put("opponentId", Game::getOpponentId);
		attributeSetterBiConsumers.put(
			"opponentId", (BiConsumer<Game, Long>)Game::setOpponentId);
		attributeGetterFunctions.put("score", Game::getScore);
		attributeSetterBiConsumers.put(
			"score", (BiConsumer<Game, Integer>)Game::setScore);
		attributeGetterFunctions.put("opponentScore", Game::getOpponentScore);
		attributeSetterBiConsumers.put(
			"opponentScore", (BiConsumer<Game, Integer>)Game::setOpponentScore);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		_columnBitmask |= UUID_COLUMN_BITMASK;

		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getGameId() {
		return _gameId;
	}

	@Override
	public void setGameId(long gameId) {
		_gameId = gameId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getState() {
		if (_state == null) {
			return "";
		}
		else {
			return _state;
		}
	}

	@Override
	public void setState(String state) {
		_columnBitmask |= STATE_COLUMN_BITMASK;

		if (_originalState == null) {
			_originalState = _state;
		}

		_state = state;
	}

	public String getOriginalState() {
		return GetterUtil.getString(_originalState);
	}

	@JSON
	@Override
	public String getResult() {
		if (_result == null) {
			return "";
		}
		else {
			return _result;
		}
	}

	@Override
	public void setResult(String result) {
		_columnBitmask |= RESULT_COLUMN_BITMASK;

		if (_originalResult == null) {
			_originalResult = _result;
		}

		_result = result;
	}

	public String getOriginalResult() {
		return GetterUtil.getString(_originalResult);
	}

	@JSON
	@Override
	public String getDescription() {
		if (_description == null) {
			return "";
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@JSON
	@Override
	public long getOpponentId() {
		return _opponentId;
	}

	@Override
	public void setOpponentId(long opponentId) {
		_columnBitmask |= OPPONENTID_COLUMN_BITMASK;

		if (!_setOriginalOpponentId) {
			_setOriginalOpponentId = true;

			_originalOpponentId = _opponentId;
		}

		_opponentId = opponentId;
	}

	public long getOriginalOpponentId() {
		return _originalOpponentId;
	}

	@JSON
	@Override
	public int getScore() {
		return _score;
	}

	@Override
	public void setScore(int score) {
		_score = score;
	}

	@JSON
	@Override
	public int getOpponentScore() {
		return _opponentScore;
	}

	@Override
	public void setOpponentScore(int opponentScore) {
		_opponentScore = opponentScore;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(Game.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), Game.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Game toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Game>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		GameImpl gameImpl = new GameImpl();

		gameImpl.setUuid(getUuid());
		gameImpl.setGameId(getGameId());
		gameImpl.setGroupId(getGroupId());
		gameImpl.setCompanyId(getCompanyId());
		gameImpl.setUserId(getUserId());
		gameImpl.setUserName(getUserName());
		gameImpl.setCreateDate(getCreateDate());
		gameImpl.setModifiedDate(getModifiedDate());
		gameImpl.setState(getState());
		gameImpl.setResult(getResult());
		gameImpl.setDescription(getDescription());
		gameImpl.setOpponentId(getOpponentId());
		gameImpl.setScore(getScore());
		gameImpl.setOpponentScore(getOpponentScore());

		gameImpl.resetOriginalValues();

		return gameImpl;
	}

	@Override
	public int compareTo(Game game) {
		int value = 0;

		value = getState().compareTo(game.getState());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Game)) {
			return false;
		}

		Game game = (Game)object;

		long primaryKey = game.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _entityCacheEnabled;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _finderCacheEnabled;
	}

	@Override
	public void resetOriginalValues() {
		_originalUuid = _uuid;

		_originalGroupId = _groupId;

		_setOriginalGroupId = false;

		_originalCompanyId = _companyId;

		_setOriginalCompanyId = false;

		_originalUserId = _userId;

		_setOriginalUserId = false;

		_setModifiedDate = false;
		_originalState = _state;

		_originalResult = _result;

		_originalOpponentId = _opponentId;

		_setOriginalOpponentId = false;

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<Game> toCacheModel() {
		GameCacheModel gameCacheModel = new GameCacheModel();

		gameCacheModel.uuid = getUuid();

		String uuid = gameCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			gameCacheModel.uuid = null;
		}

		gameCacheModel.gameId = getGameId();

		gameCacheModel.groupId = getGroupId();

		gameCacheModel.companyId = getCompanyId();

		gameCacheModel.userId = getUserId();

		gameCacheModel.userName = getUserName();

		String userName = gameCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			gameCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			gameCacheModel.createDate = createDate.getTime();
		}
		else {
			gameCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			gameCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			gameCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		gameCacheModel.state = getState();

		String state = gameCacheModel.state;

		if ((state != null) && (state.length() == 0)) {
			gameCacheModel.state = null;
		}

		gameCacheModel.result = getResult();

		String result = gameCacheModel.result;

		if ((result != null) && (result.length() == 0)) {
			gameCacheModel.result = null;
		}

		gameCacheModel.description = getDescription();

		String description = gameCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			gameCacheModel.description = null;
		}

		gameCacheModel.opponentId = getOpponentId();

		gameCacheModel.score = getScore();

		gameCacheModel.opponentScore = getOpponentScore();

		return gameCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Game, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(4 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Game, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Game, Object> attributeGetterFunction = entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Game)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<Game, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Game, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Game, Object> attributeGetterFunction = entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Game)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Game>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private String _uuid;
	private String _originalUuid;
	private long _gameId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _state;
	private String _originalState;
	private String _result;
	private String _originalResult;
	private String _description;
	private long _opponentId;
	private long _originalOpponentId;
	private boolean _setOriginalOpponentId;
	private int _score;
	private int _opponentScore;
	private long _columnBitmask;
	private Game _escapedModel;

}