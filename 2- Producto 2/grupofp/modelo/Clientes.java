package grupofp.modelo;

public abstract class Clientes {
    private String nombre, domicilio, nif, email;

    public Clientes(String nombre, String domicilio, String nif, String email) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.nif = nif;
        this.email = email;
    }

    @Override
    public String toString() {
        return "{" +
                " nombre='" + getNombre() + "'" +
                ", domicilio='" + getDomicilio() + "'" +
                ", nif='" + getNif() + "'" +
                ", email='" + getEmail() + "'" +
                "}";
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return this.domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNif() {
        return this.nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract String tipoCliente();

    public abstract float calcAnual();

    public abstract float descuentoEnv();

}
