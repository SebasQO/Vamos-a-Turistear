USE dbturistear
GO

--dbo.Sitio
INSERT INTO dbo.Sitio (Fecha_Registro)
VALUES ('11/19/2022');
SELECT * FROM dbo.Sitio;

DELETE FROM dbo.Sitio;

DBCC CHECKIDENT('dbo.Sitio', RESEED, 0)
--dbo.Sitio

--dbo.Catarata
INSERT INTO dbo.Catarata(ID_Sitio, Nombre_Sitio, Distancia, Dificultad, ID_Detalles)
VALUES (1,'CATARATA LAS GEMELAS', 'Menos de 5km', 'Intermedio', 1);
SELECT * FROM dbo.Catarata;

DELETE FROM dbo.Catarata;

DBCC CHECKIDENT('dbo.Catarata', RESEED, 0)
--dbo.Catarata

--dbo.Catarata
INSERT INTO dbo.Detalles(ID_Direccion, ID_Rating, ID_Accesibilidad, ID_Clima, ID_Parqueo, ID_Telefono, 
ID_Mascotas, ID_Recomendaciones, ID_Vehiculo, ID_Costo)
VALUES (1,1,1,1,1,1,1,1,1,1);
SELECT * FROM dbo.Detalles;

DELETE FROM dbo.Detalles;

DBCC CHECKIDENT('dbo.Detalles', RESEED, 0)
--dbo.Catarata

--dbo.Costo_General
INSERT INTO dbo.Costo_General(costo_Sitio, costo_comida, costo_hospedaje, promedio_precio, costo_Guia)
VALUES (4000,8500,15000, 31000 ,3500);
SELECT * FROM dbo.Costo_General;

DELETE FROM dbo.Costo_General;

DBCC CHECKIDENT('dbo.Costo_General', RESEED, 0)
--dbo.Costo_General

--dbo.Vehiculo
INSERT INTO dbo.Vehiculo(Tipo_Vehiculo)
VALUES ('4x4 o Alto');
SELECT * FROM dbo.Vehiculo;

DELETE FROM dbo.Vehiculo;

DBCC CHECKIDENT('dbo.Vehiculo', RESEED, 0)
--dbo.Vehiculo

--dbo.Recomendaciones
INSERT INTO dbo.Recomendaciones(Recomendaciones)
VALUES ('Ropa fresca, traje de baño, tenis de trail o botas de hule, sombrero, gorra, protección solar, repelente, paño, par de botellas de agua y excelente actitud.');
SELECT * FROM dbo.Recomendaciones;

DELETE FROM dbo.Recomendaciones;

DBCC CHECKIDENT('dbo.Recomendaciones', RESEED, 0)
--dbo.Recomendaciones

--dbo.Mascotas
INSERT INTO dbo.Mascotas(Accesibilidad_Mascotas)
VALUES ('Si');
SELECT * FROM dbo.Mascotas;

DELETE FROM dbo.Mascotas;

DBCC CHECKIDENT('dbo.Mascotas', RESEED, 0)
--dbo.Mascotas

--dbo.Telefono
INSERT INTO dbo.Telefono(Numero_Fijo, Numero_Movil, Numero_Whatsapp)
VALUES (22222222, 88888888, 99999999);
SELECT * FROM dbo.Telefono;

DELETE FROM dbo.Telefono;

DBCC CHECKIDENT('dbo.Telefono', RESEED, 0)
--dbo.Telefono

--dbo.Parqueo
INSERT INTO dbo.Parqueo(Capacidad_Parqueo, disponibilidad_Parqueo)
VALUES (100, 'Si');
SELECT * FROM dbo.Parqueo;

DELETE FROM dbo.Parqueo;

DBCC CHECKIDENT('dbo.Parqueo', RESEED, 0)
--dbo.Parqueo

--dbo.Clima
INSERT INTO dbo.Clima(Tipo_Clima)
VALUES ('Lluvioso');
SELECT * FROM dbo.Clima;

DELETE FROM dbo.Clima;

DBCC CHECKIDENT('dbo.Clima', RESEED, 0)
--dbo.Clima

--dbo.Accesibilidad
INSERT INTO dbo.Accesibilidad(Tipo_Accesibilidad, Accesibilidad_Discapacitados)
VALUES ('Todo publico', 'No');
SELECT * FROM dbo.Accesibilidad;

DELETE FROM dbo.Accesibilidad;

DBCC CHECKIDENT('dbo.Accesibilidad', RESEED, 0)
--dbo.Accesibilidad

--dbo.Rating 
INSERT INTO dbo.Rating (Cantidad_Rating, Rating)
VALUES (150, '4.5 de 5');
SELECT * FROM dbo.Rating;

DELETE FROM dbo.Rating;

DBCC CHECKIDENT('dbo.Rating', RESEED, 0)
--dbo.Rating

--dbo.Direccion 
INSERT INTO dbo.Direccion (Provincia, Canton, Distrito, Codigo_Postal, Direccion_Detallada)
VALUES ('Alajuela', 'Valverde Vega', 'Toro Amarilla', '21203', 'Se agarra hacia Puriscal, pasando por detrás de la iglesia se sigue para arriba y luego de 1 hora se llega al P.N. La Cangreja y de ahí se gira hacia la izquierda en los Rótulos que dicen Mastatal. Luego de pasar un par de puentes se llega a una intersección que tiene una venta de productos locales, aquí se gira de nuevo a la izquierda y se continúa hasta ver el rótulo de Villas Mastatal.');
SELECT * FROM dbo.Direccion;

DELETE FROM dbo.Direccion;

DBCC CHECKIDENT('dbo.Direccion', RESEED, 0)
--dbo.Direccion

--dbo.Reseña 
INSERT INTO dbo.Reseña (ID_Sitio, ID_Usuario, Titulo_Reseña, Descripcion_Reseña)
VALUES (1, 1, 'CATARATA LAS GEMELAS', 'Lugar muy agradable');
SELECT * FROM dbo.Reseña;

DELETE FROM dbo.Reseña;

DBCC CHECKIDENT('dbo.Reseña', RESEED, 0)
--dbo.Reseña

--dbo.Usuario
INSERT INTO dbo.Usuario (Nombre, Correo, Telefono, Contrasena, Usuario)
VALUES ('Sebastian Quesada Ocampo', 'sebasqo21@outlook.com', 83468843, 'Sebas1234', 'SebasQO');
SELECT * FROM dbo.Usuario;

select * from dbo.Usuario where Nombre = 'Sebastian Quesada Ocampo' and Contrasena='Sebas1234';
select * from dbo.Usuario where Nombre =(?) and Contrasena=(?);

DELETE FROM dbo.Usuario;

DBCC CHECKIDENT('dbo.Usuario', RESEED, 0)
--dbo.Usuario


SELECT 
si.ID_Sitio, 
us.ID_Usuario, 
re.Titulo_Reseña, 
re.Descripcion_Reseña

FROM dbo.Reseña as re
JOIN dbo.Sitio AS si
JOIN dbo.Usuario AS us

ON Orders.CustomerID = Customers.CustomerID;