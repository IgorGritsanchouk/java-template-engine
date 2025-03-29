CREATE TABLE IF NOT EXISTS USERS
(
    id             SERIAL PRIMARY KEY,
    first_name     VARCHAR(100),
    last_name      VARCHAR(100),
    email          VARCHAR(100),
    country        VARCHAR(100),
    street_address VARCHAR(150),
    city           VARCHAR(50),
    region         VARCHAR(50),
    postal_code    VARCHAR(30)
);