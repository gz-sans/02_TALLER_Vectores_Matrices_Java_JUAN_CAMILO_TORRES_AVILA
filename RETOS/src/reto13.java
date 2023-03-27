import java.util.Scanner;

public class reto8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de números que deseas ingresar: ");
        int cantidadNumeros = sc.nextInt();

        int[] numeros = new int[cantidadNumeros];

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < cantidadNumeros; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + " es múltiplo de 2");
            }
        }
    }
}
