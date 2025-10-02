import java.util.Scanner;

public class practica {

    // Método recursivo para factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Ingresa un número para calcular su factorial: ");
            int numero = sc.nextInt();

            long resultado = factorial(numero);
            System.out.println(numero + "! = " + resultado);

            System.out.print("¿Quieres ingresar otro número? (s/n): ");
            continuar = sc.next();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("¡Gracias por usar el programa!");
        sc.close();
    }
}