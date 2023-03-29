package pruebas;

public class Factorial {

    public static int calcular(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcular(n - 1);
        }
    }

}
