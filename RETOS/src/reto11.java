import java.util.Scanner;

public class reto11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[][] productos = new String[16][2];

    // Llenar la máquina con 16 nombres de productos y su respectivo precio
    for (int i = 0; i < productos.length; i++) {
      System.out.print("Ingrese el nombre del producto " + (i+1) + ": ");
      productos[i][0] = sc.nextLine();
      System.out.print("Ingrese el precio del producto " + (i+1) + ": ");
      productos[i][1] = sc.nextLine();
    }

    // Mostrar el catálogo de productos
    System.out.println("Catálogo de productos:");
    System.out.println("Código\tNombre\t\tPrecio");
    for (int i = 0; i < productos.length; i++) {
      System.out.println((i+1) + "\t" + productos[i][0] + "\t\t$" + productos[i][1]);
    }
  }
}
