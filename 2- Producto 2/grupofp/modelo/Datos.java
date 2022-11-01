package grupofp.modelo;

import java.util.List;

public class Datos {
    private ListaClientes clientes;
    private ListaArticulos articulos;
    private ListaPedidos pedidos; 


    public Datos(){
        this.articulos = new ListaArticulos();
        this.clientes = new ListaClientes();
        this.pedidos = new ListaPedidos();
    }

    public List<Articulos> getArticulos(){
        return articulos.getArrayList();
    }
    public List<Clientes> getClientes(){
        return clientes.getArrayList();
    }
    public List<Pedidos> getPedidos(){
        return pedidos.getArrayList();
    }


    public Articulos getArticulosCodigo(String codigo){
        return articulos.getArticulosCodigo(codigo);
    }
    public boolean anadirArticulo(Articulos articulo){
        return articulo.add(articulo);
    }
    public List<Clientes> getClientes(String tipoCliente) {
        return clientes.getClientes(tipoCliente);
    }

    public Clientes getClienteNif(String nif) {
        return clientes.getClienteNif(nif);
    }

    public boolean addCliente(Clientes cliente) {
        return clientes.add(cliente);
    }

  
}




