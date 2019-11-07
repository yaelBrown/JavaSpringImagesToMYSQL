DROP DATABASE IF EXISTS images_upload;

CREATE DATABASE images_upload;

USE images_upload;

SHOW create table imgs;

CREATE TABLE `imgs` (
    `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;