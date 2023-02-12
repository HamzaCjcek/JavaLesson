package Tekrar;

import java.util.Scanner;

public class Tekrar1 {
    public static void main(String[] args) {
        String isim="Hamza \n \t  Çiçek \\ 1082";
        System.out.print(isim);
        //Kullanıcıdan bir sayi alınız
        // Sayi 0'dan büyük eşit ise 10'dan kucuk olup olmadığını kontrol ediniz
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz değilse "Pozitif Sayi" yazdiriniz
        //Sayi 0 dan kucuk ise ekrana "Negatif Sayi" Yazdiriniz

        Scanner scan=new Scanner(System.in);
        int sayi= scan.nextInt();
        if (sayi>=0 && sayi<10)
        {
            System.out.println("Rakam");
        } else if (sayi<0) {
            System.out.println("Negatif Sayi");
        }
        else
        {
            System.out.println("Pozitif Sayi");
        }
        String result=(sayi>=0) ? (sayi<10) ? "Rakam" : "Pozitif Sayi" :("Negatif Sayi");
        System.out.println(result);
    }
}
