import java.util.Scanner;

public class reto12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaramos variables
        int cs = 0;

        //Pedimos datos
        System.out.println("¿Cuantos competidores participaran?");
        cs = sc.nextInt();

        //Declaramos arreglos
        String[] names = new String[cs];
        int[] times = new int[cs];

        //Pedimos nombres y tiempos.
        for(int i = 0; i < cs; i++){
            System.out.println("-----------------------------------------------------------------");
            //Nombres
            System.out.println("Ingrese el nombre del competidor " + (i + 1));
            names[i] = sc.next();
            //Tiempos
            System.out.println("Ingrese el tiempo de llegada del competidor " + (i + 1)+" (en segundos)");
            times[i] = sc.nextInt();
        }

        //Ordenamos los tiempos de llegada de menor a mayor
        for(int i = 0; i < cs - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < cs; j++){
                if(times[j] < times[minIndex]){
                    minIndex = j;
                }
            }
            //Intercambiamos los valores de tiempos y nombres en los índices i y minIndex
            int tempTime = times[i];
            times[i] = times[minIndex];
            times[minIndex] = tempTime;

            String tempName = names[i];
            names[i] = names[minIndex];
            names[minIndex] = tempName;
        }

        //Imprimimos nombres y tiempos en formato de minutos y segundos.
        System.out.println("<--RESULTADOS-->");
        for(int i = 0; i < cs; i++){
            //Calculamos los minutos y segundos del tiempo de llegada
            int minutes = times[i] / 60;
            int seconds = times[i] % 60;
            //Imprimimos a los competidores y sus tiempos de llegada en formato de minutos y segundos
            System.out.printf("%d. %s - Tiempo: %d:%02d%n", i+1, names[i], minutes, seconds);
        }

        sc.close();
    }
}
