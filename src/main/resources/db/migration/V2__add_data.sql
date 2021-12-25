insert into subject (title, id) values ('Тест по Охране труда', '1');

insert into questions (text, id, subject_id) values ('Какого вида искусственного освещения нет', '1', '1');
insert into response (text, id, questions_id, correct) values ('рабочее', '1', '1', false);
insert into response (text, id, questions_id, correct) values ('дежурное', '2', '1', false);
insert into response (text, id, questions_id, correct) values ('аварийное', '3', '1', false);
insert into response (text, id, questions_id, correct) values ('целевое', '4', '1', true);

insert into questions (text, id, subject_id) values ('К какой степени тяжести относится электрический удар если человек потерял сознание, но с сохранением дыхания', '2', '1');
insert into response (text, id, questions_id, correct) values ('II', '5', '2', true);
insert into response (text, id, questions_id, correct) values ('III', '6', '2', false);
insert into response (text, id, questions_id, correct) values ('IV', '7', '2', false);
insert into response (text, id, questions_id, correct) values ('V', '8', '2', false);

insert into questions (text, id, subject_id) values ('Максимально допустимый груз для женщин при постоянном подъёме и перемещении в течении рабочей смены', '3', '1');
insert into response (text, id, questions_id, correct) values ('5 кг', '9', '3', false);
insert into response (text, id, questions_id, correct) values ('6 кг', '10', '3', false);
insert into response (text, id, questions_id, correct) values ('7 кг', '11', '3', true);
insert into response (text, id, questions_id, correct) values ('8 кг', '12', '3', false);

insert into questions (text, id, subject_id) values ('Количество часов работы в неделю допустимое для несовершеннолетних от 16 до 18 лет', '4', '1');
insert into response (text, id, questions_id, correct) values ('24 ч', '13', '4', false);
insert into response (text, id, questions_id, correct) values ('28 ч', '14', '4', false);
insert into response (text, id, questions_id, correct) values ('32 ч', '15', '4', false);
insert into response (text, id, questions_id, correct) values ('36 ч', '16', '4', true);

insert into questions (text, id, subject_id) values ('Кто не входит в комиссию по расследованию несчастных случаев на производстве', '5', '1');
insert into response (text, id, questions_id, correct) values ('собственник', '17', '5', false);
insert into response (text, id, questions_id, correct) values ('руководитель службы охраны труда', '18', '5', true);
insert into response (text, id, questions_id, correct) values ('представитель профсоюза', '19', '5', false);
insert into response (text, id, questions_id, correct) values ('руководитель подразделения', '20', '5', false);