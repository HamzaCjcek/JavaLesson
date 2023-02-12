package Printf;

import java.util.Scanner;

public class PrintfOndalikliSayi {
    public static void main(String[] args) {
        // vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30 veya daha buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen kilonuzu kg olarak giriniz");
        double kilo= scan.nextDouble();
        System.out.println("Lutfen cm olarak boyunuzu giriniz");
        double boy= scan.nextDouble();
        double vke= kilo*10000/(boy * boy);
        System.out.printf("%8.2f %n",vke);
       // System.out.println(vke);
    }
}
