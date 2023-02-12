import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("İlk Sayiyi Giriniz :");
        double sayi1=scan.nextDouble();
        System.out.print("İkinci Sayiyi Giriniz :");
        double sayi2=scan.nextDouble();
        System.out.println("Toplama Sonucu :" +(sayi1+sayi2));
        System.out.println("Cıkarma Sonucu :" +(sayi1-sayi2));
        System.out.println("Carpma Sonucu :" +(sayi1*sayi2));
        System.out.println("Bolme Sonucu :" +(sayi1/sayi2));
    }
}
