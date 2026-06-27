public class Tarea {

    //Atributos
    String titulo;
    boolean completada;

    //Constructor
    public Tarea(String titulo){
        this.titulo = titulo;
        this.completada = false;
    }

    //Método para marcar la tarea como completada
    public void marcarCompletada(){
        this.completada = true;
    }

    //Método ToString: define cómo se imprime un objeto Tarea
    @Override
    public String toString(){
        if (completada){
            return "[X] " + titulo;
        } else {
            return "[ ] " + titulo;
        }
    }
}
