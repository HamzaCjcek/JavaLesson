package Printf;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrinfHesapMakinasi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int girilenSayi=0;

        while (girilenSayi<=2 || girilenSayi>=9) // Kabul edilmeyen
        {
            try {
                System.out.println("Çarpım tablosu oluşturmak için bir rakam giriniz");
                girilenSayi= scan.nextInt();
                if(girilenSayi>1 && girilenSayi<10)
                {
                    break;
                }
                System.out.println(girilenSayi);
            } catch (InputMismatchException e) {
                System.out.println("Carpim tablosu icin 1'den büyük sayi girmelisiniz");
                scan.next();
            }
        }
        for (int i = 1; i <=girilenSayi ; i++) {
            for (int j = 1; j <=girilenSayi ; j++) {
                int carpim=i*j;
                System.out.printf("%2d  ",carpim);

            }
            System.out.println(" ");
        }
    }
}
