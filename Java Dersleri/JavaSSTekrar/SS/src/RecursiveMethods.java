import java.util.Scanner;

public class RecursiveMethods {
    //Kullanicidan pozitif bir tamsayi alip
    // o sayidan sifira kadar olan pozitif tamsayilari toplayin
    public static void main(String[] args) {
        int toplam=0;
        Scanner scan=new Scanner(System.in);
        int sayi= scan.nextInt();
        for (int i = 0; i <=sayi ; i++) {
            toplam+=i;
        }
        System.out.println(toplam);

        System.out.println(toplaRecursive(sayi));
    }

    private static int toplaRecursive(int sayi) {
        int topla=0;
        if(sayi>0)
        {
            return (sayi+toplaRecursive(sayi-1));

        }else return sayi;

    }
}
