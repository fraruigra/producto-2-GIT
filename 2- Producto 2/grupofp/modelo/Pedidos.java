package grupofp.modelo;

import java.util.Date;
import java.util.ArrayList;

public class Pedidos {
    private int numPedido, cantidadArticulo;
    private Clientes clientes;
    private Date fechaYHora;
    ArrayList<Articulos> articulos;
    private Float precioPedido;

    public Pedidos(int numPedido, int cantidadArticulo, Clientes clientes, Date fechaYHora, Float precioPedido) {
        this.numPedido = numPedido;
        this.cantidadArticulo = cantidadArticulo;
        this.clientes = clientes;
        this.fechaYHora = fechaYHora;
        this.precioPedido = precioPedido;
    }

    @Override
    public String toString() {
        return "{" +
                " numPedido='" + getNumPedido() + "'" +
                ", numArticulos='" + getNumArticulos() + "'" +
                ", clientes='" + getClientes() + "'" +
                ", fechaYHora='" + getFechaYHora() + "'" +
                ", precioPedido='" + getPrecioPedido() + "'" +
                "}";
    }

    private String getNumArticulos() {
        return null;
    }

    public int getNumPedido() {
        return this.numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public int getCantidadArticulos() {
        return this.cantidadArticulo;
    }

    public void setCantidadArticulos(int cantidadArticulo) {
        this.cantidadArticulo = cantidadArticulo;
    }

    public Clientes getClientes() {
        return this.clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public Date getFechaYHora() {
        return this.fechaYHora;
    }

    public void setFechaYHora(Date fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public Float getPrecioPedido() {
        return this.precioPedido;
    }

    public void setPrecioPedido(Float precioPedido) {
        this.precioPedido = precioPedido;
    }
}
