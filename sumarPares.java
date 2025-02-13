public class sumarPares {
    public static int sumarParesIterativo (int n) {
        int m = 2;
        for (int i = n + 1; i <= n; i++) {
            if (i % 2 == 0)
                m += i;
        }
        return (m);
    }   
}
