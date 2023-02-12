package Pratice3;

import java.util.Scanner;

public class Pratice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int bolunen= scan.nextInt();
        int bolen= scan.nextInt();
        int sayac=0;
        while (bolunen>bolen)
        {
            bolunen-=bolen;
            sayac++;
        }
        System.out.println(sayac);
    }
}
