create database plural_db;

create table usuario(
    id_usuario serial primary key,
    nome varchar(50) not null,
    email varchar(150) not null unique,
    senha varchar(255) not null
);

create table responsavel(
    id_responsavel serial primary key,
    nome varchar(50) not null,
    cpf varchar(32) unique not null
);

create table aluno(
    id_aluno serial primary key,
    nome varchar(50) not null,
    responsavel_id int not null references responsavel(id_responsavel)
);

create table atendimento(
    id_atendimento serial primary key,
    data date not null,
    aluno_id int not null references aluno(id_aluno),
    usuario_id int not null references usuario(id_usuario)
);

insert into usuario values (1, 'Roberto', 'rob@gmail.com', md5('123')), (2, 'Renato', 'rnt@gmail.com', md5('345')), (3, 'Marcelo', 'gargamel@gmail.com', md5('677'));

insert into responsavel values (1, 'Alberto', md5('128')), (2, 'Fàbio', md5('234')), (3, 'Marcela', md5('123'));

insert into aluno values (1, 'Lorenzo', 3), (2, 'Fábio Júnior', 2), (3, 'Gael', 1);

insert into atendimento values (1, '2026-09-09', 1, 1), (2, '2026-08-08', 2, 2), (3, '2026-06-07', 3, 3);



