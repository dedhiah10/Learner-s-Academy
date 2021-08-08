

truncate table `learnersacademy`.`students`;
truncate table `learnersacademy`.`teacher`;
truncate table `learnersacademy`.`subjects`;
truncate table `learnersacademy`.`classes`;
truncate table `learnersacademy`.`timetable`;

insert into `learnersacademy`.`students`(`studentName`, `className`, `standard`) 
values ("Jed Freeman", "A", "1"),
 ("Goodwin Walton", "A", "1"),
 ("Bennett Lindsey", "A", "1"),
 ("Winona Sherman", "B", "1"),
 ("Caldwell Moore", "B", "1"),
 ("Leonard Gordon", "B", 1),
 ("Albert Dean", "C", 1),
 ("Beatrice Kemp", "C", 1),
 ("Tasha Marshman", "C", 1);
 
insert into `learnersacademy`.`teacher`(`name`, `DoB`, `salary`)
values ("Avery Parks", STR_TO_DATE("17-12-1991", "%d-%m-%Y"), 30000),
 ("Wynne Bradley", STR_TO_DATE('17-4-1993', '%d-%m-%Y'), 31500),
 ("Valentine Hunt", STR_TO_DATE('17-8-1985', '%d-%m-%Y'), 29750);
 
 insert into `learnersacademy`.`subjects`(`subjectName`) values ("English"),
 ("Mathematics"),
 ("Science"),
 ("Social Studies");
 
INSERT INTO `learnersacademy`.`classes` (`standard`, `className`) VALUES ('1', 'A'),
('1', 'B'),
('1', 'C');

 INSERT INTO `learnersacademy`.`timetable` 
 (`classStandard`, `classname`, `timeSlot`, `teacherAssigned`, `dayOfTheWeek`, `subjectName`)
 values (1, 'A', 1, 'Avery Parks', 'Monday', 'Social Studies'),
 (1, 'A', 2,  'Wynne Bradley', 'Monday', 'Mathematics'),
 (1, 'A', 3, 'Valentine Hunt', 'Monday', 'English'), 
 
 (1, 'A', 1, 'Valentine Hunt', 'Tuesday', 'Social Studies'),
 (1, 'A', 2, 'Avery Parks', 'Tuesday', 'Mathematics'),
 (1, 'A', 3, 'Valentine Hunt', 'Tuesday', 'Science'),
 (1, 'A', 4, 'Wynne Bradley', 'Tuesday', 'Social Studies'), 
 
 (1, 'A', 1, 'Wynne Bradley', 'Wednesday', 'Science'),
 (1, 'A', 2, 'Avery Parks', 'Wednesday', 'Mathematics'),
 (1, 'A', 3, 'Avery Parks', 'Wednesday', 'English'), 
 
 (1, 'A', 1, 'Wynne Bradley', 'Thursday', 'Science'),
 (1, 'A', 2, 'Wynne Bradley', 'Thursday', 'Mathematics'),
 (1, 'A', 3, 'Avery Parks', 'Thursday', 'English'),
 (1, 'A', 4, 'Valentine Hunt', 'Thursday', 'Social Studies'), 
 
 (1, 'A', 1, 'Valentine Hunt', 'Friday', 'English'),
 (1, 'A', 2, 'Avery Parks', 'Friday', 'Mathematics'),
 (1, 'A', 3, 'Avery Parks', 'Friday', 'Science'),
 
 
 
 (1, 'B', 1, 'Valentine Hunt', 'Monday', 'Science'),
 (1, 'B', 2, 'Valentine Hunt', 'Monday', 'Science'),
 (1, 'B', 3, 'Avery Parks', 'Monday', 'Mathematics'),
 (1, 'B', 4, 'Valentine Hunt', 'Monday', 'English'), 
 
 (1, 'B', 1, 'Avery Parks', 'Tuesday', 'Science'),
 (1, 'B', 2, 'Valentine Hunt', 'Tuesday', 'Science'),
 (1, 'B', 3, 'Wynne Bradley', 'Tuesday', 'Mathematics'), 
 (1, 'B', 4, 'Valentine Hunt', 'Tuesday', 'English'), 
 
 (1, 'B', 1, 'Valentine Hunt', 'Wednesday', 'Science'),
 (1, 'B', 2, 'Wynne Bradley', 'Wednesday', 'Science'),
 (1, 'B', 3, 'Wynne Bradley', 'Wednesday', 'Mathematics'),
 
 (1, 'B', 1, 'Avery Parks', 'Thursday', 'Science'),
 (1, 'B', 2, 'Avery Parks', 'Thursday', 'Science'),
 (1, 'B', 3, 'Valentine Hunt', 'Thursday', 'Mathematics'), 
 
 (1, 'B', 1, 'Avery Parks', 'Friday', 'Science'),
 (1, 'B', 2, 'Valentine Hunt', 'Friday', 'Science'),
 (1, 'B', 3, 'Wynne Bradley', 'Friday', 'Mathematics'),
 
 
 
 (1, 'C', 1, 'Wynne Bradley', 'Monday', 'Science'),
 (1, 'C', 2, 'Avery Parks', 'Monday', 'Science'),
 (1, 'C', 3, 'Wynne Bradley', 'Monday', 'Mathematics'),
 
 (1, 'C', 1, 'Wynne Bradley', 'Tuesday', 'Science'),
 (1, 'C', 2, 'Wynne Bradley', 'Tuesday', 'Science'),
 (1, 'C', 3, 'Avery Parks', 'Tuesday', 'Mathematics'),
 
 (1, 'C', 1, 'Avery Parks', 'Wednesday', 'Science'),
 (1, 'C', 2, 'Valentine Hunt', 'Wednesday', 'Science'),
 (1, 'C', 3, 'Valentine Hunt', 'Wednesday', 'Mathematics'),
 
 (1, 'C', 1, 'Valentine Hunt', 'Thursday', 'Science'),
 (1, 'C', 2, 'Valentine Hunt', 'Thursday', 'Science'),
 (1, 'C', 3, 'Wynne Bradley', 'Thursday', 'Mathematics'), 
 (1, 'C', 4, 'Wynne Bradley', 'Thursday', 'English'), 
 
 (1, 'C', 1, 'Wynne Bradley', 'Friday', 'Science'),
 (1, 'C', 2, 'Wynne Bradley', 'Friday', 'Science'),
 (1, 'C', 3, 'Valentine Hunt', 'Friday', 'Mathematics'), 
 (1, 'C', 4, 'Valentine Hunt', 'Friday', 'English');