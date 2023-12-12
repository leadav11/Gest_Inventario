-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3310
-- Tiempo de generación: 08-06-2021 a las 18:09:42
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 7.3.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_inventariofree`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `NUEVO_PRODUCTO` (`CODIGO` VARCHAR(10))  INSERT INTO inventario (inv_pro_codigo) VALUES (CODIGO)$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entrada`
--

CREATE TABLE `entrada` (
  `ent_id` int(4) NOT NULL,
  `ent_factura` varchar(30) DEFAULT NULL,
  `ent_pro_codigo` varchar(10) DEFAULT NULL,
  `ent_fecha` date NOT NULL,
  `ent_cantidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Disparadores `entrada`
--
DELIMITER $$
CREATE TRIGGER `INVENTARIO_AI` AFTER INSERT ON `entrada` FOR EACH ROW UPDATE inventario SET inv_stock = inv_stock+NEW.ent_cantidad, inv_entradas = inv_entradas+NEW.ent_cantidad where inv_pro_codigo = NEW.ent_pro_codigo
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inventario`
--

CREATE TABLE `inventario` (
  `inv_pro_codigo` varchar(10) NOT NULL,
  `inv_entradas` int(4) DEFAULT 0,
  `inv_salidas` int(4) DEFAULT 0,
  `inv_stock` int(4) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `pro_codigo` varchar(10) NOT NULL,
  `pro_descripcion` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `salida`
--

CREATE TABLE `salida` (
  `sal_id` int(4) NOT NULL,
  `sal_factura` varchar(30) DEFAULT NULL,
  `sal_pro_codigo` varchar(10) DEFAULT NULL,
  `sal_fecha` date NOT NULL,
  `sal_cantidad` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Disparadores `salida`
--
DELIMITER $$
CREATE TRIGGER `INVENTARIO_S_AI` AFTER INSERT ON `salida` FOR EACH ROW UPDATE inventario SET inv_stock = inv_stock-NEW.sal_cantidad, inv_salidas = inv_salidas+NEW.sal_cantidad where inv_pro_codigo = NEW.sal_pro_codigo
$$
DELIMITER ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `entrada`
--
ALTER TABLE `entrada`
  ADD PRIMARY KEY (`ent_id`),
  ADD KEY `ent_pro_codigo` (`ent_pro_codigo`);

--
-- Indices de la tabla `inventario`
--
ALTER TABLE `inventario`
  ADD PRIMARY KEY (`inv_pro_codigo`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`pro_codigo`);

--
-- Indices de la tabla `salida`
--
ALTER TABLE `salida`
  ADD PRIMARY KEY (`sal_id`),
  ADD KEY `sal_pro_codigo` (`sal_pro_codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `entrada`
--
ALTER TABLE `entrada`
  MODIFY `ent_id` int(4) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `salida`
--
ALTER TABLE `salida`
  MODIFY `sal_id` int(4) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `entrada`
--
ALTER TABLE `entrada`
  ADD CONSTRAINT `entrada_ibfk_1` FOREIGN KEY (`ent_pro_codigo`) REFERENCES `producto` (`pro_codigo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `inventario`
--
ALTER TABLE `inventario`
  ADD CONSTRAINT `inventario_ibfk_1` FOREIGN KEY (`inv_pro_codigo`) REFERENCES `producto` (`pro_codigo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `salida`
--
ALTER TABLE `salida`
  ADD CONSTRAINT `salida_ibfk_1` FOREIGN KEY (`sal_pro_codigo`) REFERENCES `producto` (`pro_codigo`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
