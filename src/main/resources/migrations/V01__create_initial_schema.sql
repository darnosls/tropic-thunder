CREATE TABLE characters (
     id SERIAL NOT NULL PRIMARY KEY,
     name VARCHAR(255) NOT NULL,
     age DECIMAL(10, 2) NOT NULL,
     description TEXT
);