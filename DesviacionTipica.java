import java.util.ArrayList;

public class DesviacionTipica {
    public static int calcularDesviacionTipica (ArrayList<Integer> lista) {
        int media = calcularMedia(lista);
        int suma = sumaMediaMenosCuadrado(lista, media);
        int division = suma/lista.size();
        return ((int)Math.sqrt(division));
    }

    public static int calcularMedia(ArrayList<Integer> lista) {
        int suma = 0;
        for (Integer entero : lista) {
            suma += entero;
        }
        return (suma/lista.size());
    }

    public static int sumaMediaMenosCuadrado(ArrayList<Integer> lista, int media) {
        ArrayList<Integer> restaCuadrado = new ArrayList<>();
        int res = 0;
        for (Integer entero : lista) {
            restaCuadrado.add((int)Math.pow(media - entero, 2));
        }
        for (Integer entero : restaCuadrado) {
            res += entero;
        }
        return (res);
    }
}
