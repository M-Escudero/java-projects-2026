import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class MainDia5 {

    public static void main(String[] args) {
     //   GestorTareas gestor = new GestorTareas();
     //   gestor.iniciarMenu();

        UsuarioDAO dao = new UsuarioDAO();
        List<String> usuarios = dao.listarUsuarios();

        for (String nombre : usuarios){
            System.out.println(nombre);
        }


    }
}
