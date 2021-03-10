create table BURRACO_Game (
	uuid_ VARCHAR(75) null,
	gameId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	state_ VARCHAR(75) null,
	result VARCHAR(75) null,
	description VARCHAR(75) null,
	opponentId LONG,
	score INTEGER,
	opponentScore INTEGER
);

create table BURRACO_Round (
	uuid_ VARCHAR(75) null,
	roundId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	gameId LONG,
	pots BOOLEAN,
	cleanRun INTEGER,
	dirtyRun INTEGER,
	score INTEGER,
	opponentUserId LONG,
	opponentUserName VARCHAR(75) null,
	opponentPots BOOLEAN,
	opponentCleanRun INTEGER,
	opponentDirtyRun INTEGER,
	opponentScore INTEGER
);