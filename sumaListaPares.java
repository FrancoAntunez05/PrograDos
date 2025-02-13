import java.util.ArrayList;

public class sumaListaPares {
    public static int sumaListaParesIterativo(ArrayList<Integer> lista) {
        int ret = 0;
        for (Integer n : lista) {
            if (n % 2 == 0)
                ret += n;
        }
        return (ret);
    }
}
