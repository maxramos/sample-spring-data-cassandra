-- *** USER ***
-- Default Password: changeit
-- Admin
INSERT INTO users(id, username, password)
VALUES(1, 'max.a.ramos', '$2a$10$wTrJXHGYS31v1jSVUdACoelFSHA.g13eBA.wjQnkb56rzAJPUlW8y');

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

-- *** AUTHORITY ***
INSERT INTO authorities(id, authority) VALUES(1, 'ROLE_ADMIN');

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

-- *** USER - AUTHORITY ***
-- Admin
INSERT INTO users_authorities(user_id, authority_id) VALUES(1, 1);