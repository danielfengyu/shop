/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50623
Source Host           : localhost:3306
Source Database       : shop

Target Server Type    : MYSQL
Target Server Version : 50623
File Encoding         : 65001

Date: 2017-12-10 16:09:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `customer_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `customer_name` varchar(30) NOT NULL DEFAULT '',
  `customer_address` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`customer_id`,`customer_name`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('12', 'fengyu', 'daying');

-- ----------------------------
-- Table structure for order_list
-- ----------------------------
DROP TABLE IF EXISTS `order_list`;
CREATE TABLE `order_list` (
  `order_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `customer_name` varchar(30) NOT NULL DEFAULT '',
  `production_name` varchar(30) NOT NULL DEFAULT '',
  `sold_num` int(10) unsigned NOT NULL DEFAULT '0',
  `production_one_value` double(16,2) NOT NULL,
  `production_all_value` double(16,2) NOT NULL,
  `sold_time` date NOT NULL,
  `discount_price` float(4,3) NOT NULL DEFAULT '1.000',
  `is_pay` char(4) NOT NULL,
  `pay_time` date NOT NULL,
  `descrip` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`order_id`,`customer_name`,`production_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_list
-- ----------------------------

-- ----------------------------
-- Table structure for production
-- ----------------------------
DROP TABLE IF EXISTS `production`;
CREATE TABLE `production` (
  `production_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `production_name` varchar(30) NOT NULL DEFAULT '',
  `production_in_value` double(16,2) DEFAULT NULL,
  `production_out_value` double(16,2) DEFAULT NULL,
  `production_num` int(10) unsigned DEFAULT '0',
  `stock_time` date DEFAULT NULL,
  `sold_time` date DEFAULT NULL,
  PRIMARY KEY (`production_id`,`production_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of production
-- ----------------------------

-- ----------------------------
-- Table structure for shop_manager
-- ----------------------------
DROP TABLE IF EXISTS `shop_manager`;
CREATE TABLE `shop_manager` (
  `user_id` char(32) NOT NULL,
  `user_name` varchar(30) DEFAULT NULL,
  `user_birthday` date DEFAULT NULL,
  `user_salary` double DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shop_manager
-- ----------------------------

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(30) DEFAULT NULL,
  `user_password` varchar(30) DEFAULT NULL,
  `register_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'fengyu', 'fengyu', '2016-04-29 21:00:50');
