package grupofp.modelo;

import java.util.Date;

public class Articulos {
    // Atributos
    private String codigo, descripcion;
    private Float precioVenta, gastosEnvio;
    private Date tiempoPreparacion;
    // Fin atributos

    // Inicio constructores
    public Articulos(String codigo, String descripcion, Float precioVenta, Float gastosEnvio, Date tiempoPreparacion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.gastosEnvio = gastosEnvio;
        this.tiempoPreparacion = tiempoPreparacion;
    }
    // Fin constructores

    // toString
    @Override
    public String toString() {
        return "{" +
                " codigo='" + getCodigo() + "'" +
                ", descripcion='" + getDescripcion() + "'" +
                ", precioVenta='" + getPrecioVenta() + "'" +
                ", gastosEnvio='" + getGastosEnvio() + "'" +
                ", tiempoPreparacion='" + getTiempoPreparacion() + "'" +
                "}";
    }
    // Fin toString

    // Getters and Setters
    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getPrecioVenta() {
        return this.precioVenta;
    }

    public void setPrecioVenta(Float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Float getGastosEnvio() {
        return this.gastosEnvio;
    }

    public void setGastosEnvio(Float gastosEnvio) {
        this.gastosEnvio = gastosEnvio;
    }

    public Date getTiempoPreparacion() {
        return this.tiempoPreparacion;
    }

    public void setTiempoPreparacion(Date tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }
    // Fin getters and setters
}
