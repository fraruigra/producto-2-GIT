public class Clientes {
    // Atributos
    private String nombre, domicilio, nif, email;
    private boolean clienteEstandar, clienteVIP;
    // Fin atributos

    // Constructores
    public Clientes(String nombre, String domicilio, String nif, String email, boolean clienteEstandar,
            boolean clienteVIP) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.nif = nif;
        this.email = email;
        this.clienteEstandar = clienteEstandar;
        this.clienteVIP = clienteVIP;
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
                ", clienteEstandar='" + isClienteEstandar() + "'" +
                ", clienteVIP='" + isClienteVIP() + "'" +
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

    public boolean isClienteEstandar() {
        return this.clienteEstandar;
    }

    public boolean getClienteEstandar() {
        return this.clienteEstandar;
    }

    public void setClienteEstandar(boolean clienteEstandar) {
        this.clienteEstandar = clienteEstandar;
    }

    public boolean isClienteVIP() {
        return this.clienteVIP;
    }

    public boolean getClienteVIP() {
        return this.clienteVIP;
    }

    public void setClienteVIP(boolean clienteVIP) {
        this.clienteVIP = clienteVIP;
    }
    // Fin Getters and Setters

}
