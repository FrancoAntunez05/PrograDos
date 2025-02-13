
public class Fibonacci {
    public static int enesimoTerminofibonacciIterativo (int n) {
        int e1 = 1;
        int e2 = 1;
        int e3;
        for (int i = 1; i < n ; i++) {
            e3 = e1 + e2;
            e1 = e2;
            e2 = e3;
        }
        return (e1);
    }

    public static boolean compararFibonacci () {
        return enesimoTerminofibonacciIterativo(13) == ((1 + Math.sqrt(5)) / 2);
    }

    public static void relacionFibonacciAurea () {
        float n;
        float m;
        float res;
        for (int i = 1; i < 20; i++) {
            n = enesimoTerminofibonacciIterativo(i);
            m = enesimoTerminofibonacciIterativo(i + 1);
            res = m/n;
            System.out.println(res);

        }
    }
}
