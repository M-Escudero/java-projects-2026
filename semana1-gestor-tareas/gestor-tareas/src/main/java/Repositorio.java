import java.util.List;

public interface Repositorio {

    void agregar(Tarea tarea);
    List<Tarea> listar();
}
