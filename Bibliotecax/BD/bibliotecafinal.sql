-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-04-2017 a las 15:00:19
-- Versión del servidor: 5.7.14
-- Versión de PHP: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bibliotecafinal`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `arriendo`
--

CREATE TABLE `arriendo` (
  `COD_ARRI` int(11) NOT NULL,
  `COSTOTOTAL` int(11) NOT NULL,
  `FECHADEVOLUCION` date NOT NULL,
  `FECHAENTREGAREAL` date NOT NULL,
  `DIASDERETRASO` date NOT NULL,
  `COSTODEARRIENDO` date NOT NULL,
  `NSERIE` int(11) NOT NULL,
  `RUTT` varchar(10) NOT NULL,
  `RUTC` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `autor`
--

CREATE TABLE `autor` (
  `COD_AUTOR` int(11) NOT NULL,
  `NOMBRE` varchar(20) NOT NULL,
  `APELLIDOPATERNO` varchar(20) NOT NULL,
  `APELLIDOMATERNO` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `autor`
--

INSERT INTO `autor` (`COD_AUTOR`, `NOMBRE`, `APELLIDOPATERNO`, `APELLIDOMATERNO`) VALUES
(1, 'ISABEL', 'ALLENDE', ' '),
(2, 'JULIO', 'VERNE', ' '),
(3, 'ALEJANDRO', 'DUMAS', ' '),
(4, 'EOIN', 'COLFER', ' '),
(5, 'RICK', 'RIORDAN', ' '),
(6, 'ISABEL', 'MARQUEZ', ' '),
(7, 'GABRIELA', 'MISTRAL', 'LAIDO'),
(8, 'ROBERTO', 'ROWLING', 'RICHARDS '),
(9, 'JAIME', 'JULIO', 'JIM '),
(10, 'DESCONOCIDO', ' ', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `biblioteca`
--

CREATE TABLE `biblioteca` (
  `NOMBRE` varchar(45) NOT NULL,
  `NSERIE` int(11) NOT NULL,
  `RUTT` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `boleta`
--

CREATE TABLE `boleta` (
  `FOLIO` int(11) NOT NULL,
  `PRECIOCONIVA` int(11) NOT NULL,
  `PRECIONETO` int(11) NOT NULL,
  `FECHADEVENTA` date NOT NULL,
  `HORADEVENTA` int(11) NOT NULL,
  `COD_MP` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `boleta`
--

INSERT INTO `boleta` (`FOLIO`, `PRECIOCONIVA`, `PRECIONETO`, `FECHADEVENTA`, `HORADEVENTA`, `COD_MP`) VALUES
(1, 1000, 890, '2017-03-13', 17, 1),
(2, 3790, 3373, '0000-00-00', 9, 1),
(3, 7890, 7022, '0000-00-00', 13, 3),
(4, 18000, 16020, '0000-00-00', 15, 3),
(5, 4500, 4500, '0000-00-00', 12, 5),
(6, 25000, 22250, '0000-00-00', 13, 3),
(7, 30000, 26700, '0000-00-00', 17, 2),
(8, 6790, 6790, '0000-00-00', 15, 5),
(10, 3400, 3026, '0000-00-00', 12, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `COD_CAT` int(11) NOT NULL,
  `NOMBRE` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`COD_CAT`, `NOMBRE`) VALUES
(1, 'AVENTURA'),
(2, 'ROMANTICA'),
(3, 'RELIGION'),
(4, 'ACCION'),
(5, 'CRIMEN'),
(6, 'ECONOMIA'),
(7, 'ARQUITECTURA'),
(8, 'FOTOGRAFIA'),
(9, 'FICCION'),
(10, 'INGENIERIA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudad`
--

