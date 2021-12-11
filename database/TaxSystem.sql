DROP DATABASE TaxSystem IF EXISTS;
CREATE DATABASE TaxSystem;
CREATE TABLE client (
client_id serial,
ss_number INT NOT NULL,
first_name VARCHAR(100) NOT NULL,
last_name VARCHAR(100) NOT NULL,
address VARCHAR (200) NOT NULL,
phone_number VARCHAR(50) NOT NULL,
fee_paid NUMERIC (10,5) NOT NULL,
CONSTRAINT PK_client PRIMARY KEY (client_id)
);
