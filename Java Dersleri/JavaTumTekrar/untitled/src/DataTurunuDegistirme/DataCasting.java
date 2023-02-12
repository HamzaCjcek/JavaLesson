package DataTurunuDegistirme;

import java.util.Scanner;

public class DataCasting {

    public static void main(String[] args) {
        String knt="false";
        Boolean sonuc=Boolean.valueOf(knt);
        System.out.println(knt); // false

        //Soru 1- Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod
        //yazin
        int sayi=10;
        int sayi2=20;
        int sayi3=30;
        double ortalama=(sayi+sayi2+sayi3)/3; //20.0
        System.out.println(ortalama);
        //Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.
        Scanner scan=new Scanner(System.in);
        String x= scan.nextLine();
        char y=x.charAt(0);
        System.out.println(y);


        //Soru 3-Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
        //ile 127 arasindaki bir sayiya donusturup yazdirin.
        int s= scan.nextInt();
        byte b= ((byte) s);
        System.out.println(b);
    }
}
