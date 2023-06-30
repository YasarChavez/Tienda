package tienda.servicios;

import tienda.persistencia.ProductoDAO;

import java.util.Scanner;

public class ProductoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ProductoDAO dao;

    public ProductoService() {
        this.dao = new ProductoDAO();
    }

    public void mostrarProductos1() {
        try {
            dao.mostrarProductos1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void mostrarProductos2() {
        try {
            dao.mostrarProductos2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void mostrarProductos3(int a, int b) {
        try {
            dao.mostrarProductos3(a,b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void listarPortatiles() {
        try {
            dao.listarPortatiles();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void listarProductoMasBarato(){
    try {
        dao.listarProductoMasBarato();
    }catch (Exception e){
        e.printStackTrace();
    }
    }
    public void ingresarProducto(){
        try {
            System.out.println("Ingrese el nombre del producto:");
            String nombre = leer.next();
            System.out.println("Ingrese el precio del producto:");
            double precio = leer.nextDouble();
            System.out.println("Ingrese el codigo del fabricante:");
            int codigo_fabricante = leer.nextInt();
            dao.ingresarProducto(nombre,precio,codigo_fabricante);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void modificarProducto(){
        try {
            System.out.println("Ingrese la id del producto que desea modificar:");
            int id = leer.nextInt();
            System.out.println("Ingrese el nombre del producto:");
            String nombre = leer.next();
            System.out.println("Ingrese el precio del producto:");
            double precio = leer.nextDouble();
            System.out.println("Ingrese el codigo del fabricante:");
            int codigo_fabricante = leer.nextInt();
            dao.modificarProducto(id,nombre,precio,codigo_fabricante);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
