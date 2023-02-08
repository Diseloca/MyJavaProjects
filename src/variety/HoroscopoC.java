package variety;

import java.util.Scanner;

public class HoroscopoC {

    public static void main(String[] args) {

        int year;
        String sign = "";
        Scanner sc = new Scanner(System.in);


        System.out.print("Introduce tu año de nacimiento en formato YYYY: ");
        year = Integer.parseInt(sc.nextLine());
        sc.close();

        switch (year % 12) {
            case 0 -> sign = "mono";
            case 1 -> sign = "gallo";
            case 2 -> sign = "perro";
            case 3 -> sign = "cerdo";
            case 4 -> sign = "rata";
            case 5 -> sign = "buey";
            case 6 -> sign = "tigre";
            case 7 -> sign = "conejo";
            case 8 -> sign = "dragon";
            case 9 -> sign = "serpiente";
            case 10 -> sign = "caballo";
            case 11 -> sign = "cabra";
            default -> System.out.println("Error...");
        }

        System.out.println("Eres: "+sign);
    }

}
