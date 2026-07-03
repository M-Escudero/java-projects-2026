
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class GestorTareas {

    private Repositorio repositorio = new RepositorioTareas();
    private Scanner scanner = new Scanner(System.in);


    //Método que Inicia el Menú.
    public void iniciarMenu(){

        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n=== GESTOR DE TAREAS ===");
            System.out.println("\nElige una opción: ");
            System.out.println("1. Añadir tarea.");
            System.out.println("2. Listar Tareas.");
            System.out.println("3. Completar tarea");
            System.out.println("4. Eliminar tarea");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Introduce el título de la tarea: ");
                    String titulo = scanner.nextLine();
                    try {
                        repositorio.agregar(titulo);
                        System.out.println("Tarea añadida correctamente.");
                    } catch (TareaInvalidaException e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    Map<Integer, Tarea> tareas = repositorio.listar();
                    if (tareas.isEmpty()){
                        System.out.println("No hay tareas pendientes.");
                    }else {
                        System.out.println("\n --- Lista de tareas ---");
                        for (Map.Entry<Integer, Tarea> entrada : tareas.entrySet()){
                            System.out.println(entrada.getKey() + ". " + entrada.getValue());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Introduce el ID de la tarea a completar: ");
                    int idCompletar = scanner.nextInt();
                    try {
                        repositorio.completar(idCompletar);
                        System.out.println("Tarea completada correctamente.");
                    } catch (TareaInvalidaException e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("Introduce el ID de la tarea a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    try {
                        repositorio.eliminar(idEliminar);
                        System.out.println("Tarea eliminada correctamente.");
                    } catch (TareaInvalidaException e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 0:
                    System.out.println("!Hasta Luego!");
                    break;

                default:
                    System.out.println("Opción no válida.");

            }
        }
        scanner.close();
    }
}
