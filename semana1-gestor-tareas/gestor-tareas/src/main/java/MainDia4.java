
import java.util.ArrayList;
import java.util.List;

public class MainDia4 {

    public static void main(String[] args) {

        RepositorioTareas repo = new RepositorioTareas();

        //Añadir tareas válidas.
        repo.agregar(new Tarea("Sacar a pasear a Kira"));
        repo.agregar(new Tarea("Ir al gimnasio"));
        repo.agregar(new Tarea("Estudiar Java"));
        repo.agregar(new Tarea("Ver el mundial"));
        repo.agregar(new Tarea("Respetar la dieta"));

        //Marcar una tarea como completada.
        repo.listar().get(2).marcarCompletada();

        //Intentar añadir una tarea inválida.
        try {
            repo.agregar(new Tarea(""));
        } catch (TareaInvalidaException e){
            System.out.println("Error controlado: " + e.getMessage());
        }

        //Listar todas las tareas.
        System.out.println("\n --- Lista de tareas ---");
        List<Tarea> tareas = repo.listar();
        for (int i = 0; i < tareas.size(); i++){
            System.out.println((i + 1) + ". " + tareas.get(i));
        }

        System.out.println("\n Total de tareas: " + tareas.size());
    }
}
