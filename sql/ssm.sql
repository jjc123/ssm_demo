CREATE DATABASE `myfirstssm`;

USE `myfirstssm`;

CREATE TABLE `test` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `description` varchar(100) NOT NULL DEFAULT '''''' COMMENT '描述',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

LOCK TABLES `test` WRITE;

INSERT INTO `test` (`id`, `description`, `create_time`)
VALUES
	(1,'自己动手实现一个精美且实用的JavaWeb后台管理系统','2018-06-27 15:12:13');

UNLOCK TABLES;