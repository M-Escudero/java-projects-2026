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