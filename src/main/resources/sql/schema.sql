CREATE SEQUENCE company_seq
    INCREMENT BY 1
    MINVALUE 1
    START WITH 1
    CACHE 10;

CREATE TABLE company
(
    id      BIGINT PRIMARY KEY UNIQUE DEFAULT nextval('company_seq'),
    name    VARCHAR(255) NOT NULL UNIQUE,
    city    VARCHAR(255) NOT NULL,
    version BIGINT       NOT NULL
);