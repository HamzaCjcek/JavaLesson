import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        /* Soru 3- Kullanıcıdan bir pozitif sayi isteyin
        * Sayının tam kare olup olmadığını bulunuz
        * Tam kare ise true değilse false yazdırınız
        * Örnek: input : 16 , output :4 */

        Scanner scan=new Scanner(System.in);
        int input= scan.nextInt();
        boolean sonuc=false;
        int karekok=1;
        while(karekok*karekok<=input)
        {
            if (karekok*karekok==input)
            {
                System.out.println("Girilen sayının karekoku :" +karekok);
                sonuc=true;
                break;
            }else
            {
                karekok++;
            }

        }
        System.out.println(sonuc);
    }
}
