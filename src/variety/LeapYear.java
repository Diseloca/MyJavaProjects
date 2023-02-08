package variety;

import java.util.ArrayList;
import java.util.Scanner;

public class LeapYear {

    private static final int MIN = 1582;
    private static final int MAX = 100000;
    public static ArrayList<Integer> leapYearL = new ArrayList<>();


    private static void checkYear(int y) {

        if (y < MIN || y > MAX) throw new Error("Invalid year [1582-100000]");
    }

    private static void isLeapYear(int y) {

        if (y % 4 == 0 && (y % 100 != 0 || y % 400 == 0))
            leapYearL.add(y);
    }

    private static void readInput() {

        int year;
        String line;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Add year [YYYY] or proceed [enter]: ");
            line = sc.nextLine();

            if (line.isBlank()) break;
            else {
                year = Integer.parseInt(line);
                checkYear(year);
                isLeapYear(year);
            }
        }

        sc.close();
    }


    public static void main(String[] args) {

        readInput();

        if (leapYearL.isEmpty())
            System.out.println("No leap-years detected");
        else
            System.out.println("Leap-years: "+leapYearL);
    }
}
