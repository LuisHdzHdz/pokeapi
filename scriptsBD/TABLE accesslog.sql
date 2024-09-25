CREATE TABLE `pokeapi`.`accesslog` (
  `idaccesslog` int NOT NULL AUTO_INCREMENT,
  `client` varchar(255) DEFAULT NULL,
  `resource` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idaccesslog`)
) ENGINE=InnoDB AUTO_INCREMENT=6348 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci