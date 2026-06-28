public class TareaInvalidaException extends RuntimeException{

    public TareaInvalidaException(String mensaje){
        super(mensaje); //Le paso el mensaje al constructor de RuntimeException.
    }

  /*  La regla de super:

    - Si la clase padre tiene un constructor con parámetros, la clase hija debe llamar a super(...) en la primera línea de su constructor.
    - Si no lo pones explícitamente, Java intenta llamar a super() sin parámetros automáticamente — y si el padre no tiene ese constructor, falla. */
}
