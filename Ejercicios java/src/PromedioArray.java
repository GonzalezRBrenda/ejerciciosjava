import java.util.Scanner;

public class PromedioArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números en el arreglo: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("La cantidad de números en el arreglo debe ser mayor que cero.");
            scanner.close();
            return;
        }

        double[] arreglo = new double[n];

        // Leer los números y almacenarlos en el arreglo
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            arreglo[i] = scanner.nextDouble();
        }

        // Calcular la suma de los números en el arreglo
        double suma = 0;
        for (int i = 0; i < n; i++) {
            suma += arreglo[i];
        }

        // Calcular el promedio
        double promedio = suma / n;

        System.out.println("El promedio de los números en el arreglo es: " + promedio);

        scanner.close();
    }
}

