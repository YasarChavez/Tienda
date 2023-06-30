package tienda.persistencia;


public class ProductoDAO extends DAO {
    public void mostrarProductos1() throws Exception {
        try {
            String sql = "SELECT * FROM producto";
            conectarBaseDeDatos();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                System.out.println(resultado.getString("nombre"));
            }
        } catch (Exception e) {
            throw e;
        }
    }

    //Lista los nombres y los precios de todos los productos de la tabla producto.
    public void mostrarProductos2() throws Exception {
        try {
            String sql = "SELECT * FROM producto";
            conectarBaseDeDatos();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                System.out.println(
                        resultado.getInt("codigo") +
                                "     " + resultado.getString("nombre") +
                                "     " + resultado.getDouble("precio"));
            }
        } catch (Exception e) {
            throw e;
        }
    }

    //Listar aquellos productos que su precio esté entre 120 y 202.
    public void mostrarProductos3(int a, int b) throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE precio BETWEEN " + a + " AND " + b;
            ;
            conectarBaseDeDatos();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                System.out.println(resultado.getString("nombre") + "     " + resultado.getDouble("precio"));
            }
        } catch (Exception e) {
            throw e;
        }
    }

    //d) Buscar y listar todos los Portátiles de la tabla producto.
    public void listarPortatiles() throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%Portatil%'";
            conectarBaseDeDatos();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                System.out.println(resultado.getString("nombre") + "     " + resultado.getDouble("precio"));
            }
        } catch (Exception e) {
            throw e;
        }
    }

    //e) Listar el nombre y el precio del producto más barato.
    public void listarProductoMasBarato() throws Exception {
        try {
            String sql = "SELECT * FROM producto ORDER BY precio ASC LIMIT 1";
            conectarBaseDeDatos();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                System.out.println(resultado.getString("nombre") +
                        "     " + resultado.getDouble("precio"));
            }
        } catch (Exception e) {
            throw e;
        }
    }

    //f) Ingresar un producto a la base de datos.
    public void ingresarProducto(String nombre, double precio, int codigoFabricante) throws Exception {
        try {
            String sql = "INSERT INTO producto (nombre, precio, codigo_Fabricante) VALUES ('" + nombre + "', " + precio + ", " + codigoFabricante + ")";
            conectarBaseDeDatos();
            sentencia = conexion.createStatement();
            insertarModificarEliminar(sql);
            System.out.println("Producto ingresado");
        } catch (Exception e) {
            throw e;
        }
    }

    //h) Editar un producto con datos a elección.
    public void modificarProducto(int codigo, String nombre, double precio, int codigoFabricante) throws Exception {
        try {
            String sql = "UPDATE producto SET nombre = '" + nombre + "', precio = " + precio + ", codigo_Fabricante = " + codigoFabricante + " WHERE codigo = " + codigo;
            conectarBaseDeDatos();
            sentencia = conexion.createStatement();
            insertarModificarEliminar(sql);
            System.out.println("Producto modificado");
        } catch (Exception e) {
            throw e;
        }

    }


}
