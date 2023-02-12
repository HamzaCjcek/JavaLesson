package Pratice6;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Dizi4 {
    public static void main(String[] args) {
        /*
        Kullanıcının istediği büyüklükte diziye 0-100 arası rastgele sayılarla doldurup kaçının ortalamnın altında kaçının ortalamanın üzerinde oldugunu bulan metodu bulunuz
        Ve kaçının ortalamın altında kaçı ortalamanın üstünde olduğunu bulan metodu bulunuz
         */
        System.out.println("Array uzunluğunu giriniz :");
        Scanner scan=new Scanner(System.in);
        Random rnd=new Random();
        double ortalama=0;
        int toplam=0;
        int uzunluk= scan.nextInt();
        int[] dizi= new int[uzunluk];
        for (int i = 0; i <uzunluk ; i++) {
            dizi[i]= rnd.nextInt(100);
            toplam+=dizi[i];
        }
        ortalama=toplam/dizi.length;
        int alt=0,ust=0,esit=0;
        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i]<ortalama)
            {
                alt++;
            } else if (dizi[i]>ortalama) {
                ust++;
            }
            else {
                esit++;
            }
        }
        System.out.println("Ortalamın altında kalan sayi sayisi :" + alt + " Ortalamın üstünde kalan sayi sayisi :" + ust + " Ortalamın eşit kalan sayi sayisi :" + esit);
        System.out.println(Arrays.toString(dizi));
    }
}
