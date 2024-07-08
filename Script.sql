CREATE DATABASE test_ejercicio4;

USE test_ejercicio4;

DROP TABLE IF EXISTS producto;

CREATE TABLE producto(
id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
nombre VARCHAR(30) NOT NULL,
precio DECIMAL(10, 2) NOT NULL,
cantidad INT NOT NULL);


INSERT INTO producto (nombre, precio, cantidad ) VALUES ('Nvidia Geforce GTX 1660', 130000, 5);
INSERT INTO producto (nombre, precio, cantidad) VALUES ('RX 580 8GB', 76000, 6);
INSERT INTO producto (nombre, precio, cantidad) VALUES ('Nvidia Geforce GTX 1660 TI 6GB', 200000, 10);



SELECT * FROM producto;