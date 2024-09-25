CREATE TABLE `pokemons` (
  `base_experience` int DEFAULT NULL,
  `hieght` int DEFAULT NULL,
  `id_evolution_chain` int DEFAULT NULL,
  `idpokemons` int NOT NULL,
  `is_default` bit(1) DEFAULT NULL,
  `weight` int DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`idpokemons`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci