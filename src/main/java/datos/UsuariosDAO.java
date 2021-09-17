package datos;

import Domain.*;
import java.sql.*;
import java.util.*;

public class UsuariosDAO {

    public static final String SQL_SELECT = "SELECT id_usuario, usuario, contrasenia FROM test.usuarios";

    public List<Usuarios> seleccionar() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuarios usuario = null;
        List<Usuarios> usuarios = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {

                int IdPersona = rs.getInt("id_usuario");
                String usuariobd = rs.getString("usuario");
                String pass = rs.getString("contrasenia");

                usuario = new Usuarios(IdPersona, usuariobd, pass);

                usuarios.add(usuario);

            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {

            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);

            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }

        return usuarios;

    }
}
