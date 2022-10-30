package grupofp.modelo;

// CASI LISTO

public class ClienteEstandar extends Clientes {

    public ClienteEstandar(String nombre, String domicilio, String nif, String email, Boolean VIP) {
        super(nombre, domicilio, nif, email, VIP);
        VIP = false;
    }

}