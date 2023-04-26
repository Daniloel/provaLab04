use anotacao;

create table per_personagem(
per_id bigint primary key auto_increment,
per_nome varchar(100) not null,
per_classe varchar (30)not null,
per_data_hora_criacao datetime not null,
per_inteligencia int,
per_forca int,
per_saude int,
per_taxa_critica float not null);

insert into per_personagem (per_nome, per_classe, per_data_hora_criacao, per_inteligencia, per_taxa_critica)
 values ('Razor','Warrior',current_timestamp(),3,0.4);
insert into per_personagem (per_nome, per_classe, per_data_hora_criacao, per_forca, per_taxa_critica)
 values ('Barabara','Priest',current_timestamp(),2,0.1);