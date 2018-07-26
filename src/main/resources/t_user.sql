/*
Navicat MySQL Data Transfer

Source Server         : my_localhost
Source Server Version : 50015
Source Host           : localhost:33306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 50015
File Encoding         : 65001

Date: 2018-07-26 14:46:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `user_id` int(11) NOT NULL auto_increment,
  `user_name` varchar(255) NOT NULL COMMENT '名称',
  `password` varchar(255) NOT NULL COMMENT '密码',
  `phone` varchar(255) NOT NULL,
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', '1', '1', '1');
INSERT INTO `t_user` VALUES ('2', '2', '2', '2');
INSERT INTO `t_user` VALUES ('3', '4', '5', '5');
INSERT INTO `t_user` VALUES ('4', '4', '4', '4');
INSERT INTO `t_user` VALUES ('5', '5', '5', '5');
INSERT INTO `t_user` VALUES ('7', '7', '7', '7');
INSERT INTO `t_user` VALUES ('8', '7', '7', '7');
