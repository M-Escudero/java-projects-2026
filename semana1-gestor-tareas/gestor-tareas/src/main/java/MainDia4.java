
import java.util.Map;

public class MainDia4 {

    public static void main(String[] args) {

        RepositorioTareas repo = new RepositorioTareas();

        //Añadir tareas válidas.
        repo.agregar("Sacar a pasear a Kira");
        repo.agregar("Ir al gimnasio");
        repo.agregar("Estudiar Java");
        repo.agregar("Ver el mundial");
        repo.agregar("Respetar la dieta");

        //Marcar una tarea como completada.
        repo.completar(2);

        //Intentar añadir una tarea inválida.
        try {
            repo.agregar("");
        } catch (TareaInvalidaException e){
            System.out.println("Error controlado: " + e.getMessage());
        }

        //Listar todas las tareas.
        System.out.println("\n --- Lista de tareas ---");
        Map<Integer, Tarea> tareas = repo.listar();
        for (Map.Entry<Integer, Tarea> entrada : tareas.entrySet()) {
            System.out.println(entrada.getKey() + ". " + entrada.getValue());
        }

        System.out.println("\n Total de tareas: " + tareas.size());
    }
}
