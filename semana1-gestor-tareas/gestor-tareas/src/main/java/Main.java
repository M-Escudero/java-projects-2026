
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // --- Variables de distintos tipos ---
        String nombre = "Miguel";
        int edad = 25;
        double salario = 1500.50;
        boolean activo = true;

        // --- Array de tareas ---
     /*   String [] tareas = {
                "Sacar a pasear a Kira",
                "Ir al gimnasio",
                "Estudiar Java",
                "Ver el Mundial",
                "Respetar la dieta"
        }; */

        // --- Sustitución de Array por Arraylist ---
       /* List<String> tareas = new ArrayList<>(List.of(
                "Sacar a pasear a Kira",
                "Ir al gimnasio",
                "Estudiar Java",
                "Ver el Mundial",
                "Respetar la dieta"
        )); */

        // --- Creación de Lista de Tareas con objetos de tipo Tarea (En lugar de con String)
        List<Tarea> tareas = new ArrayList<>(List.of(
                new Tarea("Sacar a pasear a Kira"),
                new Tarea("Ir al gimnasio"),
                new Tarea("Estudiar Java"),
                new Tarea("Ver el Mundial"),
                new Tarea("Respetar la dieta")
        ));

        //Marcar la tarea en posición 2 como completada
        tareas.get(2).marcarCompletada();

        // --- Añadir nuevas tareas ---
        tareas.add(new Tarea("Leer 30 minutos"));
        tareas.add(new Tarea("Revisar el correo"));

        // --- Eliminar la tarea en posición 0
        tareas.remove(0);

        // --- Imprimir las variables ---
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
        System.out.println("Activo: " + activo);

        // --- Recorrer el array e imprimir las tareas numeradas ---
        System.out.println("\n --- Lista de tareas ---");
        for (int i = 0; i < tareas.size(); i++){
            System.out.println((i+1) + ". " + tareas.get(i).toString());
            /*System.out.println((i + 1) + ". " + tareas.get(i)); --> |Java llama a toString() automáticamente cuando intentas concatenar|
                                                                      |un objeto con un String usando +,                                 |
                                                                      |o cuando lo pasas directamente a System.out.println().            |
                                                                      |Java sabe que necesita convertir el objeto a texto,               |
                                                                      |y busca el método toString() para hacerlo.)                       |
                                                                   */
        }

        // --- Contar tareas que contienen una palabra ---
        int contador = 0;
        int i = 0;
        while (i < tareas.size()){
            if (tareas.get(i).toString().contains("Java")){
                //tareas.get(i).titulo.contains("Java") (más limpio acceder directamente al atributo título.)
                contador++;
            }
            i++;
        }
        System.out.println("Tareas que contienen 'Java': " + contador);


        // --- Condicional ---
        if (tareas.size() == 0){
            System.out.println("No hay tareas pendientes.");
        } else {
            System.out.println("\nTienes " + tareas.size() + " tareas pendientes.");
        }


    }
}