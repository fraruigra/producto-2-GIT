package grupofp.modelo;
import java.text.DateFormat;
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
        listaClientes = new Lista();
        listaPedidos = new Lista();
    }

    public Lista<Articulos> getListaArticulos(){
        return listaArticulos;
    }
    public Lista<Clientes> getListaClientes(){
        return listaClientes;
    }
    public Lista<Pedidos> getListaPedidos(){
        return listaPedidos;
    }

    public void setListaArticulos(Lista<Articulos> listaArticulos){
        int codigo;
        String descripcion;
        float precioVenta;
        float gastoEnvio;
        int tiempoPreparacion;

        Scanner sc=new Scanner(System.in);
        System.out.print("Codigo de articulo: ");
        codigo=sc.nextInt();
        System.out.print("Descripcion de articulo: ");
        descripcion=sc.nextLine();
        System.out.print("Precio de venta de articulo: ");
        precioVenta=sc.nextFloat();
        System.out.print("Gasto de envio de articulo: ");
        gastoEnvio=sc.nextFloat();
        System.out.print("Tiempo de preparación en minutos:");
        tiempoPreparacion=sc.nextInt();
        

        Articulos articulo = new Articulos(codigo, descripcion, precioVenta, gastoEnvio, tiempoPreparacion);
        listaArticulos.addArticulos(articulo);


    }

    public void setListaClientes(Lista<Clientes> listaClientes){
        String nombre;
        String domicilio;
        String nif;
        String email; 
        int tipo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre de cliente: ");
        nombre=sc.nextLine();
        System.out.print("Dni de cliente: ");
        nif=sc.nextLine();
        System.out.print("Email del cliente: ");
        email=sc.nextLine();
        System.out.print("Domicilio del cliente: ");
        domicilio=sc.nextLine();
        System.out.println("Elige tipo de Cliente: ");
        System.out.println("1. Cliente Estandard: ");
        System.out.println("2. Cliente Premium: ");
            tipo = sc.nextInt();
        if(tipo==1){
            ClienteEstandar cliente = new ClienteEstandar(nombre,nif,email,domicilio);
            listaClientes.addClientes(cliente);
        }else if(tipo==2){
            ClientePremium cliente = new ClientePremium(nombre,nif,email,domicilio);
            listaClientes.addClientes(cliente);
        }
    }

    public void setListaPedidos(Lista<Pedidos> listaPedidos) {
        int numPedido;
        int codigoArticulo;
        int cantidadArticulo;
        String fechaString;
        String nif;
        Date fechaYHora;
        float precioPedido;

        Scanner sc=new Scanner(System.in);

        System.out.print("Numero de pedido: ");
        numPedido=sc.nextInt();
        System.out.print("Codigo de Articulo: ");
        codigoArticulo=sc.nextInt();
        System.out.print("Cantidad: ");
        cantidadArticulo=sc.nextInt();
        System.out.print("Fecha y hora de envio: ");
        fechaString = sc.next();
        //DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy 00:00");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy 00:00");
        Date fecha = sdf.parse(fechaString);
        System.out.print("Dni de cliente del pedido: ");
        nif=sc.nextLine();
        for(ListaClientes listaClientes : listaClientes){
            if(listaClientes.clientes.getNif()==nif){
                setListaClientes(listaClientes);
            }
        }
        precioPedido = ListaArticulos.getPrecioVenta();

        Pedidos pedido = new Pedidos(numPedido, cantidadArticulo, clientes, nif, fechaYHora, precioPedido);
        listaPedidos.addPedidos(pedido);
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




