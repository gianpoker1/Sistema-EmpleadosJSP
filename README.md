# Sistema de Manejo de Empleados

Este proyecto es un sistema de gestión de empleados desarrollado en Java utilizando el framework Spring y JSP (JavaServer Pages) para la interfaz de usuario. Permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre los registros de empleados.

## Características

- **Listado de Empleados:** Visualiza una lista de todos los empleados registrados.
- **Agregar Empleado:** Permite agregar nuevos empleados al sistema.
- **Editar Empleado:** Permite editar la información de los empleados existentes.
- **Eliminar Empleado:** Permite eliminar empleados del sistema.

## Tecnologías Utilizadas

- **Java:** Lenguaje de programación.
- **Spring Framework:** Framework para el desarrollo de aplicaciones Java.
- **JSP (JavaServer Pages):** Tecnología para la creación de páginas web dinámicas.
- **Bootstrap:** Framework CSS para el diseño de la interfaz de usuario.

## Estructura del Proyecto

- **src/main/java/gian/empleados/controller:** Contiene los controladores de Spring.
- **src/main/java/gian/empleados/model:** Contiene las clases de modelo.
- **src/main/java/gian/empleados/service:** Contiene los servicios de Spring.
- **src/main/webapp/WEB-INF/jsp:** Contiene las páginas JSP.

## Cómo ejecutar
1. Clonar el repositorio.
   ```bash
      git clone  https://github.com/gianpoker1/Sistema-EmpleadosJSP.git
   ```

## Configurar el Entorno:

Asegúrate de tener instalado Java y Maven.
Configura tu base de datos y actualiza las configuraciones en el archivo 
  ```application.properties.```

## Compilar y Ejecutar:
```bash
mvn clean install
mvn spring-boot:run
```

## Acceder a la Aplicación:

Abre tu navegador y visita `http://localhost:8080.`
