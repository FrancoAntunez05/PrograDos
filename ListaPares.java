import java.util.ArrayList;

public class ListaPares {
    public static ArrayList<Integer> ListaParesIterativo (ArrayList<Integer> lista) {
        ArrayList<Integer> ret = new ArrayList<>();
        for (Integer n : lista) {
            if (n >= 2 && n % 2 == 0) {
                ret.add(n);
            }
        }
        return (ret);
    }
}
