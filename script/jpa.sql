
CREATE TABLE registradora (
  id int NOT NULL,
  id_asociado varchar(20) NOT NULL,
  fecha date NOT NULL,
 PRIMARY KEY (id),
FOREIGN KEY (id_asociado) REFERENCES asociado(nombre)
) 

create table asociado(
nombre varchar (20)NOT NULL,
PRIMARY KEY (nombre)

)

