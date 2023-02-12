import java.util.Scanner;

public class Faktöriel {
    public static void main(String[] args) {
        // Örnek 1 1’den 10’e kadar sayilari ayni satirda aralarinda bir bosluk birakarak yazdırın

        for (int i = 1; i < 10; i++) {

            System.out.print(" "+i);
        }
        // Örnek 2 Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi dahil) 7 ila bolunebilen sayilari yazdirin.

        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();
        if (sayi>0)
        {
            for (int i = 0; i < sayi ; i++) {
                if (i%7==0)
                {
                    System.out.print(" "+i);
                }
            }
        }
        // Örnek 3 Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        int pzt1= scan.nextInt();
        int pzt2= scan.nextInt();
        int toplam=0;
        if (pzt1>0 && pzt2>0)
        {
            if (pzt2>pzt1)
            {
                for (int i = pzt1; i <=pzt2 ; i++) {
                    toplam +=i;
                }
                System.out.println(toplam);
            }
            else {
                for (int i = pzt2; i <=pzt1 ; i++) {
                    toplam +=i;
                }
                System.out.println(toplam);
            }
        }

        // Örnek 4 Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin.

        int kucuk= scan.nextInt();
        int faktoriel=1;
        if (kucuk<20)
        {
            for (int i = 1; i <=kucuk; i++) {
                faktoriel *=i;
                System.out.print(i + "*" );
            }

            System.out.println("=" +faktoriel);
        }

    }
}
