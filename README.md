# Java Projects 2026

Colección de proyectos y ejercicios en Java, desarrollados de forma progresiva
mientras profundizo en programación orientada a objetos, estructuras de datos,
bases de datos y desarrollo backend con Spring Boot.

## Contenido

Cada subcarpeta corresponde a un proyecto o bloque de práctica independiente,
con su propio código y documentación.

## Stack

Java, Git, SQL , Spring Boot.

## Semana 1 — Gestor de Tareas

Aplicación de consola para gestionar tareas, construida de forma incremental
a lo largo de la semana practicando los fundamentos de Java.

### Qué hace
- Añadir tareas con ID único autoincremental
- Listar todas las tareas con su estado (pendiente/completada)
- Completar tareas por ID
- Eliminar tareas por ID
- Validación de datos con excepciones personalizadas

### Stack
Java 22, Maven

### Cómo ejecutarlo
1. Abre el proyecto `semana1-gestor-tareas/gestor-tareas` en IntelliJ
2. Ejecuta la clase `MainDia5`
3. Interactúa con el menú por consola

### Estructura
- `Tarea` — modelo de datos
- `Repositorio` — interfaz que define el contrato de acceso a datos
- `RepositorioTareas` — implementación con LinkedHashMap
- `GestorTareas` — lógica del menú e interacción con el usuario
- `TareaInvalidaException` — excepción personalizada para datos inválidos

## Semana 2: SQL + JDBC

### Base de datos
- PostgreSQL con base de datos `bootcamp`.
- Tablas: `usuarios` (id, nombre, email, fecha_registro) y `tareas` (id, titulo, completada, usuario_id, prioridad).

### SQL — consultas
- `SELECT`, `WHERE`, `ORDER BY`, `AND`/`OR`, `IN`.
- `INNER JOIN` vs `LEFT JOIN`: cuándo conservar solo coincidencias o todas las filas de una tabla.
- `GROUP BY` con funciones de agregación: `COUNT`, `SUM`, `AVG`.
- `COUNT(*)` vs `COUNT(columna)` tras un `LEFT JOIN`, y por qué usar la clave primaria de la tabla "derecha" para contar correctamente.
- `HAVING` para filtrar sobre resultados agregados (diferencia con `WHERE`).
- `COALESCE` para sustituir valores `NULL` por un valor por defecto.

### SQL — modificación de datos
- `INSERT INTO`, `UPDATE ... SET ... WHERE`, `DELETE FROM ... WHERE`.
- Buena práctica: verificar con `SELECT` antes de un `UPDATE`/`DELETE`.
- Transacciones: `BEGIN`, `COMMIT`, `ROLLBACK`, y el auto-commit de DBeaver.

### JDBC — Java conectado a PostgreSQL
- `ConexionDB.java`: gestiona la conexión con `DriverManager.getConnection()`.
- Contraseña gestionada de forma segura mediante variable de entorno (`System.getenv("DB_PASSWORD")`), nunca escrita en el código.
- `UsuarioDAO.java`: implementación del patrón DAO (Data Access Object) para separar el acceso a datos del resto de la lógica.
- `PreparedStatement`, `executeQuery()` y `ResultSet` (recorrido con `while (rs.next())`) para leer datos reales desde Java.

### Git
- Flujo de ramas: `git checkout -b` para crear una rama de feature.
- Merge fast-forward vs merge con conflicto real.
- Resolución de conflictos con el editor visual de IntelliJ (Resolve Conflicts).
- Revisión y ampliación del `.gitignore` (`target/`, `.idea/`, `*.class`).
- Conventional Commits en todos los commits de la semana.
