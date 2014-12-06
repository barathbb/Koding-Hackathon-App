

CREATE TABLE `KodingApp`.`Users` (
  `UserId` INT NOT NULL AUTO_INCREMENT,
  `DisplayName` VARCHAR(32) NULL,
  `EmailId` VARCHAR(64) NULL,
  `Password` VARCHAR(32) NULL,
  `Role` INT UNSIGNED NOT NULL,
  `Locality` VARCHAR(32) NULL,
  PRIMARY KEY (`UserId`),
  UNIQUE INDEX `userId_UNIQUE` (`UserId` ASC),
  UNIQUE INDEX `EmailId_UNIQUE` (`EmailId` ASC));
