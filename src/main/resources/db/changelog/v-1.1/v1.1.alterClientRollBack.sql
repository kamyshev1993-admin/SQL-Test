--liquibase formatted sql
--changeset author:kamyshev_1.1.1

ALTER TABLE CLIENT DROP COLUMN PREV_NAME;
COMMIT;