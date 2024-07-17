drop database if exists ejercicio04;
create database ejercicio04;
use ejercicio04;


create table clientes(
id_cliente int not null primary key auto_increment, 
nombre varchar(30) not null, 
direccion varchar(40) not null,
cantidad_pedidos int not null);

create table pedidos(
id_pedidos int not null primary key auto_increment,
nombre_producto varchar(40) not null,
cantidad_productos int not null,
numero_serie int not null,
id_cliente int, 
foreign key (id_cliente) references clientes(id_cliente)
);


INSERT INTO clientes (nombre, direccion, cantidad_pedidos) VALUES
('Jordan Larcher', 'Padre Cerqueira 550', 4),
('Sara Fantini', 'Padre Cerqueira 550', 5),
('Angelo Fantini', 'Ruiz De Montoya', 5);




INSERT INTO pedidos (nombre_producto, cantidad_productos, numero_serie, id_cliente) VALUES
('Nvidia Geforce GTX 1660 PNY', 4, 3512312, 1),
('RX580', 2, 3512200, 2),
('RX590', 4, 3522312, 3),
('RX560', 7, 3513312, 1),
('RTX 4060', 2, 3512111, 2),
('RTX 3050', 6, 3512112, 3),
('Radeon RX 6700', 4, 3512113, 1),
('RTX 6900', 4, 3512114, 2);


select * from pedidos;
select * from clientes;