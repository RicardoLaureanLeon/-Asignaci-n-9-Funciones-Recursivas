
import java.util.Arrays;

public class PruebaRecursividad {

    public static void main(String[] args) {

        // 1. Fibonacci de 5
        System.out.println("Fibonacci de 5: "
                + Recursividad.fibonacci(5));

        // 2. Fibonacci de 40
        System.out.println("Fibonacci de 40: "
                + Recursividad.fibonacci(40));

        // 3. MCD de 45 y 75
        System.out.println("MCD de 45 y 75: "
                + Recursividad.mcd(45, 75));

        // 4. MCD de 47 y 91
        System.out.println("MCD de 47 y 91: "
                + Recursividad.mcd(47, 91));

        // 5. Ocurrencias del numero 3
        Object[] numeros = {1, 2, 3, 3, 2, 3, 1};

        System.out.println("Ocurrencias del 3: "
                + Recursividad.count(numeros, numeros.length, 3));

        // 6. Ocurrencias del numero 1
        System.out.println("Ocurrencias del 1: "
                + Recursividad.count(numeros, numeros.length, 1));

        // 7. Ocurrencias de la letra C
        Object[] letras = {'A', 'B', 'C', 'B', 'A', 'B', 'D'};

        System.out.println("Ocurrencias de C: "
                + Recursividad.count(letras, letras.length, 'C'));

        // 8. Ocurrencias de la letra E
        System.out.println("Ocurrencias de E: "
                + Recursividad.count(letras, letras.length, 'E'));

        // 9. Invertir arreglo de numeros
        Object[] arregloNumeros = {1, 2, 3, 4, 5};

        Recursividad.reverse(arregloNumeros, 0,
                arregloNumeros.length - 1);

        System.out.println("Arreglo de numeros invertido: "
                + Arrays.toString(arregloNumeros));

        // 10. Invertir arreglo de letras
        Object[] arregloLetras = {'A', 'B', 'C', 'D'};

        Recursividad.reverse(arregloLetras, 0,
                arregloLetras.length - 1);

        System.out.println("Arreglo de letras invertido: "
                + Arrays.toString(arregloLetras));
    }
}
