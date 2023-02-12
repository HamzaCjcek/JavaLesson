import java.util.Arrays;
import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        //Klavyeden girilen 5 adet sayıyı, küçükten büyüğe doğru sıralayarak ekrana yazdıralım.
        int dizi[]=new int[5];
        for (int i = 0; i <5 ; i++) {
            Scanner scan2=new Scanner(System.in);
            dizi[i]=scan2.nextInt();

        }
        //Arrays.sort(dizi);
        System.out.println("-------------");
        Arrays.sort(dizi);
        for (int i = 4; i >=0; i--)
        {
            System.out.println(dizi[i]);
        }

    }
}
