/*
Navicat MySQL Data Transfer

Source Server         : sports
Source Server Version : 50709
Source Host           : localhost:3306
Source Database       : sports

Target Server Type    : MYSQL
Target Server Version : 50709
File Encoding         : 65001

Date: 2016-03-09 19:51:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `comment`
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `commentId` int(11) NOT NULL AUTO_INCREMENT,
  `fromUser` varchar(48) NOT NULL,
  `toUser` varchar(48) NOT NULL,
  `inData` datetime NOT NULL,
  `newComment` varchar(100) DEFAULT NULL,
  `content` varchar(100) NOT NULL,
  `reply` varchar(100) DEFAULT NULL,
  `commentLevel` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`commentId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES ('1', 'xiaoqin', 'qinyu', '2016-01-08 00:00:00', null, 'ni hao', null, null);

-- ----------------------------
-- Table structure for `friends`
-- ----------------------------
DROP TABLE IF EXISTS `friends`;
CREATE TABLE `friends` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` varchar(48) NOT NULL,
  `friendsId` varchar(48) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of friends
-- ----------------------------
INSERT INTO `friends` VALUES ('1', 'xiaoqin', 'qinyu');
INSERT INTO `friends` VALUES ('2', 'qinyu', 'xiaoqin');
INSERT INTO `friends` VALUES ('3', 'qinyu', 'xiaoyu');
INSERT INTO `friends` VALUES ('4', 'xiaoyu', 'qinyu');

-- ----------------------------
-- Table structure for `orders`
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `ordersId` int(11) NOT NULL,
  `fromUser` varchar(48) NOT NULL,
  `toSeller` varchar(48) NOT NULL,
  `sportId` int(11) NOT NULL,
  `orderTime` datetime NOT NULL,
  `payStatus` varchar(45) NOT NULL,
  `startTime` datetime NOT NULL,
  `prices` float NOT NULL,
  `count` int(11) NOT NULL,
  `remarks` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ordersId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('1', 'jc', 'jc', '4', '2016-01-08 00:00:00', '0', '0000-00-00 00:00:00', '100', '1', 'sss');
INSERT INTO `orders` VALUES ('2', 'meimei', 'xiaomei', '2', '2016-01-08 00:00:00', '1', '2016-01-08 00:00:00', '200', '2', 'eee');
INSERT INTO `orders` VALUES ('3', 'qinyu', 'meimei', '3', '2016-01-09 00:00:00', '2', '2016-01-09 00:00:00', '300', '3', '333');
INSERT INTO `orders` VALUES ('4', 'xiaomei', 'meimei', '4', '2016-01-10 00:00:00', '4', '2016-01-10 00:00:00', '400', '4', '444');
INSERT INTO `orders` VALUES ('5', 'meimei', 'qinyu', '2', '2016-02-18 12:03:35', '3', '2016-02-18 12:03:48', '1009', '6', '555');
INSERT INTO `orders` VALUES ('7', 'meimei', 'jc', '2', '2016-01-08 00:00:00', '2', '2016-01-08 00:00:00', '9', '1848', null);
INSERT INTO `orders` VALUES ('8', 'meimei', 'jc', '2', '2016-01-08 00:00:00', '2', '2016-01-08 00:00:00', '1', '3', null);
INSERT INTO `orders` VALUES ('9', 'meimei', 'jc', '2', '2016-01-08 00:00:00', '2', '2016-01-08 00:00:00', '1388', '9', null);
INSERT INTO `orders` VALUES ('10', 'meimei', 'jc', '2', '2016-01-08 00:00:00', '2', '2016-01-08 00:00:00', '100', '3', null);
INSERT INTO `orders` VALUES ('11', 'meimei', 'jc', '2', '2016-01-08 00:00:00', '2', '2016-01-08 00:00:00', '100', '3', null);
INSERT INTO `orders` VALUES ('12', 'meimei', 'jc', '2', '2016-01-08 00:00:00', '2', '2016-01-08 00:00:00', '100', '3', null);

-- ----------------------------
-- Table structure for `position`
-- ----------------------------
DROP TABLE IF EXISTS `position`;
CREATE TABLE `position` (
  `positionId` int(11) NOT NULL AUTO_INCREMENT,
  `locationName` varchar(45) NOT NULL,
  `longitude` varchar(45) NOT NULL,
  `latitude` varchar(45) NOT NULL,
  `photos` varchar(45) DEFAULT NULL,
  `onlineStatus` enum('0','1') NOT NULL,
  `venueName` varchar(45) DEFAULT NULL,
  `ip` varchar(20) NOT NULL,
  `loginTime` datetime NOT NULL,
  PRIMARY KEY (`positionId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of position
-- ----------------------------
INSERT INTO `position` VALUES ('1', 'xuefuzhonglu', '108.56.32.60', '34.15.39.59', null, '0', 'jianshen', '127.0.0.1', '2016-01-07 21:05:00');
INSERT INTO `position` VALUES ('2', 'xiaozhai', '108.94.06.07', '34.25.04.07', null, '1', null, '192.168.68.43', '2016-01-07 21:05:00');
INSERT INTO `position` VALUES ('3', 'dayanta', '107.40.00.00', '33.42.00.00', null, '1', null, '127.0.0.1', '2016-01-07 21:05:00');

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `roleId` int(11) NOT NULL,
  `roleType` varchar(45) NOT NULL,
  `reloDesc` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`roleId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('0', 'admin', '');
INSERT INTO `role` VALUES ('1', 'seller', null);
INSERT INTO `role` VALUES ('2', 'coach', null);
INSERT INTO `role` VALUES ('3', 'user', null);

-- ----------------------------
-- Table structure for `sport`
-- ----------------------------
DROP TABLE IF EXISTS `sport`;
CREATE TABLE `sport` (
  `sportId` int(11) NOT NULL AUTO_INCREMENT,
  `sportName` varchar(100) NOT NULL,
  `sportDesc` varchar(255) DEFAULT NULL,
  `sportTol` int(11) DEFAULT NULL,
  `availableCou` int(11) DEFAULT NULL,
  PRIMARY KEY (`sportId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of sport
-- ----------------------------
INSERT INTO `sport` VALUES ('4', 'basketball', null, '10', '2');
INSERT INTO `sport` VALUES ('5', 'football', null, '20', '18');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` varchar(48) NOT NULL,
  `password` varchar(100) NOT NULL,
  `nick` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `birth` datetime DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(45) NOT NULL,
  `address` varchar(45) DEFAULT NULL,
  `sex` enum('0','1') DEFAULT NULL,
  `introduces` varchar(256) DEFAULT NULL,
  `headPicture` varchar(45) DEFAULT NULL,
  `regTime` datetime NOT NULL,
  `skill` varchar(100) DEFAULT NULL,
  `ordersId` int(11) DEFAULT NULL,
  `commentId` int(11) DEFAULT NULL,
  `friendsId` int(11) DEFAULT NULL,
  `positionId` int(11) DEFAULT NULL,
  `integration` int(10) DEFAULT NULL,
  `roleType` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('13791282222', '222222', null, null, null, null, '13791282222', null, null, null, null, '2016-02-28 21:19:06', null, null, null, null, null, null, null);
INSERT INTO `user` VALUES ('13991282222', '222222', null, null, null, null, '13991282222', null, null, null, null, '2016-02-29 13:43:17', null, null, null, null, null, null, null);
INSERT INTO `user` VALUES ('jc', '111111', 'jc', 'jc', '1994-05-11 00:00:00', 'jiachao@mail.com', '110110110', '111111', '0', '111111', '111111', '1994-05-11 00:00:00', '', '1', '1', '1', '0', '0', '0');
INSERT INTO `user` VALUES ('meimei', '111111', 'meimei', 'meimei', '1994-05-11 00:00:00', 'meimei@mail.com', '110110110', '222222', '0', '222222', '222222', '1994-05-11 00:00:00', null, '2', '2', '2', '0', '0', '1');
INSERT INTO `user` VALUES ('meimeimei', '222222', 'meismei', 'sa', '2016-02-28 17:40:41', 'meimei@mail.com', '029-83948084', '222222', '0', '222222', '222222', '2016-02-24 17:40:41', '222', '1', '1', '1', '1', '1', '1');
INSERT INTO `user` VALUES ('qinyu', '111111', 'qy', 'qinyu', '1994-05-11 00:00:00', 'qinyu.LT@gmail.com', '18709287439', '333333', '1', '333333', '333333', '2016-01-07 20:21:00', null, '3', '3', '3', '0', '0', '1');
INSERT INTO `user` VALUES ('xiaochao', '111111', 'xiaochao', 'xiaochao', '1994-05-11 00:00:00', 'qinyu.LT@gmail.com', '18709287435', '111111', '1', '111111', '111111', '2016-01-07 20:21:00', null, '1', '1', '1', '0', '0', '3');
INSERT INTO `user` VALUES ('xiaomei', '111111', 'xiaomei', 'xiaomei', '1994-05-11 00:00:00', '407936573@qq.com', '18709287436', '444444', '0', '444444', '444444', '2016-01-07 20:21:00', null, '4', '4', '4', '0', '0', '2');

-- ----------------------------
-- Table structure for `user_position`
-- ----------------------------
DROP TABLE IF EXISTS `user_position`;
CREATE TABLE `user_position` (
  `userId` varchar(48) NOT NULL,
  `positionId` int(11) NOT NULL,
  PRIMARY KEY (`userId`,`positionId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user_position
-- ----------------------------
INSERT INTO `user_position` VALUES ('qinyu', '1');
INSERT INTO `user_position` VALUES ('xiaoqin', '1');
INSERT INTO `user_position` VALUES ('xiaoyu', '3');

-- ----------------------------
-- Table structure for `user_role`
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `roleId` int(11) NOT NULL,
  `userId` varchar(48) NOT NULL,
  PRIMARY KEY (`roleId`,`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('0', 'jc');
INSERT INTO `user_role` VALUES ('0', 'meimei');
INSERT INTO `user_role` VALUES ('0', 'qinyu');
INSERT INTO `user_role` VALUES ('1', 'jiachao');
INSERT INTO `user_role` VALUES ('1', 'qinyu');
INSERT INTO `user_role` VALUES ('2', 'xiaomei');
INSERT INTO `user_role` VALUES ('3', 'xiaochao');

-- ----------------------------
-- Table structure for `user_sport`
-- ----------------------------
DROP TABLE IF EXISTS `user_sport`;
CREATE TABLE `user_sport` (
  `userId` varchar(48) NOT NULL,
  `sportId` int(11) NOT NULL,
  PRIMARY KEY (`userId`,`sportId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user_sport
-- ----------------------------
