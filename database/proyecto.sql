-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
-- -----------------------------------------------------
-- Table `empleados`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `empleados` ;

CREATE TABLE IF NOT EXISTS `empleados` (
  `idempleados` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `puesto` VARCHAR(45) NOT NULL,
  `telefono` DECIMAL(20) NOT NULL,
  `correo` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`idempleados`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `clientes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `clientes` ;

CREATE TABLE IF NOT EXISTS `clientes` (
  `idclientes` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `telefono` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idclientes`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `almacenController`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `almacen` ;

CREATE TABLE IF NOT EXISTS `almacen` (
  `idalmacen` INT NOT NULL,
  `nom_sucursal` VARCHAR(45) NOT NULL,
  `ubicacion` VARCHAR(45) NOT NULL,
  `capacidad` INT NOT NULL,
  PRIMARY KEY (`idalmacen`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `vehiculos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `vehiculos` ;

CREATE TABLE IF NOT EXISTS `vehiculos` (
  `id_vehiculos` INT NOT NULL,
  `niv` VARCHAR(45) NOT NULL,
  `num_inventario` VARCHAR(45) NOT NULL,
  `color` VARCHAR(45) NOT NULL,
  `motor` VARCHAR(45) NOT NULL,
  `marca` VARCHAR(45) NOT NULL,
  `modelo` VARCHAR(45) NOT NULL,
  `anio` VARCHAR(45) NOT NULL,
  `precio_lis` DECIMAL(60) NOT NULL,
  `estado` VARCHAR(45) NOT NULL,
  `almacen_idalmacen` INT NOT NULL,
  PRIMARY KEY (`id_vehiculos`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `calificacionesController`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `calificaciones` ;

CREATE TABLE IF NOT EXISTS `calificaciones` (
  `idcalificaciones` INT NOT NULL,
  `puntuacion` TINYINT(50) NOT NULL,
  `comentario` VARCHAR(45) NOT NULL,
  `calificacionescol` VARCHAR(45) NULL DEFAULT '',
  PRIMARY KEY (`idcalificaciones`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `citas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `citas` ;

CREATE TABLE IF NOT EXISTS `citas` (
  `id_cita` INT NOT NULL,
  `fech_cita` DATETIME NOT NULL,
  `estado_cita` DATETIME(6) NOT NULL,
  `fech_venta` VARCHAR(45) NULL,
  `clientes_idclientes` INT NOT NULL,
  `empleados_idempleados` INT NOT NULL,
  `vehiculos_id_vehiculos` INT NOT NULL,
  `calificaciones_idcalificaciones` INT NOT NULL,
  PRIMARY KEY (`id_cita`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cotizacion`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cotizacion` ;

CREATE TABLE IF NOT EXISTS `cotizacion` (
  `idcotizacion` INT NOT NULL,
  `cotizacioncol` VARCHAR(45) NULL,
  `fech_cot` DATETIME NOT NULL,
  `metodo_pago` VARCHAR(45) NOT NULL,
  `clientes_idclientes` INT NOT NULL,
  `vehiculos_id_vehiculos` INT NOT NULL,
  PRIMARY KEY (`idcotizacion`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;

SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
SELECT * FROM clientes;
INSERT INTO clientes (clientes.idclientes,nombre, email, telefono, password) VALUES ('1','Luis', 'luis@gmail.com', '5534785467', 'silese');



USE proyecto;

ALTER TABLE almacen
    MODIFY COLUMN idalmacen BIGINT NOT NULL AUTO_INCREMENT;
