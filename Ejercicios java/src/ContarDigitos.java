import java.util.Scanner;

public class ContarDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        long numero = scanner.nextLong();

        int contador = 0;

        // Tomamos el valor absoluto del número para lidiar con números negativos
        numero = Math.abs(numero);

        while (numero > 0) {
            numero = numero / 10; // Dividimos por 10 para quitar el último dígito
            contador++;
        }

        System.out.println("El número de dígitos en el número entero es: " + contador);

        scanner.close();
    }
}

