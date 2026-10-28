
public class Recursividad {

    // 1. Calcula el numero Fibonacci recursivamente
    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El numero debe ser positivo");
        }

        long[] memoria = new long[n + 1];
        return fibonacciAux(n, memoria);
    }

    private static long fibonacciAux(int n, long[] memoria) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        if (memoria[n] != 0) {
            return memoria[n];
        }

        memoria[n] = fibonacciAux(n - 1, memoria)
                   + fibonacciAux(n - 2, memoria);

        return memoria[n];
    }

    // 2. Calcula el maximo comun divisor recursivamente
    public static int mcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        if (b == 0) {
            return a;
        }

        return mcd(b, a % b);
    }

    // 3. Cuenta las ocurrencias de un elemento
    public static int count(Object datos[], int n, Object o) {
        if (n <= 0) {
            return 0;
        }

        if (java.util.Objects.equals(datos[n - 1], o)) {
            return 1 + count(datos, n - 1, o);
        }

        return count(datos, n - 1, o);
    }

    // 4. Invierte un arreglo recursivamente
    public static void reverse(Object datos[], int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }

        Object temporal = datos[inicio];
        datos[inicio] = datos[fin];
        datos[fin] = temporal;

        reverse(datos, inicio + 1, fin - 1);
    }
}
