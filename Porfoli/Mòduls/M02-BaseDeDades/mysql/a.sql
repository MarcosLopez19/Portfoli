CREATE DATABASE EMPRESA;
USE EMPRESA;
create table EMPLEAT(
codi INT(4) primary KEY,
nom CHAR(15),
cognoms VARCHAR(30),
codi_carrec INT(4),
data_contracte date,
salari INT(7),
comissio INT(7),
departament INT(2));
ALTER TABLE EMPLEAT modify salari decimal(5,2) NOT NULL;
INSERT INTO EMPLEAT(codi,nom,cognoms,codi_carrec,data_contracte,salari,comissio,departament) value(6372,'Marcos','Lopez Salvador',4321,'2021/11/09',312.34,7231,2);
UPDATE EMPLEAT SET codi=6371 where codi='6372';
create table DEPARTAMENT(
nom_departament int unique,
numero_dep int(2) primary key,
nom_dep char(9),
localitzacio char(10));

create table DEPARTAMENT2(
nom_departament int ,
nom_dep char(9),
localitzacio char(10),
numero_dep int(2),
PRIMARY KEY(numero_dep),
foreign key(numero_dep) REFERENCES DEPARTAMENT(numero_dep));

create table EMPLEAT2(
codi INT(4) primary KEY,
nom CHAR(15),
cognoms VARCHAR(30),
codi_carrec INT(4),
data_contracte date,
salari INT(7),
comissio INT(7),
departament INT(2),
numero_dep int(2),
foreign key(numero_dep) REFERENCES DEPARTAMENT2(numero_dep));
ALTER TABLE EMPLEAT2 modify salari decimal(5,2) NOT NULL;
ALTER TABLE EMPLEAT2 ADD CONSTRAINT unic_sal_conm unique(salari,comissio);