package variety;

import java.util.Scanner;

public class PiramideCanicas {


    private static int sumaAnteriores(int i) {

        if (i <= 0) return 0;

        return i + sumaAnteriores(i-1);
    }


    public static void main(String[] args) {

        int total = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el numero de pisos deseados: ");
        int floors = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= floors; i++)
            total += sumaAnteriores(i);

        System.out.println("Total de canicas necesarias: "+total);
        sc.close();
    }

}
