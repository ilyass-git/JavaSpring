CREATE TABLE ad_photo_urls
(
    ad_id      BIGINT       NOT NULL,
    photo_urls VARCHAR(255) NULL
);

CREATE TABLE ads
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    property_id   BIGINT                NULL,
    room_id       BIGINT                NULL,
    title         VARCHAR(255)          NULL,
    `description` VARCHAR(2000)         NULL,
    owner_id      BIGINT                NULL,
    status        VARCHAR(255)          NULL,
    CONSTRAINT pk_ads PRIMARY KEY (id)
);

CREATE TABLE contracts
(
    id          BIGINT AUTO_INCREMENT NOT NULL,
    property_id BIGINT                NULL,
    start_date  date                  NULL,
    end_date    date                  NULL,
    status      VARCHAR(255)          NULL,
    CONSTRAINT pk_contracts PRIMARY KEY (id)
);

CREATE TABLE payments
(
    id          BIGINT AUTO_INCREMENT NOT NULL,
    contract_id BIGINT                NULL,
    amount      DECIMAL(12, 2)        NULL,
    due_date    date                  NULL,
    type        VARCHAR(255)          NULL,
    CONSTRAINT pk_payments PRIMARY KEY (id)
);

CREATE TABLE preferences
(
    id              BIGINT AUTO_INCREMENT NOT NULL,
    user_id         BIGINT                NULL,
    budget          DECIMAL(12, 2)        NULL,
    city            VARCHAR(255)          NULL,
    smoking_allowed BIT(1)                NULL,
    CONSTRAINT pk_preferences PRIMARY KEY (id)
);

CREATE TABLE profiles
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    user_id    BIGINT                NULL,
    bio        VARCHAR(2000)         NULL,
    age        INT                   NULL,
    avatar_url VARCHAR(255)          NULL,
    CONSTRAINT pk_profiles PRIMARY KEY (id)
);

CREATE TABLE properties
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    title         VARCHAR(255)          NULL,
    address       VARCHAR(255)          NULL,
    city          VARCHAR(255)          NULL,
    `description` VARCHAR(2000)         NULL,
    owner_id      BIGINT                NULL,
    CONSTRAINT pk_properties PRIMARY KEY (id)
);

CREATE TABLE rooms
(
    id           BIGINT AUTO_INCREMENT NOT NULL,
    property_id  BIGINT                NULL,
    name         VARCHAR(255)          NULL,
    price        DECIMAL(12, 2)        NULL,
    is_available BIT(1)                NULL,
    CONSTRAINT pk_rooms PRIMARY KEY (id)
);

CREATE TABLE tenants
(
    id          BIGINT AUTO_INCREMENT NOT NULL,
    contract_id BIGINT                NULL,
    user_id     BIGINT                NULL,
    room_id     BIGINT                NULL,
    CONSTRAINT pk_tenants PRIMARY KEY (id)
);

CREATE TABLE users
(
    id        BIGINT AUTO_INCREMENT NOT NULL,
    email     VARCHAR(255)          NULL,
    password  VARCHAR(255)          NULL,
    nom       VARCHAR(255)          NULL,
    prenom    VARCHAR(255)          NULL,
    telephone VARCHAR(255)          NULL,
    CONSTRAINT pk_users PRIMARY KEY (id)
);

ALTER TABLE ad_photo_urls
    ADD CONSTRAINT fk_ad_photourls_on_ad FOREIGN KEY (ad_id) REFERENCES ads (id);