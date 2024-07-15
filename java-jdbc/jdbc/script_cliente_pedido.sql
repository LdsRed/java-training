CREATE database IF NOT EXISTS ejercicio4;

SHOW DATABASES; 

use ejercicio4;


DROP TABLE IF EXISTS clientes;

CREATE TABLE clientes(
id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
nombre VARCHAR(30) NOT NULL,
apellido VARCHAR(30) NOT NULL,
num_pedidos INT NOT NULL);


INSERT INTO clientes (nombre, apellido, num_pedidos ) VALUES ('Jordan', 'Larcher', 5);
INSERT INTO clientes (nombre, apellido, num_pedidos ) VALUES ('Sara', 'Fantini', 3);
INSERT INTO clientes (nombre, apellido, num_pedidos ) VALUES ('Angelo', 'Ocampo', 2);



SELECT * FROM clientes;


drop table if exists pedidos;

create table pedidos(
id int auto_increment primary key not null,
product_name varchar(30) not null,
serial_number varchar(30) not null);


insert into pedidos (product_name, serial_number) values ('Smart TV 47°', 'SHG34TY');
insert into pedidos (product_name, serial_number) values ('PC Gamer Asus I7', 'SHG35TU');
insert into pedidos (product_name, serial_number) values ('GTX 4060 Gygabite', 'SHG35TI');

select * from pedidos;