CREATE DATABASE IF NOT EXISTS chat_db;

CREATE TABLE `usuario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombres` varchar(255) DEFAULT NULL,
  `apellidos` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `chat_db`.`usuario` (`nombres`, `apellidos`, `email`, `password`) VALUES ('Carlos', 'Perez', 'carlos@gmail.com', '1234');
INSERT INTO `chat_db`.`usuario` (`nombres`, `apellidos`, `email`, `password`) VALUES ('Paul', 'Smith', 'paul@gmail.com', '1234');
INSERT INTO `chat_db`.`usuario` (`nombres`, `apellidos`, `email`, `password`) VALUES ('Katty', 'McCain', 'katty@gmail.com', '1234');

--usuario: root - password: root
