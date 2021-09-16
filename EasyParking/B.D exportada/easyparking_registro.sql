-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: easyparking
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `registro`
--

DROP TABLE IF EXISTS `registro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `registro` (
  `idRegistro` int NOT NULL AUTO_INCREMENT,
  `placaVehiculo` varchar(45) NOT NULL,
  `fechaEntrada` datetime NOT NULL,
  `fechaSalida` datetime DEFAULT NULL,
  `idUsuario` int NOT NULL,
  `idPlaza` int NOT NULL,
  `fechaFactura` date DEFAULT NULL,
  `nombreCliente` varchar(45) DEFAULT NULL,
  `minutosTotales` int DEFAULT NULL,
  `iva` double DEFAULT NULL,
  `totalCancelar` double DEFAULT NULL,
  `idInformacionEmpresa` int NOT NULL,
  PRIMARY KEY (`idRegistro`),
  UNIQUE KEY `idRegistro_UNIQUE` (`idRegistro`),
  KEY `registroUsuarios_idx` (`idUsuario`),
  KEY `plazaRegistro_idx` (`idPlaza`),
  KEY `informacionEmpresaRegistro_idx` (`idInformacionEmpresa`),
  CONSTRAINT `informacionEmpresaRegistro` FOREIGN KEY (`idInformacionEmpresa`) REFERENCES `informacionempresa` (`idInformacionEmpresa`),
  CONSTRAINT `plazaRegistro` FOREIGN KEY (`idPlaza`) REFERENCES `plazas` (`idPlaza`),
  CONSTRAINT `registroUsuarios` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registro`
--

LOCK TABLES `registro` WRITE;
/*!40000 ALTER TABLE `registro` DISABLE KEYS */;
INSERT INTO `registro` VALUES (2,'zxc123','2021-09-13 12:00:00','2021-09-13 12:50:00',2,1,'2021-09-13','Pedro castro',50,19,5000,1),(3,'XYZ','2021-09-13 12:30:00','2021-09-13 12:59:00',2,2,'2021-09-13','Jan lopez',29,19,2900,1),(4,'XYJ789','2021-09-14 06:00:00','2021-09-15 08:00:00',2,3,'2021-09-15','Alvaro uribe',1560,19,170000,1),(5,'lpv567','2021-09-14 06:00:00','2021-09-14 09:00:00',2,4,'2021-09-14','Petrizky lopez',180,19,18000,1);
/*!40000 ALTER TABLE `registro` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-16 15:26:37
