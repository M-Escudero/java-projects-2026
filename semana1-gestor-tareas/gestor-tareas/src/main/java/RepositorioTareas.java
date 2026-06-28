import java.util.ArrayList;
import java.util.List;

public class RepositorioTareas implements Repositorio {

    private List<Tarea> tareas = new ArrayList<>();

    @Override
    public  void agregar(Tarea tarea){
        if (tarea.titulo == null || tarea.titulo.isEmpty()){
            throw new TareaInvalidaException("El título no puede estar vacío");
        }
        tareas.add(tarea);
    }

    @Override
    public List<Tarea> listar(){
        return tareas;
    }
}
