package Pratice11;

import java.util.Scanner;

public class Atm {
    static Scanner scan=new Scanner(System.in);
    static String kartNo="123456789";
    static String sifre="1234";
    static int bakiye=50000;

    public static void main(String[] args) {
        giris();
        menu();
    }

    private static void menu() {
        System.out.println("1.Bakiye Sorgulama");
        System.out.println("2.Para Yatırma");
        System.out.println("3.Para Çekme");
        System.out.println("4.Para Gönderme");
        System.out.println("5.Şifre Değiştirme");
        System.out.println("6.Çıkış");
        int secim= scan.nextInt();

        switch (secim)
        {
            case 1:{bakiyesorgulama();break;}
            case 2:{ParaYatirma();break;}
            case 3:{ParaCekme();break;}
            case 4:{ParaGonderme();break;}
            case 5:{SifreDegistirme();break;}
            case 6:{Cikis();break;}
        }
    }

    private static void Cikis() {
        System.out.println("Tekrar Bekleriz");
    }

    private static void SifreDegistirme() {
        System.out.println("Yeni Şifre Giriniz : ");
        String yenisifre= scan.next();
        sifre=yenisifre;
        System.out.println("Güncel Şifreniz :" + yenisifre);

    }

    private static void ParaGonderme() {
        System.out.println("Para Göndermek İsteğiniz Hesap Bilgilerini Giriniz :");
        String gonderilecekhesap= scan.nextLine();
        if (kartNo.length()==gonderilecekhesap.length())
        {
            System.out.println("Gönderilecek Para Miktarını Giriniz :");
            int gonderilecekpara= scan.nextInt();

            bakiye-=gonderilecekpara;
            System.out.println("Güncel Bakiye :" +bakiye);
        }
        else{
            System.out.println("Eksik tuşlama yaptınız");
        }

    }

    private static void ParaCekme() {
        System.out.println("Çekilicek Para Miktarını Giriniz :");
        int cekilicekpara= scan.nextInt();
        if (bakiye>=cekilicekpara)
        {
            bakiye-=cekilicekpara;
            System.out.println("Güncel Bakiye :" +bakiye);
        }
        else{
            System.out.println("Girilen para miktarı bakiyeden büyük olamaz");
        }
    }

    private static void ParaYatirma() {
        System.out.println("Yatırılıcak Para Miktarını Giriniz :");
        int yatirilicakpara= scan.nextInt();
        bakiye+=yatirilicakpara;
        System.out.println("Güncel Bakiye :" +bakiye);
    }

    private static void bakiyesorgulama() {
        System.out.println(bakiye);
    }

    private static void giris() {
        System.out.println("Kart Numarasını giriniz: ");
        String kKartNo=scan.nextLine().replace(" ","");

        System.out.println("Şifre Giriniz: ");
        String ssifre=scan.nextLine().replace(" ","");

        /*
        if (kKartNo==kartNo && ssifre==sifre)
        {
            System.out.println("Giriş yapılldı");
        }
        else {
            System.out.println("Yanlış");
        }
         */
        if (kartNo.equals(kKartNo) && sifre.equals(ssifre))
        {
            System.out.println("Giriş yapıldı");
        }
        else {
            System.out.println("Yanlış");
        }


    }
}
