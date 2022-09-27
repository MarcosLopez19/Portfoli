CREATE DATABASE IF NOT EXISTS gimnasio;
use gimnasio;
create table Tarjeta(
id_trj int(4) not null unique,
primary key(id_trj));

create table Clientes(
DNI char(9) not null unique,
nombre char(20),
apellido char(20),
id_trj int(4) not null unique,
primary key(DNI),
FOREIGN KEY (id_trj) REFERENCES Tarjeta (id_trj));
ALTER TABLE Clientes add fecha_accedio date;
ALTER TABLE Clientes add fecha_salido date;


create table recepcion(
DNI_rec char(9) not null unique,
nombre char(20),
apellido char(20),
primary key(DNI_rec));


create table zona_recepcio(
id_rec int(4) not null,
tablets char(20),
ordenadores char(20),
num_presonasdiarias int(3),
DNI_rec char(9) not null unique,
DNI_Client char(9) not null unique,
primary key(id_rec),
FOREIGN KEY (DNI_rec) REFERENCES recepcion (DNI_rec),
FOREIGN KEY (DNI_Client) REFERENCES Clientes(DNI));
ALTER TABLE zona_recepcio add horas_gim int(3);
ALTER TABLE zona_recepcio modify horas_gim int(4) not null;



create table zona_maquines(
id_maq int(4) not null,
tipo_maquinas char(20), 
primary key(id_maq),
id_rec int(4) not null,
FOREIGN KEY (id_rec) REFERENCES zona_recepcio (id_rec));


create table zona_cardio(
id_card int(4) not null,
tipo_maquinas char(20),
id_maq int(4) not null,
primary key(id_card),
FOREIGN KEY (id_maq) REFERENCES zona_maquines (id_maq));


CREATE TABLE zona_pesas (
    id_pesas INT(4) NOT NULL,
    tipo_MaquinasPesas CHAR(20),
    id_card INT(4) NOT NULL,
    PRIMARY KEY (id_pesas),
    FOREIGN KEY (id_card)
        REFERENCES zona_cardio (id_card)
);

INSERT INTO Tarjeta VALUES (1111),(2222),(3333),(4444),(5555);
UPDATE Tarjeta SET id_trj=1212 WHERE id_trj=1111;

INSERT INTO Clientes(DNI,nombre,apellido,id_trj,fecha_accedio,fecha_salido)
 VALUES ('11111111A','Marcos','Lopez',1111,'2021/8/8','2021/8/8'),
('22222222B','Adam','Sanchez',2222,'2021/9/8','2021/9/8'),
('33333333C','Lucas','Adria',3333,'2021/7/7','2021/7/7'),
('44444444F','Sara','Salvador',4444,'2021/6/7','2021/6/7'),
('55555555N','Carlos','Arrabal',5555,'2021/5/5','2021/5/5');

INSERT INTO recepcion(DNI_rec,nombre,apellido) 
VALUES ('99999999N','Marc','Perez'),
('88888888B','Pol','Bombardo'),
('77777777C','Pol','Gual'),
('66666666F','Joel','Martos'),
('12345678N','Gerard','Ruiz');

INSERT INTO zona_recepcio(id_rec,tablets,ordenadores,num_presonasdiarias,DNI_rec,DNI_Client,horas_gim) 
VALUES ('1111','ipadpromx9','hp-r4s9',54,'99999999N','11111111A',123),
('2222','ipadpromx9','hp-r3s2',62,'88888888B','22222222B',43),
('3333','ipadpromx9','hp-r5s1',43,'77777777C','33333333C',77),
('4444','ipadpromx9','hp-r2s4',56,'66666666F','44444444F',100),
('5555','ipadpromx9','hp-r41s2',66,'12345678N','55555555N',87);

INSERT INTO zona_maquines(id_maq,tipo_maquinas,id_rec)
VALUES (1234,'Banco press',1111),
(1235,'Prensa de piernas',2222),
(1236,'Maquina de dorsales',3333),
(1237,'Máquinas de remo',4444),
(1238,'Máquinas de remo2',5555);

INSERT INTO zona_cardio(id_card,tipo_maquinas,id_maq)
VALUES (4321,'Elíptica',1234),
(5321,'Bicicleta Vertical',1235),
(6321,' Cinta de Correr',1236),
(7321,'Escaladora',1237),
(8321,'Remo',1238);

INSERT INTO  zona_pesas(id_pesas,tipo_MaquinasPesas,id_card) 
VALUES (2645,'Prensa de Piernas',4321),
(9824,'Máquina de Poleas',5321),
(7824,' Cinta de Correr',6321),
(1735,'Banco Olímpico',7321),
(4934,'Banco de abdominales',8321);