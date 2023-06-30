package tienda.persistencia;

import java.sql.*;

public abstract class DAO {
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static final String DATABASE = "tienda";
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;

    protected void conectarBaseDeDatos() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false&timeZone=America/Mexico_City";
            conexion = DriverManager.getConnection(url, USER, PASSWORD);
        } catch (SQLException e) {
            throw e;
        }
    }
    protected void desconectarBaseDeDatos() throws Exception {
        try {
            if (conexion != null) {
                conexion.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (resultado != null) {
                resultado.close();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    protected void insertarModificarEliminar(String sql) throws Exception {
        try {
            conectarBaseDeDatos();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException e) {
            throw e;
        } finally {
            desconectarBaseDeDatos();
        }
    }

    protected void consultarBaseDeDatos(String sql) throws Exception {
        try {
            conectarBaseDeDatos();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (SQLException e) {
            throw e;
        }
    }
}
