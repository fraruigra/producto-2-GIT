package grupofp.modelo;

import java.util.ArrayList;

public class Lista<L> {

    protected ArrayList<L> list;

    public Lista(){
        list = new ArrayList<>();
    }

    public boolean delete(L l){
        return list.remove(l);
    }
    public boolean add(L l){
        if(list.contains(l))
            return false;
        list.add(l);
        return true;
    }

    public ArrayList<L> getArrayList(){
        
        return new ArrayList<>(list);
    }

}    