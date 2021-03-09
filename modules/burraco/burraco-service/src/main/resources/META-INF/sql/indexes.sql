create index IX_12CE7603 on BURRACO_Game (userId, opponentId);
create index IX_5ADBBE08 on BURRACO_Game (userId, result[$COLUMN_LENGTH:75$]);
create index IX_BD719399 on BURRACO_Game (userId, state_[$COLUMN_LENGTH:75$]);
create index IX_97D2FE31 on BURRACO_Game (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_61B75CF3 on BURRACO_Game (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_C56A1A10 on BURRACO_Round (gameId);
create index IX_C698E063 on BURRACO_Round (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_D49423A5 on BURRACO_Round (uuid_[$COLUMN_LENGTH:75$], groupId);