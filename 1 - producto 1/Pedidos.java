import java.util.Date;

public class Pedidos {
    // Atributos
    private int numPedido, numArticulos;
    private Clientes clientes;
    private Date fechaYHora;
    private Float precioPedido;
    // Fin atributos

    // Constructor
    public Pedidos(int numPedido, int numArticulos, Clientes clientes, Date fechaYHora, Float precioPedido) {
        this.numPedido = numPedido;
        this.numArticulos = numArticulos;
        this.clientes = clientes;
        this.fechaYHora = fechaYHora;
        this.precioPedido = precioPedido;
    }
    // Fin constructor

    // toString
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
    // Fin toString

    // Getters and Setters
    public int getNumPedido() {
        return this.numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public int getNumArticulos() {
        return this.numArticulos;
    }

    public void setNumArticulos(int numArticulos) {
        this.numArticulos = numArticulos;
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
    // Fin Getters and Setter
}
