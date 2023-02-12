import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // Kullanıcan 5 tane sayı alın bunların while döngüsü ile toplayınız...
        Scanner scan=new Scanner(System.in);
        int girilenSayi=1;
        int sayilarintoplami=0;
        int sayac=1;
        boolean devam=true;
        do {
            girilenSayi= scan.nextInt();
            sayac++;
            if (sayac==6)
            {
                devam=false;
            }
            sayilarintoplami+=girilenSayi;
        }
        while (devam==true);
        System.out.println(sayilarintoplami);

    }
}
