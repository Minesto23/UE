create table students_names(
	student_id INT not null,
    first_name VARCHAR(20) NOT NULL,
    last_name VARCHAR(20) NOT NULL,
    birth_year YEAR,
    gender VARCHAR(6) default "male"
);

drop table students_names;

alter table students_names
drop birth_year;

alter table students_names
add gpa decimal(3,2);

alter table students_names
change gpa GPA decimal(4,2);

CREATE TABLE Persons(
	ID int not null,
    LastName varchar(255) not null,
    FirstName varchar(255),
    Age int, Check (Age>=18)

);

insert into Persons (ID,LastName,FirstName,Age)
values(1100,"Trump","Donald",75);

insert into Persons (ID,LastName,FirstName,Age)
values(1101,"Barack","Obama",61);

insert into Persons (ID,LastName,FirstName,Age)
values(1102,"Joo","Biden",83);

insert into Persons (ID,LastName,FirstName,Age)
values(1103,"Trump","Donald",75);

insert into Persons (ID,LastName,FirstName,Age)
values(1104,"Doo","John",66);

alter table Persons
add primary key(ID);

update Persons
set FirstName = "Abraham"
where ID = 1104;

select FirstName 
from Persons;

select * from Persons;


select *  from Persons where age<78 or age is null;

insert into Persons (ID,LastName,FirstName,Age)
values(1122,"Clinton","Hilary",66);

insert into Persons (ID,LastName,FirstName,Age)
values(1115,"Mask","Elon");

select * from Persons order by FirstName, LastName desc;

insert into Persons (ID,LastName,FirstName,Age)
values(1125,"Duck","Donald", 56);

delete 
from Persons
where ID = 1102;


