package grupofp.vista;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.*;

public class GestionOS {
    private Controlador controlador;
    Scanner teclado = new Scanner(System.in);

    public GestionOS() {
        controlador = new Controlador();
    }

    public static boolean inicio() {
        boolean salir = false;
        char opcio;
        do {
            System.out.println("1. Gestión Articulos");
            System.out.println("2. Gestión Clientes");
            System.out.println("3. Gestión Pedidos");
            System.out.println("0. Salir");
            opcio = pedirOpcion();
            switch (opcio) {
                case '1':
                    Gestion_Articulos();
                    break;
                case '2':
                    Gestion_Cleintes();
                    break;
                case '3':
                    Gestion_Pedidos();
                    break;
                case '0':
                    salir = true;
            }
        } while (!salir);
    }

char pedirOpcion() {
String resp;
System.out.println("Elige una opción (1,2,3 o 0):
");
resp = teclado.nextLine();
if (resp.isEmpty()) {
resp = " ";
}
return resp.charAt(0);
}

}

void Gestion_Articulos(){
    Scanner sn = new Scanner(system.in); 
    boolean salir = false; 
    int option;
    
    while (!salir){
        System.out.println("1. Anadir Articulo");
        System.out.println("2. Mostrar Articulo");
        try {
            switch ( option) {
                case 1:
                    Anadir_Articulo();
                    break;
                case 2:
                    Mostrar_Articulo(); 
                    break;}
        }

}

void Gestion_Clientes(){
    Scanner sn = new Scanner(system.in); 
    boolean salir = false; 
    int option;
    
    while (!salir){
        System.out.println("1. Anadir Clientes");
        System.out.println("2. Mostrar Clientes");
        System.out.println("3. Mostrar Clientes Estandar");
        System.out.println("4. Mostrar Clientes Premium");

        try {
            switch ( option) {
               case 1:
                    Anadir_Cliente();
                    break;
                case 2:
                    Mostrar_Clientes(); 
                    break;
                case 3:
                    Mostrar_Cliente_Estandar(); 
                    break;
                 case 4:
                    Mostrar_Cliente_VIP(); 
                    break;}
        }

}

void Gestion_Pedidos(){
    Scanner sn = new Scanner(system.in); 
    boolean salir = false; 
    int option;
    
    while (!salir){
        System.out.println("1. Anadir pedidos");
        System.out.println("2. Mostrar pedidos");
        System.out.println("3. Mostrar pedidos pendientes de envio");
        System.out.println("4. Mostrar pedidos enviados");
        try {
            switch ( option) {
                case 1:
                    Anadir_Pedido();
                    break;
                case 2:
                    Mostrar_Pedido(); 
                    break;
                case 3:
                    Mostrar_Pedido_Pediente(); 
                    break;
                 case 4:
                    Mostrar_Pedido_Enviado(); 
                    break;}
        }

}
    
/*void Anadir_Articulo(){
    Scanner input = new Scanner(System.in); 
    Articulos articulo = new Articulos(); 
    //introducimos articulo desde consola, no sé si realmente es así comprobar como se hizo con Woodshops porque lo he hecho de memoria. 
    System.out.println("Introducir codigo:");
    codigo = input.nextLine();
    articulo.setCodigo(codigo);
    System.out.println("Introducir descripcion:");
    descripcion = input.nextLine();
    articulo.setDescripcion(descripcion);
    System.out.println("Introducir precio de venta:");
    precioventa = input.nextLine();
    articulo.setPrecioVenta(precioventa);
    System.out.println("Introducir gastos de envio:");
    gastosenvio = input.nextLine();
    articulo.setGastosEnvio(gastosenvio);
    System.out.println("Introducir tiempo de preparacion:");
    tiempo = input.nextLine();
    articulo.setTiempoPreparacion(tiempo);
    
    //añadimos a la coleccion de articulos 
    articulos.add(articulo)
    //comprobamos que se ha creado y lo imprime? comprobar si realmente lo imprime... 
    System.out.println(articulo); 
    
}
void Mostrar_Articulo(){
}
void Anadir_Cliente(){
    
    Scanner input = new Scanner(System.in); 
    Clientes cliente = new Clientes(); 
    
    //introducimos articulo desde consola, no sé si realmente es así comprobar como se hizo con Woodshops porque lo he hecho de memoria. 
    System.out.println("Introducir Nombre:");
    nombre = input.nextLine();
    articulo.setNombre(nombre);
    System.out.println("Introducir domicilio:");
    domicilio  = input.nextLine();
    articulo.setDomicilio(domicilio);
    System.out.println("Introducir NIF:");
    nif = input.nextLine();
    articulo.setNif(nif);
    System.out.println("Introducir email:");
    email = input.nextLine();
    articulo.setEmail(email);
    System.out.println("Es cliente premium?");
    vip = input.nextLine();
    //se tiene que mirar esto porque es boolean y no se si se tiene que introducir de esta manera!!! 
    articulo.setVIP(vip);
    
    //añadimos a la coleccion de articulos 
    Clientes.add(cliente)
    //comprobamos que se ha creado y lo imprime? comprobar si realmente lo imprime... 
    System.out.println(cliente);
}
void Mostrar Cliente(){
}
void Mostrar_Cliente_Estandar(){
}
void Mostrar_Cliente_VIP(){
}
void Anadir_Pedido(){}
void Mostrar_Pedido(){}
void Mostrar_Pedido_Pendiente(){}
void Mostrar_Pedido_Enviado(){}*/
