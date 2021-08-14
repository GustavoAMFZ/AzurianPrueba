-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: prueba_azurian_db
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
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleado` (
  `id` int NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `correo_electronico` varchar(45) NOT NULL,
  `cargo` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado`
--

LOCK TABLES `empleado` WRITE;
/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
INSERT INTO `empleado` VALUES (1,'Jorge','Campos','jorgeC@gmail.com','desarrollador'),(2,'Pedro','Ortiz','PedroOO@gmail.com','Analista QA'),(3,'Adriana','Campos','AdrianaC@gmail.com','Líder Técnico'),(4,'Ramona','Gallego','RamonaG@gmail.com','Gerente de SW'),(5,'Bernardino','Gabarri','BernardinoG@gmail.com','Arquitecto de Sistemas'),(6,'Borja','Rosa','BorjaR@gmail.com','Diseñador'),(7,'Alba','Melgar','AlbaM@gmail.com','desarrollador'),(8,'Angustias','Angustias','AngustiasA@gmail.com','Analista QA'),(9,'Estela','Velez','EstelaV@gmail.com','Líder Técnico'),(10,'Encarnacion','Casals','EncarnacionC@gmail.com','Gerente de SW'),(11,'Hilario','Galiano','HilarioG@gmail.com','Arquitecto de Sistemas'),(12,'Sara','Sarmiento','SaraS@gmail.com','Diseñador'),(13,'Alejandra','Cespedes','AlejandraC@gmail.com','desarrollador'),(14,'Manuela','Hernando','ManuelaH@gmail.com','Analista QA'),(15,'Maite','Navarro','MaiteN@gmail.com','Líder Técnico'),(16,'Rebeca','Iglesias','RebecaI@gmail.com','Gerente de SW'),(17,'Eulogio','Matas','EulogioM@gmail.com','Arquitecto de Sistemas'),(18,'Iban','Piqueras','IbanP@gmail.com','Diseñador');
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-12  2:46:24
