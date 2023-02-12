package Pratice8;

import java.util.ArrayList;
import java.util.Scanner;

public class Örn2 {
    public static void main(String[] args) {
        /*
        1-1-2-3-5-8-13-21-34
         */
        int sayac2 =0;
        Scanner scan=new Scanner(System.in);
        int sayi= scan.nextInt();
        int a=1;
        int b=1;
        int c;

        for (int i = 1; i <10 ; i++) {

            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}


         /*

          */