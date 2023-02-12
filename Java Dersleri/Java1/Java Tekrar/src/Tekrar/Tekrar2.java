package Tekrar;

import java.util.Scanner;

public class Tekrar2 {
    public static void main(String[] args) {
       bol(1,2);
        for (int i = 100; i>0 ; i--) {
            if (i%13==0)
            {
                System.out.println(i);
            }
        }
        for (int i = 0; i <=255 ; i++) {
            System.out.println(i);
            System.out.println((char)i);
        }
        // Girilen bir stringdeki a harf sayısını bulunuz.ama c harfine gelirse döngüden çıkılsın
        Scanner scan=new Scanner(System.in);
        String cumle= scan.nextLine().toUpperCase();
        int sayac=0;
        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.charAt(i)=='A')
            {
                sayac++;
            }
        }
        System.out.println(sayac);
        // input : 6
        // Output :1,2,3  1+2+3= 6 =6 mükemmel sayı
        int sayi= scan.nextInt();
        int toplam2=0;

        for (int i = 1; i <=sayi ; i++) {
            if (sayi%i==0)
            {
                System.out.print(i+" ");
                toplam2+=i;
            }

        }

        System.out.println("= Toplam:"+toplam2);
    }
    private static void bol(int i, int i1) {
        int toplam=i+i1;
        System.out.println(toplam);
    }
}
