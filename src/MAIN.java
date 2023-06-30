import tienda.servicios.FabricanteService;
import tienda.servicios.ProductoService;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ProductoService productoService = new ProductoService();
        FabricanteService  fabricanteService = new FabricanteService();
        int menu = 0;
        do {
            System.out.println();
            System.out.println("1.Mostrar productos");
            System.out.println("2.Mostrar productos con precio ");
            System.out.println("3.Mostrar productos con precio entre X y X");
            System.out.println("4.Listar Portatiles");
            System.out.println("5.Listar producto mas barato");
            System.out.println("6.Ingresar producto");
            System.out.println("7.Ingresar Fabricante");
            System.out.println("8.Modificar producto");
            System.out.println("0.Salir");
            System.out.println();
            menu = leer.nextInt();
            switch (menu){
                case 1:
                    productoService.mostrarProductos1();
                    break;
                case 2:
                    productoService.mostrarProductos2();
                    break;
                case 3:
                    productoService.mostrarProductos3(120,202);
                    break;
                case 4:
                    productoService.listarPortatiles();
                    break;
                case 5:
                    productoService.listarProductoMasBarato();
                    break;
                case 6:
                    productoService.ingresarProducto();
                    break;
                case 7:
                    fabricanteService.insertarFabricante();
                    break;
                case 8:
                    productoService.modificarProducto();
                    break;
                    case 0:
                        System.out.println("Hasta luego");
                    default:
                        System.out.println("Ingrese una opcion valida");
            }
        }while (menu != 0);
    }
}
