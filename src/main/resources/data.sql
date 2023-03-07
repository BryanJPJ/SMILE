INSERT INTO patients (dni,name) VALUES (582395,'Bryan')
INSERT INTO patients (dni,name) VALUES (592341,'Omar')
INSERT INTO patients (dni,name) VALUES (484845,'Sandra')
INSERT INTO patients (dni,name) VALUES (404505, 'Carol')

INSERT INTO cities (id_city, name) VALUES (null ,'Burgos')
INSERT INTO cities (id_city, name) VALUES (null ,'Barcelona')
INSERT INTO cities (id_city, name) VALUES (null ,'Alicante')
INSERT INTO cities (id_city, name) VALUES (null ,'Bilbao')

INSERT INTO treatments (id_treatment, title, description) VALUES (null, 'Diabetes', '10mg insulina')
INSERT INTO treatments (id_treatment, title, description) VALUES (null, 'Gripe', '10mg amoxicilina')
INSERT INTO treatments (id_treatment, title, description) VALUES (null, 'Migranas', '1mg Diazepam')
INSERT INTO treatments (id_treatment, title, description) VALUES (null, 'Dolor Muscular', '10mg insulina')

INSERT INTO profilies (id, id_city, age, phone, direction, id_treatment) VALUES (null, 1, 32 ,666352672, 'calle murcia,2', 'muerte')