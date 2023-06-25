create table DEPARTMENT (
    id int not null AUTO_INCREMENT PRIMARY KEY,
    name varchar(100) not null UNIQUE,
    abbreviation varchar(15) not null UNIQUE,
    active boolean not null default true,
    creatorId int not null
);

create table SUBJECT (
    id int not null AUTO_INCREMENT PRIMARY KEY,
    acronym varchar(20) not null UNIQUE,
    description varchar(100) not null,
    active boolean not null default true,
    idDepartment int not null,
    foreign key (idDepartment) references DEPARTMENT(id)
);

create table COURSE (
    id int not null AUTO_INCREMENT PRIMARY KEY,
    code varchar(20) not null UNIQUE,
    name varchar(100) not null,
    active boolean not null default true,
    idSubject int not null,
    foreign key (idSubject) references SUBJECT(id)
);