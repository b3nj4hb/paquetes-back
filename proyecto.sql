create database paquetes;
create user paquetes identified by '123456';
GRANT ALL PRIVILEGES ON paquetes.* TO paquetes;
FLUSH PRIVILEGES;

use paquetes;

INSERT INTO cliente (apellidos, nombres, sexo, pais, fnacimiento, didentidad, foto) VALUES
('Gomez', 'Juan', 'Masculino', 'Argentina', '1990-05-15', '123456789', 'juan.jpg'),
('Rodriguez', 'Maria', 'Femenino', 'Mexico', '1985-08-22', '987654321', 'maria.jpg'),
('Lopez', 'Carlos', 'Masculino', 'Spain', '1995-03-10', '456789012', 'carlos.jpg'),
('Martinez', 'Laura', 'Femenino', 'Colombia', '1988-11-05', '321098765', 'laura.jpg'),
('Fernandez', 'Pedro', 'Masculino', 'Peru', '1992-07-18', '789012345', 'pedro.jpg');

INSERT INTO destino (ciudad) VALUES
('Paris'),
('New York'),
('Tokyo'),
('Rio de Janeiro'),
('Sydney');

INSERT INTO empleado (nombrec, dni, direccion, cargo) VALUES
('Ana Gonzalez', '11223344', 1234, 'Recepcionista'),
('Luis Rodriguez', '55667788', 5678, 'Guia Turistico'),
('Elena Ramirez', '99001122', 91011, 'Cocinero'),
('Javier Perez', '33445566', 1213, 'Conductor'),
('Maria Garcia', '77889900', 1415, 'Gerente');

INSERT INTO paquete (iddestino, tipo, nombre, preciocosto, precioventa, fechainicio, fechatermino, categoria, fechaconfirmacion, cupos, vigente) VALUES
(1, 1, 'Tour Romantico', 500.00, 800.00, '2023-05-01', '2023-05-07', 1, '2023-04-15', 20, 1),
(2, 2, 'City Explorer', 700.00, 1100.00, '2023-06-10', '2023-06-18', 2, '2023-05-25', 15, 1),
(3, 1, 'Tokyo Adventure', 1000.00, 1500.00, '2023-07-05', '2023-07-15', 3, '2023-06-20', 10, 1),
(4, 3, 'Carnival Experience', 800.00, 1200.00, '2023-08-20', '2023-08-27', 4, '2023-08-01', 25, 1),
(5, 2, 'Down Under Expedition', 1200.00, 1800.00, '2023-09-15', '2023-09-25', 5, '2023-08-30', 12, 1);

INSERT INTO reserva (idpaquete, idcliente, fecha, cantidad, tipopago, totalventa, descuento, totalneto, confirmado, anulado, codempleado) VALUES
(1, 1, '2023-04-20', '2', 1, 1600.00, 100.00, 1500.00, 'Si', 'No', 2),
(2, 2, '2023-05-30', '3', 2, 3300.00, 200.00, 3100.00, 'Si', 'No', 3),
(3, 3, '2023-06-25', '1', 1, 1500.00, 0.00, 1500.00, 'Si', 'No', 1),
(4, 4, '2023-08-10', '5', 3, 6000.00, 400.00, 5600.00, 'Si', 'No', 4),
(5, 5, '2023-09-20', '2', 2, 3600.00, 150.00, 3450.00, 'Si', 'No', 5);
