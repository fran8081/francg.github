
import java.util.Random;
import java.util.Scanner;

public class BuscarNumeroEnVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Pedir al usuario el tamaño del vector
        System.out.print("Ingrese el tamaño del vector: ");
        int N = sc.nextInt();

        // Crear un vector de tamaño N y llenarlo con números aleatorios en un rango entre -100 y 100
        int[] vector = new int[N];
        for (int i = 0; i < N; i++) {
            vector[i] = rand.nextInt(201) - 100;
        }

        // Pedir al usuario el número a buscar
        System.out.print("Ingrese el número a buscar: ");
        int numeroBuscado = sc.nextInt();

        // Buscar el número en el vector y mostrar su posición
        boolean encontrado = false;
        int contador = 0;
        for (int i = 0; i < N; i++) {
            if (vector[i] == numeroBuscado) {
                System.out.println("El número " + numeroBuscado + " se encuentra en la posición " + i + " del vector.");
                encontrado = true;
                contador++;
            }
        }

        // Mostrar si el número no se encontró en el vector
        if (!encontrado) {
            System.out.println("El número " + numeroBuscado + " no se encuentra en el vector.");
        }

        // Mostrar el número de veces que se encontró el número buscado en el vector
        if (contador > 1) {
            System.out.println("El número " + numeroBuscado + " se encuentra repetido " + contador + " veces en el vector.");
        }
    }
}

