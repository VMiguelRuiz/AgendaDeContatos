create database if not exists agenda;

use agenda;

drop table if exists contato;

create table `contato`(
	`idContato` int auto_increment,
	`nome` varchar(100) not null,
	`telefone` varchar(10),
	`celular` varchar(10),
	`email` varchar(25),
	Primary key (idContato));
	
commit;
