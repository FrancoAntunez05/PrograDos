import java.util.ArrayList;

public class ProductoEscalarListas {
    public static ArrayList<Integer> ProductoEscalarListasIterativo (ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        if (lista1.size() != lista2.size())
            return (null);
        ArrayList<Integer> ret = new ArrayList<>();
        int n;
        for (int i = 0; i < lista1.size(); i++) {
            n = lista1.get(i) + lista2.get(i);
            ret.add(n);
        }        
        return (ret);
    }
}
