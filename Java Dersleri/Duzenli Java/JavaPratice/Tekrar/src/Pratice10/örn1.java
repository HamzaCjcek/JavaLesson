package Pratice10;

import java.util.Scanner;

public class örn1 {
    //Bir top belirli yükseklikten atılmaktadır
    //Atıldıktan sonra,atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    //Top zıplama yuksekliği 1 metrenin altına indiğinde durmaktadır
    //While code blogu create ediniz

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double birakildigiyukseklik=scanner.nextInt();

        double topuntoplamyolu=0;
        int yerevurmasayisi=0;
        topuntoplamyolu=birakildigiyukseklik;
        while(birakildigiyukseklik>1.0)
        {
            yerevurmasayisi++;
            birakildigiyukseklik*=0.75;
            topuntoplamyolu+=birakildigiyukseklik;
            System.out.println("topuntoplamyolu :"+topuntoplamyolu);
            System.out.println("yerevurmasayisi :"+yerevurmasayisi);
            System.out.println("yerden yükseklik :"+birakildigiyukseklik);
            System.out.println("-----------");
        }
        System.out.println("topuntoplamyolu :"+topuntoplamyolu);
        System.out.println("yerevurmasayisi :"+yerevurmasayisi);
        System.out.println("bırakıldığı yükseklik :"+birakildigiyukseklik);

    }
}
