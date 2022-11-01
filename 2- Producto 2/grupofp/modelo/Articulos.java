package grupofp.modelo;

// LISTO

public class Articulos {
    // Atributos
    private int codigo;
    private String descripcion;
    private Float precioVenta, gastosEnvio;
    private int tiempoPreparacion;
    // Fin atributos

    // Inicio constructores
    public Articulos(int codigo, String descripcion, Float precioVenta, Float gastosEnvio, int tiempoPreparacion) {
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
    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
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

    public int getTiempoPreparacion() {
        return this.tiempoPreparacion;
    }

    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }
    // Fin getters and setters
}
