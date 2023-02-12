import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //  1 ile 40 arasındaki çift sayıları toplayarak sonucu ekranda gösterelim. (40 dahil olsun).
        int toplam=0;
        for (int i = 1; i <=40; i++) {
           if (i%2==0)
           {
               toplam+=i;
           }

        }
        System.out.print(toplam); // 420
        // Klavyeden girilen sayının faktöriyelini bulan programı yapalım.
        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();
        int faktoriel=1;
        for (int i = 1; i <=sayi; i++) {
            faktoriel*=i;
        }
        System.out.println(faktoriel);
        //1’den 9’lara kadar olan klasik çarpım tablosunu oluşturalım.
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <= 9; j++)
            {
                System.out.println(i+"x"+j+"="+(i*j));
            }
            System.out.println("---------------");
        }


    }
}