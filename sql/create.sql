create table `yaoyu-frame`.sys_user
(
    id          bigint auto_increment
        primary key,
    name        varchar(16)                           null,
    age         int                                   null,
    create_by   varchar(64) default 'qiyao'           null,
    create_time datetime    default CURRENT_TIMESTAMP null,
    update_by   varchar(64) default 'qiyao'           null,
    update_time datetime    default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP,
    delete_flag tinyint     default 0                 null,
    version     int         default 0                 null
);
create table `yaoyu-frame`.user
(
    id          bigint auto_increment
        primary key,
    name        varchar(16)                           null,
    age         int                                   null,
    create_by   varchar(64) default 'qiyao'           null,
    create_time datetime    default CURRENT_TIMESTAMP null,
    update_by   varchar(64) default 'qiyao'           null,
    update_time datetime    default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP,
    delete_flag tinyint     default 0                 null,
    version     int         default 0                 null
);