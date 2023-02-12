package Pratice4;

import java.util.Scanner;
import java.util.SortedMap;

public class Pratic {
    public static void main(String[] args) {
        // 0-100 arası 13'e tam bölünebilen sayilar yazdirin
        for (int i = 100; i >=13 ; i--) {
            if (i%13==0)
            {
                System.out.print(" 13'e tam bölünen sayilar :"+i);
            }
        }
        System.out.println("------------------");
        // 0-255 arası sayıların sayi ve harf değelerini konsole yazdirin
        for (int i = 255; i >0 ; i--) {
            System.out.println((char) i);
        }
        System.out.println("-------------------");
        // Girilen bir stringte girilen a sayisini bulun döngü c ye gelinceye kadar çalışsın
        Scanner scan=new Scanner(System.in);
        String str= scan.nextLine();
        int sayac=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)=='c' || str.charAt(i)=='C')
            {
                break;
            } else if (str.charAt(i)=='a' || str.charAt(i)=='A') {
                sayac++;
            }
        }
        System.out.println(sayac);
        System.out.println("----------------");
        // İnput=6
        // Output 1+2+3=6

        int toplam=0;
        int sayi= scan.nextInt();
        for(int i = 1; i < sayi; i++)
        {
            if(sayi % i == 0) {
                toplam += i;
            }
        }
        if(sayi == toplam) {
            System.out.println(sayi + " Mükemmel bir sayidir");
        }
        else {
            System.out.println(sayi + " Mükemmel bir sayi degildir.");
        }


    }
}
