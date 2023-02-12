import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*    Scanner scan=new Scanner(System.in);
            int bolunen= scan.nextInt();
            int bolen= scan.nextInt();
            int sayac=0;
            int sonuc=bolunen;
        for (sayac=0; bolen <=sonuc ; sayac++) {
            sonuc=sonuc-bolen;
        }
        System.out.println(sayac);*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Hız ve Zaman Giriniz :");
        int hız= scan.nextInt();
        int zaman= scan.nextInt();
        System.out.println(Yol(hız,zaman));
        Yol2(4,3);
    }
    public static int Yol(int hız,int zaman)
    {
        return hız*zaman;
    }

    public static void Yol2(int hız,int zaman)
    {
        Scanner scan=new Scanner(System.in);
        double yol=hız*zaman;
        System.out.println(yol);


    }
}