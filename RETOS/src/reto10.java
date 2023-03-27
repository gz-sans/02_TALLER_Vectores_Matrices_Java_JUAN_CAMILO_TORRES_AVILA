import java.util.Random;
import java.util.Scanner;

public class reto10 {
    public static void main(String[] args) {
        String[] palabras = {"manzana", "naranja", "limón", "fresa", "uva", "piña", "manzana", "naranja", "limón", "fresa", "uva", "piña"};

        // Mezclar las palabras
        Random rand = new Random();
        for (int i = 0; i < palabras.length; i++) {
            int randomIndexToSwap = rand.nextInt(palabras.length);
            String temp = palabras[randomIndexToSwap];
            palabras[randomIndexToSwap] = palabras[i];
            palabras[i] = temp;
        }

        // Crear la matriz del juego
        String[][] juego = new String[3][4];
        int contador = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                juego[i][j] = palabras[contador];
                contador++;
            }
        }

        Scanner input = new Scanner(System.in);
        int aciertos = 0;

        while (aciertos < 6) {
            // Imprimir la matriz del juego
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    if (juego[i][j].equals("X")) {
                        System.out.print("X ");
                    } else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }

            // Pedir al usuario que adivine la posición de las cartas
            System.out.println("Ingresa las coordenadas de las dos cartas que quieres voltear (por ejemplo, 1 2 2 3): ");
            int fila1 = input.nextInt() - 1;
            int columna1 = input.nextInt() - 1;
            int fila2 = input.nextInt() - 1;
            int columna2 = input.nextInt() - 1;

            // Voltear las cartas seleccionadas
            if (juego[fila1][columna1].equals(juego[fila2][columna2])) {
                juego[fila1][columna1] = "X";
                juego[fila2][columna2] = "X";
                aciertos++;
            } else {
                System.out.println("Lo siento, las cartas no son iguales.");
            }
        }

        System.out.println("¡Felicidades! Has encontrado todas las cartas.");
    }
}