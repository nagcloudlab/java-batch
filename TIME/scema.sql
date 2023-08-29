
create database todosdb;
use todosdb;
show tables;
create table todos(
	id int primary key auto_increment,
    title varchar(255),
    completed boolean
);
select * from todos;