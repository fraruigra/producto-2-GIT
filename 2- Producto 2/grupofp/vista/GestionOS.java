package grupofp.vista;

import grupofp.Controlador.Controlador;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.ResourceBundle.Control;


public class GestionOS {
       private Controlador controlador; 
       Scanner sn = new Scanner(System.in);

    public void inicio() {
        controlador = new Controlador();
        boolean salir = false;
        char opcion;
        do{
            System.out.println("1. Gestión Articulos");
            System.out.println("2. Gestión Clientes");
            System.out.println("3. Gestión Pedidos");
            System.out.println("0. Salir");
            opcion = sn.nextLine();
            switch (opcion) {
                case '1':
                    Gestion_Articulos();
                    break;
                case '2':
                    Gestion_Clientes();
                    break;
                case '3':
                    Gestion_Pedidos();
                    break;
                case '0':
                    salir = true;
            }
        } while(!salir);
    }



public Gestion_Articulos(){
    char option;
    boolean salir = false;
    
    do{
        System.out.println("1. Anadir Articulo");
        System.out.println("2. Mostrar Articulo");
        System.out.println("0. Volver");

        switch ( option) {
            case 1:
                OptAddArticulo();
                break;
            case 2:
                OptListaArticulos();
                break;
            case 0:
                salir=true;
        }
    }
    while (!salir);       
}

public void OptAddArticulo(){
    System.out.print("Introducir codigo articulo:");
    String codigo = sn.nextLine();
    System.out.print("Descripcion del articulo:");
    String descripcion = sn.nextLine();
    System.out.print("Introducir precio de venta:");
    Double precioVenta = sn.nextDouble();
    System.out.print("Introducir gastos de envio:");
    Double gastosEnvio = sn.nextDouble();
    System.out.print("Introducir tiempo de preparacion en minutos 00:00:");
    String str = sn.next();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("00:00");
    LocalDateTime tiempoPreparacion = LocalDateTime.parse(str, formatter);

    boolean art = controlador.anadirArticulo(codigo, descripcion, precioVenta, gastosEnvio, tiempoPreparacion);
        if(art){
            System.out.println("Articulo creado correctamente.");
        }else{
            System.out.println("Articulo ya existe.");
        }

}

public void OptListaArticulos(){
    System.out.println(controlador.articulosLista());
}


public boolean Gestion_Clientes(boolean salir){
    Scanner sn = new Scanner(System.in); 
    int option;
    
    while (!salir){
        System.out.println("1. Anadir Clientes");
        System.out.println("2. Mostrar Clientes");
        System.out.println("3. Mostrar Clientes Estandar");
        System.out.println("4. Mostrar Clientes Premium");
        System.out.println("0. Volver");

        switch ( option) {
            case 1:
                OptAddCliente();
                break;
            case 2:
                OptListaCliente()
                break;
            case 3:
                OptListaEstandar();
                break;
            case 4:
                OptListaPremium();
                break;
            case 0:
                salir=true;
        }
        return(salir);
}

public void OptAddCliente(){
    System.out.print("Nif del cliente: ");
        String nif = sn.nextLine();
        System.out.print("nombre del cliente: ");
        String nombre =  sn.nextLine();
        System.out.print("Email del cliente: ");
        String email = sn.nextLine();
        System.out.print("Domicilio del Cliente: ");
        String domicilio = sn.nextLine();
        System.out.println("Elige tipo de Cliente: ");
        System.out.println("1. Cliente Estandard: ");
        System.out.println("2. Cliente Premium: ");
        String tipo = sn.nextLine();
        if (tipo == "1") {
            controlador.anadirClienteEstandar(nif, nombre, email, domicilio);
        } else if (tipo == "2") {
            controlador.anadirClientePremium(nif, nombre, email, domicilio)
        }
    }

public void OptListaCliente(){
    System.out.println(controlador.clientesLista());
}

public void OptListaEstandar(){
    System.out.println(controlador.clientesListaEstandar());
}
public void OptListaPremium(){
    System.out.println(controlador.clientesListaPremium());
}

public boolean Gestion_Pedidos(boolean salir){
    Scanner sn = new Scanner(System.in); 
    int option;
    
    while (!salir){
        System.out.println("1. Anadir pedidos");
        System.out.println("2. Mostrar pedidos");
        System.out.println("3. Mostrar pedidos pendientes de envio");
        System.out.println("4. Mostrar pedidos enviados");
        System.out.println("0. Volver");
     
            switch (option) {
                case 1:
                    datos.setListaPedidos(lista);
                    break;
                case 2:
                    datos.eliminarPedido(lista);
                    break;
                case 3:
                    for (ListaPedidos listaPedidos : listaPedidos) {
                        if (!listaArticulos.articulo.getEnviado()) {
                            listaPedidos.pedidos.tostring();
                        }
                    }
                    break;
                case 4:
                    for (ListaPedidos listaPedidos : listaPedidos) {
                        if (listaArticulos.articulo.getEnviado()) {
                            listaPedidos.pedidos.tostring();
                        }
                    }
                    break;
                case 0:
                    salir = true;
            }
        }

    }
    
}