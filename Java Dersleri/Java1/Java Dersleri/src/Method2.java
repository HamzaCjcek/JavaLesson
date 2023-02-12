import java.util.Scanner;

public class Method2 {

    public static int topla(int sayi,int sayi2)
    {
        return sayi+sayi2;
    }
    public static void topla2(int sayi3,int sayi4)
    {
        System.out.println(sayi3+sayi4);
    }
    public static void main(String[] args) {
        //Public method call
        Method.faktoriel(5);
        //Return
        System.out.println(topla(1,3));
        //Void
        topla2(2,3);

        Scanner scan=new Scanner(System.in);
        // Asal Olup olmadığı
        int a= scan.nextInt();
        asalmıdeğilmi(a);
    }
    public static void asalmıdeğilmi(int x)
    {
       int sayac=1;
        for (int i = 2; i <=x ; i++) {
            if (x%i==0)
            {
                sayac++;
            }
        }
       if (sayac==2)
       {
           System.out.println("Sayı Asal");
       }
       else
       {
           System.out.println("Sayı Asal Değildir");
       }
    }
}
