# SUPPORT TICKET SYSTEM

Sistema básico de gestión de solicitudes de soporte técnico desarrollado con Spring Boot, JPA/Hibernate y Jakarta Validation.
Permite administrar clientes, técnicos y solicitudes mediante una API REST.

-------------------------------------------------------

# Características

-Registro de clientes
-Registro de técnicos
-Registro y gestión de solicitudes
-Asignación de cliente y técnico a cada solicitud
-API REST con operaciones CRUD
-Validación de datos (@NotBlank, @Email)
-Persistencia configurable: H2, MySQL o PostgreSQL

-------------------------------------------------------

# Modelos incluidos

# Cliente
Representa al usuario que genera una solicitud.

Campos:

id: Long
nombre: String (no vacío)
correo: String (email válido, no vacío)

-------------------------------------------------------

# Tecnico
Encargado de atender solicitudes.

Campos:
id: Long
nombre: String (no vacío)
especialidad: String

-------------------------------------------------------

# Solicitud
Entidad principal del sistema.

Relaciones:

ManyToOne - Cliente
ManyToOne - Tecnico

Campos:

id: Long
cliente: Cliente
tecnico: Tecnico
descripcion: String (obligatoria)
estado: String (por defecto: "Pendiente")

-------------------------------------------------------

# Ejecución del proyecto

Requisitos

Java 17+
Maven 3+
Base de datos (H2, MySQL o PostgreSQL)
IDE recomendado: VS Code o IntelliJ

1. Ejecutar este comando:
mvn clean install

¿Que hace?
clean: borra archivos viejos compilados (para evitar conflictos).
install: descarga las dependencias y compila el código para verificar que no hay errores.

Si todo está bien, verás:

BUILD SUCCESS

2. Iniciar Spring Boot

Luego ejecuta:
mvn spring-boot:run

¿Que hace?
Compila el proyecto (si no lo hiciste antes).
Inicia tu aplicación Spring Boot.

Verás en la consola algo como:
Tomcat started on port(s): 8080
Started SupportTicketSystemApplication in 3.456 seconds

3. Al iniciar mostrara:
Aplicación Support Ticket System iniciada correctamente en http://localhost:8080

4. Ya que el proyecto tiene Swagger configurado (springdoc-openapi), abre en tu navegador:
http://localhost:8080/swagger-ui.html
