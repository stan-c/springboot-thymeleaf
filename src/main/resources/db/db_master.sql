
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `createdDate` datetime DEFAULT NULL,
  `lastModifiedDate` datetime DEFAULT NULL,
  `version` varchar(255) DEFAULT NULL,
  `departmentName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '2018-11-26 11:29:57', '2018-11-26 11:29:57', '0', 'D-AA');
INSERT INTO `department` VALUES ('2', '2018-11-26 11:29:57', '2018-11-26 11:29:57', '0', 'D-BB');
INSERT INTO `department` VALUES ('3', '2018-11-26 11:29:57', '2018-11-26 11:29:57', '0', 'D-CC');
INSERT INTO `department` VALUES ('4', '2018-11-26 11:29:57', '2018-11-26 11:29:57', '0', 'D-DD');
INSERT INTO `department` VALUES ('5', '2018-11-26 11:29:57', '2018-11-26 11:29:57', '0', 'D-EE');

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `createdDate` datetime DEFAULT NULL,
  `lastModifiedDate` datetime DEFAULT NULL,
  `version` varchar(255) DEFAULT NULL,
  `lastName` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `birth` datetime DEFAULT NULL,
  `departmentId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', '2018-11-26 11:17:17', '2018-11-26 11:17:20', '0', 'E-AA', 'aa@163.com', '1', '2018-11-26 11:43:47', '1');
INSERT INTO `employee` VALUES ('2', '2018-11-26 11:17:17', '2018-11-26 11:17:20', '0', 'E-BB1', 'BB@163.com', '1', '2018-11-26 11:43:47', '2');
INSERT INTO `employee` VALUES ('3', '2018-11-26 11:17:17', '2018-11-26 11:17:20', '0', 'E-CC', 'CC@163.com', '0', '2018-11-26 11:43:47', '3');
INSERT INTO `employee` VALUES ('4', '2018-11-26 11:17:17', '2018-11-26 11:17:20', '0', 'E-DD', 'DD@163.com', '0', '2018-11-26 11:43:47', '4');
INSERT INTO `employee` VALUES ('5', '2018-11-26 11:17:17', '2018-11-26 11:17:20', '0', 'E-EE', 'EE@163.com', '1', '2018-11-26 11:43:47', '5');
