INSERT INTO patients (dni,name) VALUES (0,'Bryan')
INSERT INTO patients (dni,name) VALUES (1,'Marc')
INSERT INTO patients (dni,name) VALUES (2,'Sofia')
INSERT INTO patients (dni,name) VALUES (3,'Laura')
-- INSERT INTO cities (id,name) VALUES (1L,'Burgos') 
-- luego del into coloca el nombre de la tabla 
INSERT INTO cities (id_city, name) VALUES (default, 'Gijon')
INSERT INTO cities (id_city, name) VALUES (null ,'Burgos')
INSERT INTO cities (id_city, name) VALUES (null ,'Barcelona')
INSERT INTO cities (id_city, name) VALUES (null ,'Alicante')
INSERT INTO cities (id_city, name) VALUES (null ,'Bilbao') 

INSERT INTO treatments (id_treatment, title, description) VALUES (null, 'Diabetes', '10mg insulina')
INSERT INTO treatments (id_treatment, title, description) VALUES (null, 'Gripe', '10mg amoxicilina')
INSERT INTO treatments (id_treatment, title, description) VALUES (null, 'Migranas', '1mg Diazepam')
INSERT INTO treatments (id_treatment, title, description) VALUES (null, 'Dolor Muscular', '10mg insulina')

INSERT INTO profilies (id, id_city, age, phone, direction, id_treatment) VALUES (null, 1, 32 ,666352672, 'calle murcia,2', 'muerte')