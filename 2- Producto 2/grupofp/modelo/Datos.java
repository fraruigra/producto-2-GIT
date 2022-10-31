package grupofp.modelo;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;


public class Datos {
    Lista<Articulos> listaArticulos;
    Lista<Clientes> listaClientes; 
    Lista<Pedidos> listaPedidos;

    

    public Datos(){
        listaArticulos = new Lista ();
        ListaClientes = new Lista();
        ListaPedidos = new Lista();
    }

    public Lista<Articulos> getListaArticulos(){
        return listaArticulos;
    }
    public Lista<Clientes> getListaClientes(){
        return listaClientes;
    }
    public Lista<Pedidos> getListaPedidos(){
        return ListaPedidos;
    }

    public void setListaArticulos(Lista<Articulos> listaArticulos){
        String codigo;
        String descripcion;
        float precioVenta;
        float gastoEnvio;
        Date tiempoPreparacion;
        String tiempoPreparacionString;

        Scanner sc=new Scanner(System.in);
        System.out.print("Codigo de articulo: ");
        codigo=sc.nextLine();
        System.out.print("Descripcion de articulo: ");
        descripcion=sc.nextLine();
        System.out.print("Precio de venta de articulo: ");
        precioVenta=sc.nextFloat();
        System.out.print("Gasto de envio de articulo: ");
        gastoEnvio=sc.nextFloat();
        System.out.print("Tiempo de preparación en minutos:");
        tiempoPreparacionString=sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("00:00");
        Date tiempoPreparacion = sdf.parse(tiempoPreparacionString);

        Articulos articulo = new Articulos(codigo, descripcion, null, null, tiempoPreparacion);
        listaArticulos.addArticulos(articulo);


    }

    public void setListaClientes(Lista<Clientes> listaClientes){
        String nombre;
        String domicilio;
        String nif;
        String email; 

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre de cliente: ");
        nombre=sc.nextLine();
        System.out.print("Dni de cliente: ");
        dni=sc.nextLine();
        System.out.print("Correo del cliente: ");
        correo=sc.nextLine();
        System.out.print("Gasto de envio de articulo: ");
        direccion=sc.nextLine();
        System.out.println("Elige tipo de Cliente: ");
        System.out.println("1. Cliente Estandard: ");
        System.out.println("2. Cliente Premium: ");
            tipo = sn.nextInt();
        if(tipo==1){
            ClienteEstandard cliente = new ClienteEstandar(nombre,dni,correo,direccion);
            listaClientes.addClientes(cliente);
        }else if(tipo==2){
            ClientePremium cliente = new ClientePremium(nombre,dni,correo,direccion);
            listaClientes.addClientes(cliente);
        }
    }

    public void setListaPedidos(Lista<Pedidos> listaPedidos) {
        int numPedido;
        int cantidad;
        Date fecha;
        String fechaString;
        String dni;

        Scanner sc=new Scanner(System.in);

        System.out.print("Numero de pedido: ");
        numPedido=sc.nextInt();
        System.out.print("Cantidad de pedidos: ");
        cantidad=sc.nextInt();
        System.out.print("Fecha y hora de envio: ");
        fechaString = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy 00:00");
        Date fecha = sdf.parse(fechaString);
        System.out.print("Dni de cliente del pedido: ");
        dni=sc.nextLine();
        for(ListaClientes listaClientes : listaClientes){
            if(listaClientes.clientes.getDni()==dni){
                setListaClientes(listaClientes);
            }
        }
        Pedidos pedido = new Pedidos(numPedido,cantidad,fecha,articulos,cliente);
        listaPedidos.addPedido(pedido);
    }

    public void eliminarPedido(Lista<Pedidos> listaPedidos){
        int numPedido;
        Scanner sc=new Scanner(System.in);
        System.out.print("Numero de pedido a eliminar: ");
        numPedido=sc.nextInt();
        for(ListaPedidos listaPedidos : listaPedidos){
            if(listaPedidos.pedidos.getNumPedido()==numPedido && !listaArticulos.articulo.getEnviado()){
                listaPedidos.pedidos.remove(pedidos);
            }else{
                System.out.print("Pedido no encontrado");
            }
        }
    }

  
}




