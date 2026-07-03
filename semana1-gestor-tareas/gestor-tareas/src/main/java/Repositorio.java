import java.util.List;
import java.util.Map;

public interface Repositorio {

    void agregar(String titulo);
    Map<Integer, Tarea> listar();
    void completar(int id);
    void eliminar(int id);
}
