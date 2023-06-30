package tienda.persistencia;

public class FabricanteDAO extends DAO{

    public void ingresarFabricante(String nombre) throws Exception {
        try {
            String sql = "INSERT INTO fabricante (nombre) VALUES ('" + nombre + "')";
            conectarBaseDeDatos();
            sentencia = conexion.createStatement();
            insertarModificarEliminar(sql);
            System.out.println("Fabricante ingresado");
        } catch (Exception e) {
            throw e;
        }
    }
}
