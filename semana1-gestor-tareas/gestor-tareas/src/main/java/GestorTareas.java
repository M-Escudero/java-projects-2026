
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class GestorTareas {

    private Map<Integer, Tarea> tareas = new LinkedHashMap<>();
    private int siguienteId = 1;
    private Scanner scanner = new Scanner(System.in);


    //Método para Añadir tareas.
    public void agregar(String titulo) {

        if (titulo == null || titulo.isEmpty()) {
            throw new TareaInvalidaException("El título no puede estar vacío");
        }

        tareas.put(siguienteId, new Tarea(titulo));
        siguienteId++;
        System.out.println("Tarea añadida con ID: " + (siguienteId - 1));
    }

    //Método para Hacer Lista de Tareas.
    public void listar(){

        if (tareas.isEmpty()){
            System.out.println("No hay tareas pendientes.");
            return;
        }
        System.out.println("\n --- Lista de Tareas ---");
        for (Map.Entry<Integer, Tarea> entrada : tareas.entrySet()){
            System.out.println(entrada.getKey() + ". " + entrada.getValue());
        }
    }

    //Método para Tarea completada.
    public void completar(int id){

        Tarea tarea = tareas.get(id); //La regla general es: crea una variable local cuando vayas a usar el mismo valor más de una vez,
                                      // o cuando necesites guardarlo para comprobarlo antes de usarlo.

        if (tarea == null){
            System.out.println("No existe una tarea con ID: " + id);
            return;
        }
        tarea.marcarCompletada();
        System.out.println("Tarea completada: " + tarea.titulo);
    }

    //Método para eliminar Tareas.
    public void eliminar(int id){

        Tarea tarea = tareas.get(id);

        if (tarea == null){
            System.out.println("No existe una tarea con ID: " + id);
            return;
        }
        tareas.remove(id);
        System.out.println("Tarea eliminada: " + tarea.titulo);
    }

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
                        agregar(titulo);
                    } catch (TareaInvalidaException e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    listar();
                    break;

                case 3:
                    System.out.println("Introduce el ID de la tarea a completar: ");
                    int idCompletar = scanner.nextInt();
                    completar(idCompletar);
                    break;

                case 4:
                    System.out.println("Introduce el ID de la tarea a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    eliminar(idEliminar);
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
