CREATE DATABASE IF NOT EXISTS chat_db;

create table chat_db.usuario(
  id int not null auto_increment,
  nombres varchar(255),
  apellidos varchar(255),
  email varchar(255),
  password varchar(255),
  primary key (id)
);
create table chat_db.conversacion(
  id int not null auto_increment,
  fecha_ini timestamp
);
create table chat_db.mensaje(
  id int not null auto_increment,
  id_usuario int,
  id_conversacion int,
  texto varchar(255),
  fecha timestamp,
  primary key(id),
  foreign key(id_usuario) references usuario(id),
  foreign key(id_conversacion) references conversacion(id)
);

INSERT INTO `chat_db`.`usuario` (`nombres`, `apellidos`, `email`, `password`) VALUES ('Carlos', 'Perez', 'carlos@gmail.com', '1234');
INSERT INTO `chat_db`.`usuario` (`nombres`, `apellidos`, `email`, `password`) VALUES ('Paul', 'Smith', 'paul@gmail.com', '1234');
INSERT INTO `chat_db`.`usuario` (`nombres`, `apellidos`, `email`, `password`) VALUES ('Katty', 'McCain', 'katty@gmail.com', '1234');
insert into conversacion(fecha_ini) values(sysdate());
insert into mensaje(id_usuario,id_conversacion,texto,fecha) values(2,2,'hola carlos',sysdate());
insert into mensaje(id_usuario,id_conversacion,texto,fecha) values(3,2,'hola katty',sysdate());

--usuario: root - password: root
