/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 14/09/2020 11:04:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for emp
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `ename` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sal` decimal(8, 2) NULL DEFAULT NULL,
  `createby` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `createdate` datetime(0) NULL DEFAULT NULL,
  `deptno` int(4) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `fk_dept`(`deptno`) USING BTREE,
  CONSTRAINT `fk_dept` FOREIGN KEY (`deptno`) REFERENCES `dept` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of emp
-- ----------------------------
INSERT INTO `emp` VALUES (1, 'admin', '郑州', 6000.00, '张涛', '2020-09-19 09:16:51', 1);
INSERT INTO `emp` VALUES (2, '张三', '颍河路', 4500.00, NULL, '2020-09-01 09:16:51', 1);
INSERT INTO `emp` VALUES (3, '里斯', '颍河路', 5000.00, NULL, '2020-09-09 09:16:51', 1);
INSERT INTO `emp` VALUES (4, '赵六', '颍河路', 4500.00, NULL, '2020-09-09 09:16:51', 4);
INSERT INTO `emp` VALUES (5, '王五', '颍河路', 3000.00, NULL, '2020-09-09 09:16:51', 4);
INSERT INTO `emp` VALUES (6, '赵六2', '颍河路', 4500.00, NULL, '2020-09-09 09:16:51', 5);
INSERT INTO `emp` VALUES (7, '王五2', '颍河路', 4000.00, NULL, '2020-09-09 09:16:51', 5);
INSERT INTO `emp` VALUES (8, '小黑', NULL, 2500.00, NULL, '2020-09-09 09:16:51', 5);
INSERT INTO `emp` VALUES (9, '测试5', NULL, NULL, NULL, NULL, 7);

SET FOREIGN_KEY_CHECKS = 1;
