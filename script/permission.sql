-- ----------------------------
-- Table structure for module
-- ----------------------------
DROP TABLE IF EXISTS `p_module`;
CREATE TABLE `p_module` (
  `id` varchar(64) NOT NULL,
  `ctime` datetime NOT NULL,
  `mtime` datetime DEFAULT NULL,
  `order` int DEFAULT 0,
  `icon` varchar(255) DEFAULT NULL,
  `label` varchar(255) NOT NULL,
  `value` varchar(255) NOT NULL,
  `hint` varchar(255) DEFAULT NULL,
  `fa_module_id` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for action
-- ----------------------------
DROP TABLE IF EXISTS `p_action`;
CREATE TABLE `p_action` (
  `id` varchar(64) NOT NULL,
  `ctime` datetime NOT NULL,
  `mtime` datetime DEFAULT NULL,
  `order` int DEFAULT 0,
  `icon` varchar(255) DEFAULT NULL,
  `label` varchar(255) NOT NULL,
  `value` varchar(255) NOT NULL,
  `hint` varchar(255) DEFAULT NULL,
  `module_id` varchar(64) NOT NULL,
  `action` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `p_role`;
CREATE TABLE `p_role` (
  `id` varchar(64) NOT NULL,
  `ctime` datetime NOT NULL,
  `mtime` datetime DEFAULT NULL,
  `order` int DEFAULT 0,
  `name` varchar(255) NOT NULL,
  `desc` varchar(255) DEFAULT NULL,
  `inuse` boolean DEFAULT FALSE ,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `p_account`;
CREATE TABLE `p_account` (
  `id` varchar(64) NOT NULL,
  `ctime` datetime NOT NULL,
  `mtime` datetime DEFAULT NULL,
  `order` int DEFAULT 0,
  `account` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `inuse` boolean DEFAULT FALSE ,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for rma
-- ----------------------------
DROP TABLE IF EXISTS `p_rma`;
CREATE TABLE `p_rma` (
  `role_id` varchar(64) NOT NULL,
  `module_id` varchar(64) NOT NULL,
  `action_id` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for ar
-- ----------------------------
DROP TABLE IF EXISTS `p_ar`;
CREATE TABLE `p_ar` (
  `account_id` varchar(64) NOT NULL,
  `role_id` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
