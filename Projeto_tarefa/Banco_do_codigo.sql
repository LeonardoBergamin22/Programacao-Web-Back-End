create schema projeto_revisao;
use projeto_revisao;

create table tarefa (
id_tarefa int primary key not null,
titulo varchar(45) not null,
descricao varchar(200) not null,
status enum ('a','p','c') not null
);

select * from tarefa;

insert into tarefa values
	('1','estudar','Tenho que estudar','a'),
    ('2','desenhar','Tenho que desenhar','c');
    