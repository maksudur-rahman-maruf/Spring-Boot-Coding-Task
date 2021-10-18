
create table if not exists users
(
    id integer not null,
    email varchar(255) not null,
    name varchar(255) not null,
    password varchar(255) not null,
    primary key (id)
);

create table if not exists roles
(
    id integer not null,
    name varchar(255) not null,
    primary key (id)
);


create table if not exists user_role
(
    user_id integer not null,
    role_id integer not null
);


INSERT INTO roles (id, name)
VALUES (1, 'ROLE_ADMIN'),
       (2, 'ROLE_ACTUATOR'),
       (3, 'ROLE_USER')
;

INSERT INTO users (id, email, password, name)
VALUES (1, 'admin@gmail.com', '$2a$10$SRehTdbA6gP9nV6ao4Mdg.3MtciG3mv/PlHWo8mVzpzOutOuWoOym', 'Admin'),
       (3, 'user@gmail.com', '$2a$10$n6xL9wcTpaQI7.7iOjQu4e31k360Xqkff3szbjLlXgsHuxDHnjzN.', 'User');
-- admin@gmail.com,  password: admin123
-- user@gmail.com,  password: user123

insert into user_role(user_id, role_id)
values (1, 1),
       (1, 2),
       (1, 3),
       (3, 3),
       (3, 2);





