
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
        List<String> tareas = new ArrayList<>(List.of(
                "Sacar a pasear a Kira",
                "Ir al gimnasio",
                "Estudiar Java",
                "Ver el Mundial",
                "Respetar la dieta"
        ));

        // --- Añadir nuevas tareas ---
        tareas.add("Leer 30 minutos");
        tareas.add("Revisar el correo");

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
            System.out.println((i+1) + ". " + tareas.get(i));
        }

        // --- Contar tareas que contienen una palabra ---
        int contador = 0;
        int i = 0;
        while (i < tareas.size()){
            if (tareas.get(i).contains("Java")){
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