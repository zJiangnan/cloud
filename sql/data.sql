# 表1
create table payment
(
    id     bigint auto_increment
        primary key,
    serial varchar(255) null,
    constraint id
        unique (id)
);

insert into db_02.payment(id, serial)
values (1, 'aaa');