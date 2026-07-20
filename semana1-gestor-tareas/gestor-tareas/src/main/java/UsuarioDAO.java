import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    public List<String> listarUsuarios(){
        List<String> nombres = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";

        try(Connection con = ConexionDB.getConexion();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();){

            while (rs.next()){
                nombres.add(rs.getString("nombre"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return nombres;
    }
}
