import java.util.ArrayList;
import java.util.List;

public class sumaLista {
    public static int sumaListaIterativo (ArrayList<Integer> lista) {
        int ret = 0;
        for (Integer n : lista) {
            ret += n;
        }
        return (ret);
    }
    
}
