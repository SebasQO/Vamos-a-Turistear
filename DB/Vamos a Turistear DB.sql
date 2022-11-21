USE dbturistear
GO

CREATE TABLE Usuario(
    ID_Usuario INT PRIMARY KEY IDENTITY(1,1),
    Nombre VARCHAR(60) NOT NULL,
	Correo VARCHAR(60) NOT NULL,
	Telefono VARCHAR(10) NOT NULL,
	Contrasena VARCHAR(60) NOT NULL
);

ALTER TABLE dbo.Usuario
ADD Usuario VARCHAR(60) NOT NULL;

CREATE TABLE Costo_General(
    ID_Costo INT PRIMARY KEY IDENTITY(1,1),
    costo_Sitio FLOAT NOT NULL,
	costo_comida FLOAT NOT NULL,
	costo_hospedaje FLOAT NOT NULL,
	promedio_precio FLOAT NOT NULL,
	costo_extra FLOAT NOT NULL
);

ALTER TABLE DBO.Costo_General
DROP COLUMN costo_extra;

CREATE TABLE Vehiculo(
    ID_Vehiculo INT PRIMARY KEY IDENTITY(1,1),
    Tipo_Vehiculo VARCHAR(50) NOT NULL
);

CREATE TABLE Recomendaciones(
    ID_Recomendaciones INT PRIMARY KEY IDENTITY(1,1),
    Recomendaciones VARCHAR(max) NOT NULL
);

CREATE TABLE Mascotas(
    ID_Mascotas INT PRIMARY KEY IDENTITY(1,1),
    Accesibilidad_Mascotas VARCHAR(10) NOT NULL
);

CREATE TABLE Telefono(
    ID_Telefono INT PRIMARY KEY IDENTITY(1,1),
    Numero_Movil INT NOT NULL,
	Numero_Fijo INT NOT NULL,
	Numero_Whatsapp INT NOT NULL
);

CREATE TABLE Parqueo(
    ID_Parqueo INT PRIMARY KEY IDENTITY(1,1),
	Capacidad_Parqueo INT NOT NULL,
    disponibilidad_Parqueo VARCHAR(10) NOT NULL
);

CREATE TABLE Clima(
    ID_Clima INT PRIMARY KEY IDENTITY(1,1),
	Tipo_Clima VARCHAR(25) NOT NULL
);

CREATE TABLE Accesibilidad(
    ID_Accesibilidad INT PRIMARY KEY IDENTITY(1,1),
	Tipo_Accesibilidad VARCHAR(25) NOT NULL,
	Accesibilidad_Discapacitados VARCHAR(10) NOT NULL
);

CREATE TABLE Direccion(
    ID_Direccion INT PRIMARY KEY IDENTITY(1,1),
	Provincia VARCHAR(25) NOT NULL,
	Canton VARCHAR(25) NOT NULL,
	Distrito VARCHAR(25) NOT NULL,
	Codigo_Postal VARCHAR(15) NOT NULL,
	Direccion_Detallada VARCHAR(max) NOT NULL,
);

CREATE TABLE Rating(
    ID_Rating INT PRIMARY KEY IDENTITY(1,1),
	Rating VARCHAR(25) NOT NULL,
	Cantidad_Rating INT NOT NULL,
);

CREATE TABLE Detalles(
    ID_Detalles INT PRIMARY KEY IDENTITY(1,1),
	ID_Direccion INT NOT NULL,
	ID_Rating INT NOT NULL,
	ID_Accesibilidad INT NOT NULL,
	ID_Clima INT NOT NULL,
	ID_Parqueo INT NOT NULL,
	ID_Telefono INT NOT NULL,
	ID_Mascotas INT NOT NULL,
	ID_Recomendaciones INT NOT NULL,
	ID_Vehiculo INT NOT NULL,
	ID_Costo INT NOT NULL,

	FOREIGN KEY (ID_Direccion) REFERENCES dbo.Direccion (ID_Direccion),
	FOREIGN KEY (ID_Rating) REFERENCES dbo.Rating (ID_Rating),
	FOREIGN KEY (ID_Accesibilidad) REFERENCES dbo.Accesibilidad (ID_Accesibilidad),
	FOREIGN KEY (ID_Clima) REFERENCES dbo.Clima (ID_Clima),
	FOREIGN KEY (ID_Parqueo) REFERENCES dbo.Parqueo (ID_Parqueo),
	FOREIGN KEY (ID_Telefono) REFERENCES dbo.Telefono (ID_Telefono),
	FOREIGN KEY (ID_Mascotas) REFERENCES dbo.Mascotas (ID_Mascotas),
	FOREIGN KEY (ID_Recomendaciones) REFERENCES dbo.Recomendaciones (ID_Recomendaciones),
	FOREIGN KEY (ID_Vehiculo) REFERENCES dbo.Vehiculo (ID_Vehiculo),
	FOREIGN KEY (ID_Costo) REFERENCES dbo.Costo_General (ID_Costo)
);


CREATE TABLE Sitio(
    ID_Sitio INT PRIMARY KEY IDENTITY(1,1),
	Fecha_Registro VARCHAR(25) NOT NULL
);

CREATE TABLE Catarata(
    ID_Catarata INT PRIMARY KEY IDENTITY(1,1),
	ID_Sitio INT NOT NULL,
	Nombre_Sitio VARCHAR(50) NOT NULL,
	Distancia VARCHAR(50) NOT NULL,
	Dificultad VARCHAR(50) NOT NULL,
	ID_Detalles INT NOT NULL,

	FOREIGN KEY (ID_Sitio) REFERENCES dbo.Sitio (ID_Sitio),
	FOREIGN KEY (ID_Detalles) REFERENCES dbo.Detalles (ID_Detalles)
);

CREATE TABLE Reseña(
    ID_Reseña INT PRIMARY KEY IDENTITY(1,1),
	ID_Sitio INT NOT NULL,
	ID_Usuario INT NOT NULL,
	Titulo_Reseña VARCHAR(60) NOT NULL,
	Descripcion_Reseña VARCHAR(60) NOT NULL

	FOREIGN KEY (ID_Sitio) REFERENCES dbo.Sitio (ID_Sitio),
	FOREIGN KEY (ID_Usuario) REFERENCES dbo.Usuario (ID_Usuario)
);


