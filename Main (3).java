import java.util.Scanner;

public class Main {
    public static void main (String[] argv) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de pasos para aproximar Pi: ");
        long pasos = sc.nextLong();
        System.out.print("La aproximación del número Pi es: " + AproximarPi.aproximarPiIterativo(pasos));
    }
}
