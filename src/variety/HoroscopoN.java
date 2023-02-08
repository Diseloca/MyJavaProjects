package variety;

import java.util.Scanner;

public class HoroscopoN {

    private static void validdate(int dia, int mes) {

        if (dia < 1 || dia > 31) throw new Error("Dia "+dia+" invalido");
        if (mes < 1 || mes > 12) throw new Error("Mes "+mes+" invalido");

        /* Meses de 30 dias */
        if ((mes == 4 || mes == 6 || mes == 9 ||mes == 11) && dia > 30)
            throw new Error("El "+mes+" no tiene "+dia+" dias");

        /* Febrero */
        if (mes == 2 && dia > 29) throw new Error("Febrero no tiene mas de 29 dias");

    }



    public static void main(String[] args) {

        int dia;
        int mes;
        String sign;
        Scanner sc = new Scanner(System.in);


        System.out.print("Introduce tu dia de nacimineto [1-31]: ");
        dia = sc.nextInt();
        System.out.print("Introduce tu mes de nacimineto [1-12]: ");
        mes = sc.nextInt();
        sc.close();

        validdate(dia, mes);

        if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19))
            sign = "acuario";
        else if (mes == 2 || (mes == 3 && dia <=20))
            sign = "piscics";
        else if (mes == 3 || (mes == 4 && dia <= 20))
            sign = "aries";
        else if (mes == 4 || (mes == 5 && dia <= 20))
            sign = "tauro";
        else if (mes == 5 || (mes == 6 && dia <= 21))
            sign = "geminis";
        else if (mes == 6 || (mes == 7 && dia <= 22))
            sign = "cancer";
        else if (mes == 7 || (mes == 8 && dia <= 23))
            sign = "leo";
        else if (mes == 8 || (mes == 9 && dia <= 22))
            sign = "virgo";
        else if (mes == 9 || (mes == 10 && dia <= 22))
            sign = "libra";
        else if (mes == 10 || (mes == 11 && dia <= 22))
            sign = "escorpio";
        else if (mes == 11 || (mes == 12 && dia <= 21))
            sign = "sagitario";
        else
            sign = "capricornio";

        System.out.println("Tu signo es: "+sign);
    }

}
