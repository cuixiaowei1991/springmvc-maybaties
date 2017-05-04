/*
SQLyog Ultimate v11.25 (64 bit)
MySQL - 5.6.24 : Database - ycydb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ycydb` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ycydb`;

/*Table structure for table `ycy_user` */

DROP TABLE IF EXISTS `ycy_user`;

CREATE TABLE `ycy_user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `name` varchar(50) NOT NULL DEFAULT '""' COMMENT '用户名',
  `password` varchar(50) NOT NULL DEFAULT '""' COMMENT '密码',
  `sex` varchar(50) NOT NULL DEFAULT '男' COMMENT '性别',
  `description` varchar(2000) NOT NULL DEFAULT '""' COMMENT '描述',
  `enable` int(11) NOT NULL DEFAULT '0' COMMENT '是否启用',
  `flag` int(11) NOT NULL DEFAULT '0' COMMENT '标志位',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `ycy_user` */

insert  into `ycy_user`(`user_id`,`name`,`password`,`sex`,`description`,`enable`,`flag`) values (1,'杨长用','123456','男','描述',0,0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
