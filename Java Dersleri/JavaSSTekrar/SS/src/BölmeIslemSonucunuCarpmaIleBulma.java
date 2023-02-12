import java.util.InputMismatchException;
import java.util.Scanner;

public class BölmeIslemSonucunuCarpmaIleBulma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        boolean devamedelimMi=true;
        int bolunecekSayi=1;
        int bolenSayi=1;
        do {
            System.out.println("Lütfen tamsayiyi girin \n bitirmek için Q'ya basın");
            try {
                bolunecekSayi= scan.nextInt();
                System.out.println("Lütfen Bölücek sayiyi giriniz");
                bolenSayi= scan.nextInt();
                bolumSonucunuYazdir(bolunecekSayi,bolenSayi);
            } catch (InputMismatchException e) {
                String girilenStr= scan.nextLine(); //13 satirda değeri alamdıysa bu satira gelicel exception olusucak
                if (girilenStr.equalsIgnoreCase("q"))
                {
                    devamedelimMi=false;
                }
                else
                {
                    System.out.println("Bolunecek Sayi Tam Sayi olmalıdır");
                }
            }
        }
        while (devamedelimMi);
    }

    private static void bolumSonucunuYazdir(int bolunecekSayi, int bolenSayi) {
        
    }
}
