create table DEPARTMENT (
    id int not null AUTO_INCREMENT PRIMARY KEY,
    name varchar(100) not null UNIQUE,
    abbreviation varchar(15) not null UNIQUE,
    creatorId int not null
);

insert into DEPARTMENT(name, abbreviation, creatorId) values('Old Department', 'OLDDPTO', 1);
commit;