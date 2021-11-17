USE DB_LATERRAZA
GO





INSERT INTO roles (date_created, date_updated, description) VALUES('2021/11/15 12:00:00', '2021/11/15 12:00:00', 'Administrador');
INSERT INTO roles (date_created, date_updated, description) VALUES('2021/11/15 12:00:00', '2021/11/15 12:00:00', 'Empleado');

INSERT INTO roles (date_created, date_updated, description) VALUES('2021/11/15 12:00:00', '2021/11/15 12:00:00', 'Seguridad');



INSERT INTO DB_LATERRAZA.client (birth_name, date_birth, dni, first_name, last_name, middle_name, phone) VALUES('Admin', '2021/11/15 12:00:00', '77129428', 'Admin', 'Admin', 'Admin', '991023479');
INSERT INTO DB_LATERRAZA.client (birth_name, date_birth, dni, first_name, last_name, middle_name, phone) VALUES('Luz', '2021/11/15 12:00:00', '77129427', 'Fernanda', 'Smith', 'Rosa', '991023478');
INSERT INTO DB_LATERRAZA.client (birth_name, date_birth, dni, first_name, last_name, middle_name, phone) VALUES('Lopez', '2021/11/15 12:00:00', '77129426', 'Javier', 'Vazques', 'Jose', '991023477');

INSERT INTO DB_LATERRAZA.users (email, id_rol, password, id_client, id_roles) VALUES('admin@gmail.com', 2, 'luis123', 1, 1);
-- INSERT INTO DB_LATERRAZA.users (email, id_rol, password, id_client, id_roles) VALUES('luz@gmail.com', 2, 'luz123', 2, 2);
-- INSERT INTO DB_LATERRAZA.users (email, id_rol, password, id_client, id_roles) VALUES('lopezs@gmail.com', 2, 'lopez123', 3, 2);

