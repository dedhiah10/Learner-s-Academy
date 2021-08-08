DROP DATABASE `learnersacademy`;
create schema `learnersacademy`;

CREATE TABLE `learnersacademy`.`classes` (
  `idclasses` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `standard` INT UNSIGNED NOT NULL,
  `className` VARCHAR(1) NOT NULL,
  PRIMARY KEY (`idclasses`, `standard`, `className`),
  UNIQUE INDEX `idclasses_UNIQUE` (`idclasses` ASC) VISIBLE);
  
  CREATE TABLE `learnersacademy`.`students` (
  `idStudents` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `studentName` VARCHAR(50) NOT NULL,
  `className` VARCHAR(1) NOT NULL,
  `standard` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`idStudents`),
  UNIQUE INDEX `idclasses_UNIQUE` (`idStudents` ASC) VISIBLE);

CREATE TABLE `learnersacademy`.`subjects` (
  `idSubjects` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `subjectName` VARCHAR(40) NOT NULL,
  PRIMARY KEY (`idSubjects`),
  UNIQUE INDEX `idclasses_UNIQUE` (`idSubjects` ASC) VISIBLE,
  UNIQUE INDEX `subjectName_UNIQUE` (`subjectName` ASC) VISIBLE);
  
  CREATE TABLE `learnersacademy`.`teacher` (
  `idTeacher` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) NOT NULL,
  `DoB` DATE NOT NULL,
  `salary` INT UNSIGNED NULL,
  PRIMARY KEY (`idTeacher`),
  UNIQUE INDEX `idclasses_UNIQUE` (`idTeacher` ASC) VISIBLE);

CREATE TABLE `learnersacademy`.`timetable` (
  `idTimeTable` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `classStandard` INT UNSIGNED NOT NULL,
  `className` VARCHAR(1) NOT NULL,
  `timeSlot` INT UNSIGNED NOT NULL,
  `teacherAssigned` VARCHAR(50) NOT NULL,
  `dayOfTheWeek` VARCHAR(10) NOT NULL,
  `subjectName` VARCHAR(40) NOT NULL,
  PRIMARY KEY (`idTimeTable`, `classStandard`, `className`, `teacherAssigned`, `timeSlot`),
  UNIQUE INDEX `idclasses_UNIQUE` (`idTimeTable` ASC) VISIBLE);
