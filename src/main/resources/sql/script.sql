create database sql8642523;

use sql8642523;

create table `users`(
    `id` INT NOT NULL AUTO_INCREMENT,
    `username` VARCHAR(45) NOT NULL,
    `password` VARCHAR(45) NOT NULL,
    `enabled` INT NOT NULL,
    PRIMARY KEY (`id`)
);

create table `authorities`(
    `id` int NOT NULL AUTO_INCREMENT,
    `username` VARCHAR(45) NOT NULL,
    `authority` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`id`)
);

INSERT IGNORE INTO `users` VALUES (NULL, 'dev', '12345', 1);
INSERT IGNORE INTO `authorities` VALUES (NULL, 'developer', 'write');