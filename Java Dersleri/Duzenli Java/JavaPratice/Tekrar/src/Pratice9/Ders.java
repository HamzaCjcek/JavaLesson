package Pratice9;

import java.util.Scanner;

public class Ders {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String birim= scan.nextLine();
        double miktar= scan.nextDouble();

        donusturucu(birim,miktar);
    }

    private static void donusturucu(String birim, double miktar) {
        switch (birim)
        {
            case "saat":
                System.out.println("Dakika :" +miktar*60);
                break;
            case "mil":
                System.out.println("Kilometre :" +miktar*1.6);
                break;
            case "kilogram":
                System.out.println("Gram :" +miktar*1000);
                break;
        }
    }
}
