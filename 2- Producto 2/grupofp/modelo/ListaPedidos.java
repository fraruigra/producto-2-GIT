package grupofp.modelo;


public class ListaPedidos extends Lista<Pedidos> {
    public Pedidos getPedidoCodigo(int numPedido){
        for(Pedidos pedido : this.getArrayList()){
            if(pedido.getNumPedido() == numPedido){
                return pedido;
            }
        }return null;
    }
}