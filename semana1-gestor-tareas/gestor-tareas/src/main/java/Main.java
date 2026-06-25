
public class Main {

    public static void main(String[] args) {

        // --- Variables de distintos tipos ---
        String nombre = "Miguel";
        int edad = 25;
        double salario = 1500.50;
        boolean activo = true;

        // --- Array de tareas ---
        String [] tareas = {
                "Sacar a pasear a Kira",
                "Ir al gimnasio",
                "Estudiar Java",
                "Ver el Mundial",
                "Respetar la dieta"
        };

        // --- Imprimir las variables ---
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
        System.out.println("Activo: " + activo);

        // --- Recorrer el array e imprimir las tareas numeradas ---
        System.out.println("\n --- Lista de tareas ---");
        for (int i = 0; i < tareas.length; i++){
            System.out.println((i+1) + ". " + tareas[i]);
        }

        // --- Condicional ---
        if (tareas.length == 0){
            System.out.println("No hay tareas pendientes.");
        } else {
            System.out.println("\nTienes " + tareas.length + " tareas pendientes.");
        }


    }
}