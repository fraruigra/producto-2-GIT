package grupofp.modelo;

//LISTO

public abstract class Clientes {
    // Atributos
    private String nombre, domicilio, nif, email;
    Boolean VIP;
    // Fin atributos

    // Constructores
    public Clientes(String nombre, String domicilio, String nif, String email, Boolean VIP) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.nif = nif;
        this.email = email;
        this.VIP = VIP;
    }
    // Fin constructores

    // toString
    @Override
    public String toString() {
        return "{" +
                " nombre='" + getNombre() + "'" +
                ", domicilio='" + getDomicilio() + "'" +
                ", nif='" + getNif() + "'" +
                ", email='" + getEmail() + "'" +
                ", VIP='" + isVIP() + "'" +
                "}";
    }
    // Fin toString

    // Getters and Setters
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

    public Boolean isVIP() {
        return this.VIP;
    }

    public Boolean getVIP() {
        return this.VIP;
    }

    public void setVIP(Boolean VIP) {
        this.VIP = VIP;
    }
    // Fin Getters and Setters
}
