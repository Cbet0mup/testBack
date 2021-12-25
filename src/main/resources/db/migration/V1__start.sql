create sequence hibernate_sequence start 1 increment 1;
create table questions (id int8 not null, text varchar(2048), subject_id int8 not null, primary key (id));
create table response (id int8 not null, correct boolean, text varchar(1024), questions_id int8 not null, primary key (id));
create table subject (id int8 not null, title varchar(255), primary key (id));
alter table questions add constraint subject_fk foreign key (subject_id) references subject;
alter table response add constraint questions_fk foreign key (questions_id) references questions;