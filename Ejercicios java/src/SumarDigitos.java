import java.util.Scanner;

public class SumarDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        long numero = scanner.nextLong();

        // Tomamos el valor absoluto del número para lidiar con números negativos
        numero = Math.abs(numero);

        int suma = 0;

        while (numero > 0) {
            int digito = (int) (numero % 10); // Obtenemos el último dígito
            suma += digito; // Sumamos el dígito a la suma
            numero = numero / 10; // Quitamos el último dígito
        }

        System.out.println("La suma de los dígitos es: " + suma);

        scanner.close();
    }
}
