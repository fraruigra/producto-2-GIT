package grupofp.modelo;
import java.util.*;

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

        Scanner sc=new Scanner(System.in);
        System.out.print("Codigo de articulo: ");
        codigo=sc.nextLine();
        System.out.print("Descripcion de articulo: ");
        descripcion=sc.nextLine();
        System.out.print("Precio de venta de articulo: ");
        precioVenta=sc.nextFloat();
        System.out.print("Gasto de envio de articulo: ");
        gastoEnvio=sc.nextFloat();
        


    }

  
    }



}
