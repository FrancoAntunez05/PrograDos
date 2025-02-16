public class AproximarPi {
    public static double aproximarPiIterativo (long pasos) {
        double x;
        double y;
        int cont = 0;
        for (int i = 0; i < pasos; i++) {
            x = Math.random();
            y = Math.random();
            if (Math.sqrt(Math.pow(x,2) + Math.pow(y,2)) < 1) {
                cont++;
            }
        }
        return (4*(cont/(double)pasos));
    }
}
