package grupofp.modelo;

import java.time.LocalDateTime;

// LISTO

public class Articulos {
    // Atributos
    private String codigo;
    private String descripcion;
    private Double precioVenta, gastosEnvio;
    private LocalDateTime tiempoPreparacion;
    // Fin atributos

    // Inicio constructores
    public Articulos(String codigo, String descripcion, Double precioVenta, Double gastosEnvio, LocalDateTime tiempoPreparacion) {
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

    public Double getPrecioVenta() {
        return this.precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Double getGastosEnvio() {
        return this.gastosEnvio;
    }

    public void setGastosEnvio(Double gastosEnvio) {
        this.gastosEnvio = gastosEnvio;
    }

    public LocalDateTime getTiempoPreparacion() {
        return this.tiempoPreparacion;
    }

    public void setTiempoPreparacion(LocalDateTime tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }
    // Fin getters and setters

    
}
