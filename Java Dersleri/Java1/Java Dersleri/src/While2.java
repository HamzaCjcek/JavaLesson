import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        // Kullanıcan 5 tane sayı alın bunların while döngüsü ile toplayınız...
        Scanner scan=new Scanner(System.in);
        int girilenSayi=1;
        int sayilarintoplami=0;
        int sayac=1;
        boolean devam=true;
        while (devam)
        {
            sayac++;
            girilenSayi= scan.nextInt();
            if (girilenSayi==0) devam=false;
            if (sayac==6) devam=false;
            sayilarintoplami+=girilenSayi;
        }
        System.out.println(sayilarintoplami);

    }
}
