-- borra la bd si existe
DROP DATABASE IF EXISTS botica64;
-- creamos la bd
CREATE DATABASE botica64;
-- activamos la bd
USE botica64;

CREATE TABLE tb_usuario(
id_usuario int auto_increment primary key,
username varchar(255),
password varchar(255)
);

CREATE TABLE tb_cliente (
  id_cliente INT NOT NULL AUTO_INCREMENT,
  nombre_completo VARCHAR(255),
  direccion VARCHAR(255),
  telefono VARCHAR(255),
  correo_electronico VARCHAR(255),
  DNI VARCHAR(255),
  PRIMARY KEY (id_cliente)
);

CREATE TABLE tb_cargo (
id_cargo int primary key,
descripcion varchar(255)
);

CREATE TABLE tb_empleado (
  id_empleado int NOT NULL,
  nombre VARCHAR(255),
  id_cargo int not null,
  id_usuario int not null,
  salario DECIMAL(10,2),
  DNI VARCHAR(255),
  PRIMARY KEY (id_empleado),
  foreign key (id_cargo) references tb_cargo (id_cargo),
  foreign key (id_usuario) references tb_usuario (id_usuario)
);

CREATE TABLE tb_categoria (
id_categoria int not null,
descripcion varchar(255),
primary key (id_categoria)
);

CREATE TABLE tb_producto (
  id_producto int auto_increment NOT NULL,
  nombre_producto VARCHAR(255),
  laboratorio VARCHAR(255),
  stock_unidades INT,
  precio_unidad DECIMAL(10,2),
  precio_empaq DECIMAL(10,2),
  fecha_de_caducidad DATE,
  id_categoria int not null,
  PRIMARY KEY (id_producto),
  foreign key (id_categoria) references tb_categoria (id_categoria)
);

/*
CREATE TABLE tb_proveedor (
  id_proveedor INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(255),
  direccion VARCHAR(255),
  telefono VARCHAR(255),
  correo_electronico VARCHAR(255),
  PRIMARY KEY (id_proveedor)
);
*/
CREATE TABLE tb_venta (
  id_venta INT NOT NULL AUTO_INCREMENT,
  id_empleado int not null,
  id_cliente INT not null,
  fecha_de_venta DATE,
  metodo_de_pago VARCHAR(255),
  total decimal(10,2),
  PRIMARY KEY (id_venta),
  FOREIGN KEY (id_empleado) REFERENCES tb_empleado(id_empleado),
  FOREIGN KEY (id_cliente) REFERENCES tb_cliente(id_cliente)
);

CREATE TABLE tb_detalle_venta (
id_detalle_venta int auto_increment primary key,
id_venta int not null,
id_producto int not null,
cantidad INT,
precio decimal(10,2),
subtotal decimal(10,2),
foreign key (id_venta) references tb_venta (id_venta),
foreign key (id_producto) references tb_producto (id_producto)
);

USE botica64;
select * from tb_producto;

insert into tb_cargo values(1,"Farmaceutico");
insert into tb_cargo values(2,"Cajero");

insert into tb_usuario values(1,"U001","123456");
insert into tb_usuario values(2,"U002","123456");

insert into tb_empleado values(1,"Rodriguez Fernandez Maria","1",1,1500,725671);
insert into tb_empleado values(2,"Marcheveli Rios Vanesa","2",2,1000,45121495);
