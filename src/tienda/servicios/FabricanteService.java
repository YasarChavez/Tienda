package tienda.servicios;

import tienda.persistencia.FabricanteDAO;


import java.util.Scanner;

public class FabricanteService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private FabricanteDAO dao;

    public FabricanteService( ) {
        this.dao = new FabricanteDAO();
    }
    public void insertarFabricante() {
        System.out.println("Ingrese el nombre del fabricante");
        String nombre = leer.next();
        try {
            dao.ingresarFabricante(nombre);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
