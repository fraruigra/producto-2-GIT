package grupofp.modelo;


public class ListaArticulos extends Lista<Articulos> {
    
    public Articulos getArticulosCodigo(String codigo){
        for(Articulos articulo : this.getArrayList()){
            if(articulo.getCodigo().equals(codigo)){
                return articulo;
            }
        }return null;
    }
}