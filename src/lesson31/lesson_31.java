package lesson31;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class lesson_31 {
    static String contacts[][] = new String[10][2];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        int x;
        double y;
        char s = 's';
        boolean g = false;
        String k = "Nazar";
        LocalDate date = LocalDate.now();

        System.out.println("CURRENT DATE :" + date);
        System.out.print("X = ");
        x = input.nextInt();
        System.out.printf("X : " + x);

        int numbers[] = new int[x];


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(20);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "]= " + numbers[i]);
        }


    }

    public static void addContacts() {


    }

    public static void showContacts(){

    }
}
