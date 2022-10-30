package grupofp.modelo;

//CASI LISTO

public class ClientePremium extends Clientes {
    public ClientePremium(String nombre, String domicilio, String nif, String email, Boolean VIP) {
        super(nombre, domicilio, nif, email, VIP);
        VIP = true;
    }
}
