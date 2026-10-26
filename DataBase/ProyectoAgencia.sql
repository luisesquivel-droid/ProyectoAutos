CREATE DATABASE ProyectoAgencia;
USE ProyectoAgencia;

-- -----------------------------------------------------
-- Table empleados
-- -----------------------------------------------------
CREATE TABLE empleados (
  idempleados INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  puesto VARCHAR(45) NOT NULL,
  telefono VARCHAR(20) NOT NULL,
  correo VARCHAR(100) NOT NULL,
  PRIMARY KEY (idempleados)
) ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table clientes
-- -----------------------------------------------------
CREATE TABLE clientes (
  idclientes INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  email VARCHAR(100) NOT NULL,
  telefono VARCHAR(20) NOT NULL,
  password VARCHAR(255) NOT NULL,  -- 255 para guardar un hash
  PRIMARY KEY (idclientes),
  UNIQUE KEY uq_clientes_email (email)
) ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table almacen
-- -----------------------------------------------------
CREATE TABLE almacen (
  idalmacen INT NOT NULL AUTO_INCREMENT,
  nom_sucursal VARCHAR(45) NOT NULL,
  ubicacion VARCHAR(100) NOT NULL,
  capacidad INT NOT NULL,
  PRIMARY KEY (idalmacen)
) ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table vehiculos
-- -----------------------------------------------------
CREATE TABLE vehiculos (
  id_vehiculos INT NOT NULL AUTO_INCREMENT,
  niv VARCHAR(45) NOT NULL,
  num_inventario VARCHAR(45) NOT NULL,
  color VARCHAR(45) NOT NULL,
  motor VARCHAR(45) NOT NULL,
  marca VARCHAR(45) NOT NULL,
  modelo VARCHAR(45) NOT NULL,
  anio SMALLINT NOT NULL,
  precio_lis DECIMAL(12,2) NOT NULL,
  estado VARCHAR(45) NOT NULL,
  almacen_idalmacen INT NOT NULL,
  PRIMARY KEY (id_vehiculos),
  UNIQUE KEY uq_vehiculos_niv (niv),
  CONSTRAINT fk_vehiculos_almacen
    FOREIGN KEY (almacen_idalmacen) REFERENCES almacen (idalmacen)
) ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table calificaciones
-- -----------------------------------------------------
CREATE TABLE calificaciones (
  idcalificaciones INT NOT NULL AUTO_INCREMENT,
  puntuacion TINYINT NOT NULL,
  comentario VARCHAR(255) NOT NULL,
  PRIMARY KEY (idcalificaciones)
) ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table citas
-- -----------------------------------------------------
CREATE TABLE citas (
  id_cita INT NOT NULL AUTO_INCREMENT,
  fech_cita DATETIME NOT NULL,
  estado_cita VARCHAR(45) NOT NULL,
  fech_venta DATETIME NULL,
  clientes_idclientes INT NOT NULL,
  empleados_idempleados INT NOT NULL,
  vehiculos_id_vehiculos INT NOT NULL,
  calificaciones_idcalificaciones INT NULL,
  PRIMARY KEY (id_cita),
  CONSTRAINT fk_citas_clientes
    FOREIGN KEY (clientes_idclientes) REFERENCES clientes (idclientes),
  CONSTRAINT fk_citas_empleados
    FOREIGN KEY (empleados_idempleados) REFERENCES empleados (idempleados),
  CONSTRAINT fk_citas_vehiculos
    FOREIGN KEY (vehiculos_id_vehiculos) REFERENCES vehiculos (id_vehiculos),
  CONSTRAINT fk_citas_calificaciones
    FOREIGN KEY (calificaciones_idcalificaciones) REFERENCES calificaciones (idcalificaciones)
) ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table cotizacion
-- -----------------------------------------------------
CREATE TABLE cotizacion (
  idcotizacion INT NOT NULL AUTO_INCREMENT,
  cotizacioncol VARCHAR(45) NULL,
  fech_cot DATETIME NOT NULL,
  metodo_pago VARCHAR(45) NOT NULL,
  clientes_idclientes INT NOT NULL,
  vehiculos_id_vehiculos INT NOT NULL,
  PRIMARY KEY (idcotizacion),
  CONSTRAINT fk_cotizacion_clientes
    FOREIGN KEY (clientes_idclientes) REFERENCES clientes (idclientes),
  CONSTRAINT fk_cotizacion_vehiculos
    FOREIGN KEY (vehiculos_id_vehiculos) REFERENCES vehiculos (id_vehiculos)
) ENGINE = InnoDB;