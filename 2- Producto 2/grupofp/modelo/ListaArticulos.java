package grupofp.modelo;

import java.util.ArrayList;

public class ListaArticulos extends Lista<Articulos> {
    ArrayList<Articulos> articulos;

    public ListaArticulos(Articulos articulo) {
        articulos = new ArrayList<>();
    }

    public ArrayList<Articulos> getArticulos() {
        return articulos;
    }

    @Override
    public ArrayList<Articulos> getLista() {
        return lista;
    }

    public void setArticulos(ArrayList<Articulos> articulos) {
        this.articulos = articulos;
    }

    public void addArticulo(Articulos articulo) {
        articulos.add(articulo);
    }

    @Override
    public void setLista(ArrayList<Articulos> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "ListaArticulos{" + "articulos=" + articulos + '}';
    }
}