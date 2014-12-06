CREATE DATABASE  IF NOT EXISTS `kodingapp` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `KodingApp`;
-- MySQL dump 10.13  Distrib 5.6.17, for osx10.6 (i386)
--
-- Host: 127.0.0.1    Database: KodingApp
-- ------------------------------------------------------
-- Server version	5.5.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Department`
--

DROP TABLE IF EXISTS `Department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Department` (
  `DepartmentId` int(11) NOT NULL AUTO_INCREMENT,
  `DepartmentName` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`DepartmentId`),
  UNIQUE KEY `DepartmentId_UNIQUE` (`DepartmentId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Department`
--

LOCK TABLES `Department` WRITE;
/*!40000 ALTER TABLE `Department` DISABLE KEYS */;
/*!40000 ALTER TABLE `Department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Posts`
--

DROP TABLE IF EXISTS `Posts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Posts` (
  `PostId` int(11) NOT NULL AUTO_INCREMENT,
  `OwnerId` int(11) DEFAULT NULL,
  `PostTitle` text,
  `PostDescription` text,
  `Locality` varchar(32) DEFAULT NULL,
  `Image` text,
  `Department` int(11) DEFAULT NULL,
  `Status` int(11) DEFAULT NULL,
  `CreatedTime` timestamp NULL DEFAULT NULL,
  `ReviewedTime` timestamp NULL DEFAULT NULL,
  `ReviewerId` int(11) DEFAULT NULL,
  `AssignedTime` timestamp NULL DEFAULT NULL,
  `AssignerId` int(11) DEFAULT NULL,
  `FinishedTime` timestamp NULL DEFAULT NULL,
  `ClosedTime` timestamp NULL DEFAULT NULL,
  `CloserId` int(11) DEFAULT NULL,
  PRIMARY KEY (`PostId`),
  KEY `PostOwner_idx` (`OwnerId`),
  KEY `ReviewerId_idx` (`ReviewerId`),
  KEY `AssingerId_idx` (`AssignerId`),
  KEY `CloserId_idx` (`CloserId`),
  KEY `Department_idx` (`Department`),
  CONSTRAINT `OwnerId` FOREIGN KEY (`OwnerId`) REFERENCES `Users` (`UserId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `ReviewerId` FOREIGN KEY (`ReviewerId`) REFERENCES `Users` (`UserId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `AssingerId` FOREIGN KEY (`AssignerId`) REFERENCES `Users` (`UserId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `CloserId` FOREIGN KEY (`CloserId`) REFERENCES `Users` (`UserId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `Department` FOREIGN KEY (`Department`) REFERENCES `Department` (`DepartmentId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Posts`
--

LOCK TABLES `Posts` WRITE;
/*!40000 ALTER TABLE `Posts` DISABLE KEYS */;
/*!40000 ALTER TABLE `Posts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `User_Department`
--

DROP TABLE IF EXISTS `User_Department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `User_Department` (
  `UserId` int(11) DEFAULT NULL,
  `DepartmentId` int(11) DEFAULT NULL,
  KEY `UserId_idx` (`UserId`),
  KEY `DepartmetnId_idx` (`DepartmentId`),
  CONSTRAINT `UserId` FOREIGN KEY (`UserId`) REFERENCES `Users` (`UserId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `DepartmetnId` FOREIGN KEY (`DepartmentId`) REFERENCES `Department` (`DepartmentId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `User_Department`
--

LOCK TABLES `User_Department` WRITE;
/*!40000 ALTER TABLE `User_Department` DISABLE KEYS */;
/*!40000 ALTER TABLE `User_Department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Users`
--

DROP TABLE IF EXISTS `Users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Users` (
  `UserId` int(11) NOT NULL AUTO_INCREMENT,
  `DisplayName` varchar(32) DEFAULT NULL,
  `EmailId` varchar(64) DEFAULT NULL,
  `Password` varchar(32) DEFAULT NULL,
  `Role` int(10) unsigned NOT NULL,
  `Locality` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`UserId`),
  UNIQUE KEY `userId_UNIQUE` (`UserId`),
  UNIQUE KEY `EmailId_UNIQUE` (`EmailId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Users`
--

LOCK TABLES `Users` WRITE;
/*!40000 ALTER TABLE `Users` DISABLE KEYS */;
/*!40000 ALTER TABLE `Users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-12-06 23:39:25
