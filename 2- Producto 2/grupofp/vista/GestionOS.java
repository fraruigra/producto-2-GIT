package grupofp.vista;

import java.util.Scanner;

import grupofp.modelo.ClienteEstandar;
import grupofp.modelo.ClientePremium;
import grupofp.modelo.Datos;
import grupofp.modelo.Lista;
import grupofp.modelo.ListaArticulos;
import grupofp.modelo.ListaClientes;
import grupofp.modelo.ListaPedidos;



public class GestionOS {
       Datos datos = new Datos();
       Lista lista = new Lista(); 

    public boolean inicio(boolean salir) {
        Scanner sn = new Scanner(System.in);
        int opcion;
        while(!salir){
            System.out.println("1. Gestión Articulos");
            System.out.println("2. Gestión Clientes");
            System.out.println("3. Gestión Pedidos");
            System.out.println("0. Salir");
            opcion = sn.nextInt();
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
        } return(salir);
    }



public boolean Gestion_Articulos(boolean salir){
    Scanner sn = new Scanner(System.in);  
    int option;
    
    while (!salir){
        System.out.println("1. Anadir Articulo");
        System.out.println("2. Mostrar Articulo");
        System.out.println("0. Volver");

        switch ( option) {
            case 1:
                datos.setListaArticulos(lista);
                break;
            case 2:
                System.out.println(ListaArticulos.toString());
                break;
            case 0:
                salir=true;
        }
    }
    return(salir);       
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
                datos.setListaClientes(lista);;
                break;
            case 2:
                System.out.println(ListaClientes.toString()); 
                break;
            case 3:
                System.out.println(ClienteEstandar.toString()); 
                break;
            case 4:
                System.out.println(ClientePremium.toString());
                break;}
            case 0:
                salir=true;
        }
        return(salir);
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
                for(ListaPedidos listaPedidos : listaPedidos){
                    if(!listaArticulos.articulo.getEnviado()){
                        listaPedidos.pedidos.tostring();
                    }
                }
                    break;
                case 4:
                    for(ListaPedidos listaPedidos : listaPedidos){
                        if(listaArticulos.articulo.getEnviado()){
                            listaPedidos.pedidos.tostring();
                    }
                }                  
                    break;
                case 0:
                    salir=true;
                }
        }

}}
    
