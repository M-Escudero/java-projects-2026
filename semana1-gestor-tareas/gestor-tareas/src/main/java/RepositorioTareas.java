
import java.util.LinkedHashMap;
import java.util.Map;

public class RepositorioTareas implements Repositorio {

    private Map<Integer, Tarea> tareas = new LinkedHashMap<>();
    private int siguienteId = 1;

    @Override
    public void agregar(String titulo){
        if (titulo == null || titulo.isEmpty()){
            throw new TareaInvalidaException("El título no puede estar vacío");
        }
        tareas.put(siguienteId, new Tarea(titulo));
        siguienteId++;
    }

    @Override
    public Map<Integer, Tarea> listar(){
        return tareas;
    }

    @Override
    public void completar(int id){
        Tarea tarea = tareas.get(id);
        if (tarea == null){
            throw new TareaInvalidaException("No existe una tarea con ID: " + id);
        }
        tarea.marcarCompletada();;
    }

    @Override
    public void eliminar(int id){
        if (!tareas.containsKey(id)){
            throw new TareaInvalidaException("No existe una tarea con ID: " + id);
        }
        tareas.remove(id);
    }
}
