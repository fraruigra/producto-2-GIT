package grupofp.vista;
import java.util.Scanner;
import java.util.InputMismatchException;


public class GestionOS {
    private Controlador controlador;
    Scanner teclado = new Scanner(System.in);

    public GestionOS() {
        controlador = new Controlador();
    }

    public void inicio() {
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
    
void Anadir_Articulo(){
}
void Mostrar_Articulo(){
}
void Anadir_Cliente(){
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
void Mostrar_Pedido_Enviado(){}
         
