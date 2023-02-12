package VariablesVeScanner;

import java.util.Scanner;

public class VariablesVeScanner {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan uc farkli data turunde deger alip, girilen degerleri aciklamalariyla
        //yazdirin.
        int sayi=10;
        String cumle="Hamza";
        char Karakter='A';
        System.out.println(sayi + " " +cumle +" "+" "+ Karakter);
        System.out.println("-------------");
        //Soru 2- Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini
        //yazdirin.
        Scanner scan=new Scanner(System.in);
        int x= scan.nextInt();
        Double y= scan.nextDouble();
        System.out.println(x+y);
        System.out.println(x*y);
        System.out.println("-------------");
        //Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        String isim=scan.nextLine();
        String Soyisminiz=scan.nextLine();
        String yas= scan.nextLine();
        System.out.println(isim + Soyisminiz +yas);
        String kayit="Kaydiniz basariyla tamamlanmistir";
        //Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini
        //yazdirin.
        int uzunkenar= scan.nextInt();
        int kisakenar= scan.nextInt();
        System.out.println(uzunkenar*kisakenar);

    }
}
