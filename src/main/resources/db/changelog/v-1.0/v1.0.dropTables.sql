--liquibase formatted sql
--changeset author:kamyshev_1.0.1

drop table CLIENT;
drop table REQUEST;
drop table ACCOUNT;
drop table TEMPLATE;
drop table STATUS;
drop table PAYMENT;
drop table CURRENCY;
drop table BALANCE;
drop table TRANSACTION_INFO;
drop table AUDIT_INFO;

drop table DATABASECHANGELOGLOCK;
drop table DATABASECHANGELOG;