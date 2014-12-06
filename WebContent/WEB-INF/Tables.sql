

CREATE TABLE `KodingApp`.`Users` (
  `UserId` INT NOT NULL AUTO_INCREMENT,
  `UserName` VARCHAR(32) NULL,
  `EmailId` VARCHAR(64) NULL,
  `Password` VARCHAR(32) NULL,
  `Role` INT UNSIGNED NOT NULL,
  `Locality` VARCHAR(32) NULL,
  PRIMARY KEY (`UserId`),
  UNIQUE INDEX `userId_UNIQUE` (`UserId` ASC),
  UNIQUE INDEX `EmailId_UNIQUE` (`EmailId` ASC));

  
CREATE TABLE `KodingApp`.`Department` (
  `DepartmentId` INT NOT NULL AUTO_INCREMENT,
  `DepartmentName` VARCHAR(32) NULL,
  PRIMARY KEY (`DepartmentId`),
  UNIQUE INDEX `DepartmentId_UNIQUE` (`DepartmentId` ASC));

  
CREATE TABLE `KodingApp`.`User_Department` (
  `UserId` INT NULL,
  `DepartmentId` INT NULL,
  INDEX `UserId_idx` (`UserId` ASC),
  INDEX `DepartmetnId_idx` (`DepartmentId` ASC),
  CONSTRAINT `UserId`
    FOREIGN KEY (`UserId`)
    REFERENCES `KodingApp`.`Users` (`UserId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `DepartmetnId`
    FOREIGN KEY (`DepartmentId`)
    REFERENCES `KodingApp`.`Department` (`DepartmentId`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

 CREATE TABLE `KodingApp`.`Posts` (
  `PostId` INT NOT NULL AUTO_INCREMENT,
  `OwnerId` INT NULL,
  `PostTitle` TEXT NULL,
  `PostDescription` TEXT NULL,
  `Locality` VARCHAR(32) NULL,
  `Image` TEXT NULL,
  `Department` INT NULL,
  `Status` INT NULL,
  `CreatedTime` TIMESTAMP NULL,
  `ReviewedTime` TIMESTAMP NULL,
  `ReviewerId` INT NULL,
  `AssignedTime` TIMESTAMP NULL,
  `AssignerId` INT NULL,
  `FinishedTime` TIMESTAMP NULL,
  `ClosedTime` TIMESTAMP NULL,
  `CloserId` INT NULL,
  PRIMARY KEY (`PostId`),
  INDEX `PostOwner_idx` (`OwnerId` ASC),
  INDEX `ReviewerId_idx` (`ReviewerId` ASC),
  INDEX `AssingerId_idx` (`AssignerId` ASC),
  INDEX `CloserId_idx` (`CloserId` ASC),
  INDEX `Department_idx` (`Department` ASC),
  CONSTRAINT `OwnerId`
    FOREIGN KEY (`OwnerId`)
    REFERENCES `KodingApp`.`Users` (`UserId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `ReviewerId`
    FOREIGN KEY (`ReviewerId`)
    REFERENCES `KodingApp`.`Users` (`UserId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `AssingerId`
    FOREIGN KEY (`AssignerId`)
    REFERENCES `KodingApp`.`Users` (`UserId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `CloserId`
    FOREIGN KEY (`CloserId`)
    REFERENCES `KodingApp`.`Users` (`UserId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `Department`
    FOREIGN KEY (`Department`)
    REFERENCES `KodingApp`.`Department` (`DepartmentId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
