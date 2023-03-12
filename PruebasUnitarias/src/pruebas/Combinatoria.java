package pruebas;

public class Combinatoria {
    public static int calcular(int n, int r) {
    if (r == 0 || r == n) {
        return 1;
    } else {
        return calcular(n - 1, r - 1) + calcular(n - 1, r);
    }
}
}
