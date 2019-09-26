## Back-End API
La API se ha realizado en Spring Boot utilizando Maven para compilación.
En ésta API comprende un CRUD con una Tabla.
> La API se ejecuta en la direccion: http://localhost:8080
#### URLS 
-  Las urls para la utilización de la api son:

	-  Listar y Agregar Registros 
		> /registros
	-  Actualizar, Borrar y Obtener 1 registro
		> /registros/{id}
#### BDD implementada en MySql 
- La base de datos llamada **maven_spring** cuenta con una tabla llamada **registros** conformada por:
	
	-  id 
		>  llave primaria única y auto incremental, que no puede ser nula y del tipo Int
	- valor
		> es un valor entero del tipo int, el cual no puede ser nulo
	-  nombre 
		> considerado como el nombre de la variable, es del tipo varchar y no puede ser nulo
	
	*Es importante cambiar el usuario y contraseña de acceso a la base de datos My SQl ubicado en el archivo  **aplication.propeties** , ademas de cambiar el puerto de la base de datos el cual actualmente se ejecuta en **localhost:3307/maven_spring**  *
#### Versiones de Maven, Spring Boot, JDK-Java, MySql
- Maven  3.6.2
- Spring boot  5.1.9
- JDK-Java 1.8
- MySql 8.0.17.0
		

## Front-End React-Admin
El front-end esta realizado en React-Admin, en el cual se ha implementado un CRUD completo.
> La aplicación se ejecuta en http://localhost:3000

#### Instalación y ejecución
El proceso para la instalación y ejecución del fron-end ubicado del del directorio Azurian_FrontEnd:
- npm intall
- npm start

> En esta aplicación se mapean  los recursos, proporcionando un interfaz para su utilización.