CREATE TABLE `ciudad` (
  `COD_CIU` int(11) NOT NULL,
  `NOMBRE` varchar(45) DEFAULT NULL,
  `COD_PAIS` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `ciudad`
--

INSERT INTO `ciudad` (`COD_CIU`, `NOMBRE`, `COD_PAIS`) VALUES
(1, 'Santiago', 3),
(2, 'Rancagua', 3),
(3, 'Valparaiso', 3),
(4, 'Mendoza', 2),
(5, 'Londres', 6),
(6, 'Berlin', 4),
(7, 'Paris', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `RUTC` varchar(45) NOT NULL,
  `APELLIDOPATERNO` varchar(30) NOT NULL,
  `APELLIDOMATERNO` varchar(30) NOT NULL,
  `NOMBRE` varchar(30) NOT NULL,
  `TELEFONO` int(11) NOT NULL,
  `DIRECCION` varchar(45) NOT NULL,
  `FECHANACIMIENTO` date NOT NULL,
  `COD_CO` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`RUTC`, `APELLIDOPATERNO`, `APELLIDOMATERNO`, `NOMBRE`, `TELEFONO`, `DIRECCION`, `FECHANACIMIENTO`, `COD_CO`) VALUES
('19605814', 'Izquierdo', 'Valdivias', 'Juan', 58793374, 'vicuña makkenna 2345', '1997-01-25', 5),
('19705825', 'Fuentes', 'rodriguez', 'Pedro', 23869583, 'benito rebolledo 35', '1998-12-03', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `COD_COMPRA` int(11) NOT NULL,
  `RUT_DIS` varchar(10) NOT NULL,
  `FOLIO` int(11) NOT NULL,
  `NSERIE` int(11) NOT NULL,
  `RUTT` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comuna`
--

CREATE TABLE `comuna` (
  `COD_CO` int(11) NOT NULL,
  `NOMBRE` varchar(45) DEFAULT NULL,
  `COD_CIU` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `comuna`
--

INSERT INTO `comuna` (`COD_CO`, `NOMBRE`, `COD_CIU`) VALUES
(1, 'Buin', 3),
(2, 'Kensington y Chelsea', 5),
(3, 'Paris', 7),
(4, 'Macul', 3),
(5, 'San Joaquin', 3),
(6, 'Machali', 2),
(7, 'Mendoza', 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `distribuidor`
--

CREATE TABLE `distribuidor` (
  `RUT_DIS` varchar(10) NOT NULL,
  `TELEFONO` int(11) NOT NULL,
  `AÑOINICIODEVENTAS` int(11) DEFAULT NULL,
  `DIRECCION` varchar(45) DEFAULT NULL,
  `COD_CO` int(11) NOT NULL,
  `COD_EDIT` int(11) NOT NULL,
  `RUTT` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `distribuidor`
--

INSERT INTO `distribuidor` (`RUT_DIS`, `TELEFONO`, `AÑOINICIODEVENTAS`, `DIRECCION`, `COD_CO`, `COD_EDIT`, `RUTT`) VALUES
('19860676', 56836726, 2010, 'benito rebolledo 365', 5, 6, '1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `editorial`
--

CREATE TABLE `editorial` (
  `COD_EDIT` int(11) NOT NULL,
  `NOMBRE` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `editorial`
--

INSERT INTO `editorial` (`COD_EDIT`, `NOMBRE`) VALUES
(1, 'DE BOLSILLO'),
(2, 'FEED BOOKS'),
(3, 'COMIDA RAPIDA'),
(4, 'HINDI FOOD'),
(5, 'HERDER EDITORIAL'),
(6, 'ANDRES BELLO'),
(7, 'EPUB'),
(8, 'CAMBRIDE'),
(9, 'SALVAT'),
(10, 'LAROUSSE');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estado`
--

CREATE TABLE `estado` (
  `COD_EST` int(11) NOT NULL,
  `NOMBRE` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estado`
--

INSERT INTO `estado` (`COD_EST`, `NOMBRE`) VALUES
(1, 'ARRENDADO'),
(2, 'DISPONIBLE');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `FOLIO` int(11) NOT NULL,
  `COSTOCONIVA` int(11) NOT NULL,
  `PRECIONETO` int(11) NOT NULL,
  `FECHADEVENTA` date NOT NULL,
  `HORADEVENTA` date NOT NULL,
  `COD_MP` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `idioma`
--

CREATE TABLE `idioma` (
  `COD_ID` int(11) NOT NULL,
  `NOMBRE` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `idioma`
--

INSERT INTO `idioma` (`COD_ID`, `NOMBRE`) VALUES
(1, 'CHINO MANDARIN'),
(2, 'ESPAÑOL'),
(3, 'INGLES'),
(4, 'ARABE'),
(5, 'HINDI'),
(6, 'PORTUGES'),
(7, 'RUSO'),
(8, 'ALEMAN'),
(9, 'FRNCES'),
(10, 'ITALIANO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libro`
--

CREATE TABLE `libro` (
  `NSERIE` int(11) NOT NULL,
  `ISBN` varchar(11) NOT NULL,
  `NOMBRE` varchar(20) NOT NULL,
  `AÑO` int(11) NOT NULL,
  `COD_EDIT` int(11) NOT NULL,
  `COD_AUTOR` int(11) NOT NULL,
  `COD_ID` int(11) NOT NULL,
  `COD_CAT` int(11) NOT NULL,
  `COD_EST` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `libro`
--

INSERT INTO `libro` (`NSERIE`, `ISBN`, `NOMBRE`, `AÑO`, `COD_EDIT`, `COD_AUTOR`, `COD_ID`, `COD_CAT`, `COD_EST`) VALUES
(1, '2', 'la vuelta', 1997, 1, 3, 2, 5, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `metododepago`
--

CREATE TABLE `metododepago` (
  `COD_MP` int(11) NOT NULL,
  `NOMBRE` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `metododepago`
--

INSERT INTO `metododepago` (`COD_MP`, `NOMBRE`) VALUES
(1, 'TARGETA'),
(2, 'DEPOSITO'),
(3, 'EFECTIVO'),
(4, 'CHEQUE'),
(5, 'FACTURA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pais`
--

CREATE TABLE `pais` (
  `COD_PAIS` int(11) NOT NULL,
  `NOMBRE` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pais`
--

INSERT INTO `pais` (`COD_PAIS`, `NOMBRE`) VALUES
(1, 'Estados Unidos'),
(2, 'Argentina'),
(3, 'CHILE'),
(4, 'Alemania'),
(5, 'Francia'),
(6, 'Ingalterra');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipotrabajadores`
--

CREATE TABLE `tipotrabajadores` (
  `COD_TIPO` int(11) NOT NULL,
  `NOMBRE` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipotrabajadores`
--

INSERT INTO `tipotrabajadores` (`COD_TIPO`, `NOMBRE`) VALUES
(1, 'biblioteca'),
(2, 'distribuidor');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trabajadores`
--

CREATE TABLE `trabajadores` (
  `RUTT` varchar(10) NOT NULL,
  `NOMBRE` varchar(45) NOT NULL,
  `APELLIDOPATERNO` varchar(30) NOT NULL,
  `APELLIDOMATERNO` varchar(30) NOT NULL,
  `TELEFONO` int(11) NOT NULL,
  `FECHANACIMIENTO` date NOT NULL,
  `CORREOELECTRONICO` varchar(45) DEFAULT NULL,
  `DIRECCION` varchar(45) NOT NULL,
  `COD_TIPO` int(11) NOT NULL,
  `COD_CO` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `trabajadores`
--

INSERT INTO `trabajadores` (`RUTT`, `NOMBRE`, `APELLIDOPATERNO`, `APELLIDOMATERNO`, `TELEFONO`, `FECHANACIMIENTO`, `CORREOELECTRONICO`, `DIRECCION`, `COD_TIPO`, `COD_CO`) VALUES
('1', 'juan', 'perez', 'vial', 78967265, '1996-02-01', 'des@gmail,com', 'la perdices', 1, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `COD_VENTA` int(11) NOT NULL,
  `FOLIO` int(11) NOT NULL,
  `NSERIE` int(11) NOT NULL,
  `RUTT` varchar(10) NOT NULL,
  `RUTC` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `arriendo`
--
ALTER TABLE `arriendo`
  ADD PRIMARY KEY (`COD_ARRI`),
  ADD KEY `ARRIENDO_RUTC_FK` (`RUTC`),
  ADD KEY `ARRIENDO_NSERIE_FK` (`NSERIE`),
  ADD KEY `arriendo_RUTT_FK` (`RUTT`);

--
-- Indices de la tabla `autor`
--
ALTER TABLE `autor`
  ADD PRIMARY KEY (`COD_AUTOR`);

--
-- Indices de la tabla `biblioteca`
--
ALTER TABLE `biblioteca`
  ADD PRIMARY KEY (`NOMBRE`),
  ADD KEY `BIBLIOTECA_NSERIE_FK` (`NSERIE`),
  ADD KEY `biblioteca_RUTT_FK` (`RUTT`);

--
-- Indices de la tabla `boleta`
--
ALTER TABLE `boleta`
  ADD PRIMARY KEY (`FOLIO`),
  ADD KEY `BOLETA_COD_MP_FK` (`COD_MP`);

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`COD_CAT`);

--
-- Indices de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  ADD PRIMARY KEY (`COD_CIU`),
  ADD KEY `CIUDAD_COD_PAIS_FK` (`COD_PAIS`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`RUTC`),
  ADD KEY `CLIENTE_COD_CO_FK` (`COD_CO`);

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`COD_COMPRA`),
  ADD KEY `COMPRA_RUTT_FK` (`RUTT`),
  ADD KEY `COMPRA_FOLIO_FK` (`FOLIO`),
  ADD KEY `COMPRA_NSERIE_FK` (`NSERIE`),
  ADD KEY `compra_RUT_DIS_FK` (`RUT_DIS`);

--
-- Indices de la tabla `comuna`
--
ALTER TABLE `comuna`
  ADD PRIMARY KEY (`COD_CO`),
  ADD KEY `COMUNA_COD_CIU_FK` (`COD_CIU`);

--
-- Indices de la tabla `distribuidor`
--
ALTER TABLE `distribuidor`
  ADD PRIMARY KEY (`RUT_DIS`),
  ADD KEY `DISTRIBUIDOR_COD_EDIT_FK` (`COD_EDIT`),
  ADD KEY `distribuidor_COD_CO_FK` (`COD_CO`),
  ADD KEY `distribuidor_RUTT_FK` (`RUTT`);

--
-- Indices de la tabla `editorial`
--
ALTER TABLE `editorial`
  ADD PRIMARY KEY (`COD_EDIT`);

--
-- Indices de la tabla `estado`
--
ALTER TABLE `estado`
  ADD PRIMARY KEY (`COD_EST`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`FOLIO`),
  ADD KEY `factura_COD_MP_FK` (`COD_MP`);

--
-- Indices de la tabla `idioma`
--
ALTER TABLE `idioma`
  ADD PRIMARY KEY (`COD_ID`);

--
-- Indices de la tabla `libro`
--
ALTER TABLE `libro`
  ADD PRIMARY KEY (`NSERIE`),
  ADD KEY `LIBRO_COD_ID_FK` (`COD_ID`),
  ADD KEY `LIBRO_COD_CAT_FK` (`COD_CAT`),
  ADD KEY `LIBRO_COD_AUTOR_FK` (`COD_AUTOR`),
  ADD KEY `LIBRO_COD_EST_FK` (`COD_EST`),
  ADD KEY `LIBRO_COD_EDIT_FK` (`COD_EDIT`);

--
-- Indices de la tabla `metododepago`
--
ALTER TABLE `metododepago`
  ADD PRIMARY KEY (`COD_MP`);

--
-- Indices de la tabla `pais`
--
ALTER TABLE `pais`
  ADD PRIMARY KEY (`COD_PAIS`);

--
-- Indices de la tabla `tipotrabajadores`
--
ALTER TABLE `tipotrabajadores`
  ADD PRIMARY KEY (`COD_TIPO`);

--
-- Indices de la tabla `trabajadores`
--
ALTER TABLE `trabajadores`
  ADD PRIMARY KEY (`RUTT`),
  ADD UNIQUE KEY `COD_CO` (`COD_CO`),
  ADD KEY `TRABAJADORES_COD_TIPO_FK` (`COD_TIPO`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`COD_VENTA`),
  ADD KEY `VENTA_RUTT_FK` (`RUTT`),
  ADD KEY `VENTA_RUTC_FK` (`RUTC`),
  ADD KEY `VENTA_FOLIO_FK` (`FOLIO`),
  ADD KEY `VENTA_NSERIE_FK` (`NSERIE`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `arriendo`
--
ALTER TABLE `arriendo`
  ADD CONSTRAINT `ARRIENDO_NSERIE_FK` FOREIGN KEY (`NSERIE`) REFERENCES `libro` (`NSERIE`),
  ADD CONSTRAINT `ARRIENDO_RUTC_FK` FOREIGN KEY (`RUTC`) REFERENCES `cliente` (`RUTC`),
  ADD CONSTRAINT `arriendo_RUTT_FK` FOREIGN KEY (`RUTT`) REFERENCES `trabajadores` (`RUTT`);

--
-- Filtros para la tabla `biblioteca`
--
ALTER TABLE `biblioteca`
  ADD CONSTRAINT `BIBLIOTECA_NSERIE_FK` FOREIGN KEY (`NSERIE`) REFERENCES `libro` (`NSERIE`),
  ADD CONSTRAINT `biblioteca_RUTT_FK` FOREIGN KEY (`RUTT`) REFERENCES `trabajadores` (`RUTT`);

--
-- Filtros para la tabla `boleta`
--
ALTER TABLE `boleta`
  ADD CONSTRAINT `BOLETA_COD_MP_FK` FOREIGN KEY (`COD_MP`) REFERENCES `metododepago` (`COD_MP`);

--
-- Filtros para la tabla `ciudad`
--
ALTER TABLE `ciudad`
  ADD CONSTRAINT `CIUDAD_COD_PAIS_FK` FOREIGN KEY (`COD_PAIS`) REFERENCES `pais` (`COD_PAIS`);

--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `CLIENTE_COD_CO_FK` FOREIGN KEY (`COD_CO`) REFERENCES `comuna` (`COD_CO`);

--
-- Filtros para la tabla `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `COMPRA_FOLIO_FK` FOREIGN KEY (`FOLIO`) REFERENCES `factura` (`FOLIO`),
  ADD CONSTRAINT `COMPRA_NSERIE_FK` FOREIGN KEY (`NSERIE`) REFERENCES `libro` (`NSERIE`),
  ADD CONSTRAINT `COMPRA_RUTT_FK` FOREIGN KEY (`RUTT`) REFERENCES `trabajadores` (`RUTT`),
  ADD CONSTRAINT `compra_RUT_DIS_FK` FOREIGN KEY (`RUT_DIS`) REFERENCES `distribuidor` (`RUT_DIS`);

--
-- Filtros para la tabla `comuna`
--
ALTER TABLE `comuna`
  ADD CONSTRAINT `COMUNA_COD_CIU_FK` FOREIGN KEY (`COD_CIU`) REFERENCES `ciudad` (`COD_CIU`);

--
-- Filtros para la tabla `distribuidor`
--
ALTER TABLE `distribuidor`
  ADD CONSTRAINT `DISTRIBUIDOR_COD_EDIT_FK` FOREIGN KEY (`COD_EDIT`) REFERENCES `editorial` (`COD_EDIT`),
  ADD CONSTRAINT `distribuidor_COD_CO_FK` FOREIGN KEY (`COD_CO`) REFERENCES `comuna` (`COD_CO`),
  ADD CONSTRAINT `distribuidor_RUTT_FK` FOREIGN KEY (`RUTT`) REFERENCES `trabajadores` (`RUTT`);

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `factura_COD_MP_FK` FOREIGN KEY (`COD_MP`) REFERENCES `metododepago` (`COD_MP`);

--
-- Filtros para la tabla `libro`
--
ALTER TABLE `libro`
  ADD CONSTRAINT `LIBRO_COD_AUTOR_FK` FOREIGN KEY (`COD_AUTOR`) REFERENCES `autor` (`COD_AUTOR`),
  ADD CONSTRAINT `LIBRO_COD_CAT_FK` FOREIGN KEY (`COD_CAT`) REFERENCES `categoria` (`COD_CAT`),
  ADD CONSTRAINT `LIBRO_COD_EDIT_FK` FOREIGN KEY (`COD_EDIT`) REFERENCES `editorial` (`COD_EDIT`),
  ADD CONSTRAINT `LIBRO_COD_EST_FK` FOREIGN KEY (`COD_EST`) REFERENCES `estado` (`COD_EST`),
  ADD CONSTRAINT `LIBRO_COD_ID_FK` FOREIGN KEY (`COD_ID`) REFERENCES `idioma` (`COD_ID`);

--
-- Filtros para la tabla `trabajadores`
--
ALTER TABLE `trabajadores`
  ADD CONSTRAINT `TRABAJADORES_COD_CO_FK` FOREIGN KEY (`COD_CO`) REFERENCES `comuna` (`COD_CO`),
  ADD CONSTRAINT `TRABAJADORES_COD_TIPO_FK` FOREIGN KEY (`COD_TIPO`) REFERENCES `tipotrabajadores` (`COD_TIPO`);

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `VENTA_FOLIO_FK` FOREIGN KEY (`FOLIO`) REFERENCES `boleta` (`FOLIO`),
  ADD CONSTRAINT `VENTA_NSERIE_FK` FOREIGN KEY (`NSERIE`) REFERENCES `libro` (`NSERIE`),
  ADD CONSTRAINT `VENTA_RUTC_FK` FOREIGN KEY (`RUTC`) REFERENCES `cliente` (`RUTC`),
  ADD CONSTRAINT `VENTA_RUTT_FK` FOREIGN KEY (`RUTT`) REFERENCES `trabajadores` (`RUTT`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
