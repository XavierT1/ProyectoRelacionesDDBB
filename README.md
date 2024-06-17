Nombre:Freddy Xavier Tapia Rea

Proyecto de Relaciones en Base de Datos con Spring Boot
=======================================================

Este proyecto implementa un sistema de relaciones entre entidades utilizando Spring Boot y JPA/Hibernate. A continuación se detallan las entidades principales y sus relaciones:

1. Entidades y Relaciones
--------------------------

- **Locker**:
  - Entidad que representa un casillero.
  - Relación `@OneToOne` con `Student`.

- **Student**:
  - Entidad que representa un estudiante.
  - Relación `@OneToOne` con `Locker`.
  - Relación `@ManyToMany` con `Subject`.

- **Subject**:
  - Entidad que representa una asignatura.
  - Relación `@ManyToMany` con `Student`.
  - Relación `@ManyToOne` con `Teacher`.

- **Teacher**:
  - Entidad que representa un profesor.
  - Relación `@OneToMany` con `Subject`.

2. Funcionalidades Principales
------------------------------

- **Lockers**:
  - Consultar todos los lockers: `GET /lockers`.
  - Crear un nuevo locker: `POST /lockers`.

- **Students**:
  - Consultar todos los estudiantes: `GET /students`.
  - Crear un nuevo estudiante: `POST /students`.
  - Asignar un locker a un estudiante existente: `PUT /students/{studentId}/locker`.

- **Subjects**:
  - Consultar todas las asignaturas: `GET /subjects`.
  - Crear una nueva asignatura: `POST /subjects`.
  - Agregar un estudiante a una asignatura existente: `PUT /subjects/{subjectId}/students/{studentId}`.
  - Asignar un profesor a una asignatura existente: `PUT /subjects/{subjectId}/teacher/{teacherId}`.

- **Teachers**:
  - Consultar todos los profesores: `GET /teachers`.
  - Crear un nuevo profesor: `POST /teachers`.

3. Configuración Adicional
--------------------------

El proyecto utiliza una configuración adicional en `WebConfiguration` para habilitar la consola de H2 Database.

4. Ejecución del Proyecto
-------------------------

Para ejecutar el proyecto, asegúrate de tener configurado Java y Maven correctamente. 


Esto iniciará la aplicación en un servidor embebido en el puerto predeterminado (`8080`).

5. Base de Datos H2
--------------------

Puedes acceder a la consola de la base de datos H2 para consultar y administrar los datos utilizando la URL:
http://localhost:8080/h2-console


Asegúrate de que la configuración de la URL de la base de datos en `application.properties` esté apuntando correctamente a la base de datos H2.

6. Notas Adicionales
---------------------

- Asegúrate de tener las dependencias necesarias en tu archivo `pom.xml` para JPA, Spring Web, y H2 Database.
- Revisa los archivos de configuración `application.properties` para ajustar las configuraciones de base de datos según sea necesario.

¡Gracias!
