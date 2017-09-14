CREATE TABLE `bike` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `model` varchar(50) DEFAULT NULL,
  `manufacturer` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bike
-- ----------------------------
INSERT INTO `bike` VALUES ('1', 'CBR250R', 'Honda');
INSERT INTO `bike` VALUES ('2', 'Ninja250R', 'Kaswasaki');
INSERT INTO `bike` VALUES ('3', 'R1', 'Yamaha');
INSERT INTO `bike` VALUES ('4', 'FatBoy', 'Harley Davidson');
