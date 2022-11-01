package grupofp.modelo;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;


// LISTO

public class Pedidos {
    // Atributos
    private int numPedido, cantidadArticulo;
    private Clientes clientes;
    private Articulos articulos;
    private LocalDateTime fechaYHora;
    // Fin atributos
   

    // Constructor
    public Pedidos(int numPedido, int cantidadArticulo, Articulos articulos, Clientes clientes, LocalDateTime fechaYHora) {
        this.numPedido = numPedido;
        this.cantidadArticulo = cantidadArticulo;
        this.clientes = clientes;
        this.fechaYHora = fechaYHora;
    }
    // Fin constructor

//getters y setters
    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }
    public int getCantidadArticulo() {
        return cantidadArticulo;
    }

    public void setCantidadArticulo(int cantidadArticulo) {
        this.cantidadArticulo = cantidadArticulo;
    }
    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }
    public Articulos getArticulos() {
        return articulos;
    }

    public void setArticulos(Articulos articulos) {
        this.articulos = articulos;
    }
    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public boolean pedidoEnviado(){
        long minutos = ChronoUnit.MINUTES.between(this.getFechaYHora(), LocalDateTime.now());
        return(articulos.getTiempoPreparacion() <= minutos);
    }

    public double precioEnvio(){
        Double descuentoEnvio = articulos.getGastosEnvio() * clientes.descuentoEnvio() / 100;
        Double gastosEnvio = articulos.getGastosEnvio() - descuentoEnvio;
        Double precioTotal = articulos.getPrecioVenta() * this.cantidadArticulo + gastosEnvio;

        return precioTotal;
    }
    @Override
    public String toString() {
        return "Pedidos [numPedido=" + numPedido + ", cantidadArticulo=" + cantidadArticulo + ", clientes=" + clientes
                + ", articulos=" + articulos + ", fechaYHora=" + fechaYHora + "]";
    }
    
    

}