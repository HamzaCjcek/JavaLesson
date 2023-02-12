import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForearchLoop {
    public static void main(String[] args) {
        // Soru 6-Kullanicidan pozitif bir tamsayi alip
        // O tamsayiyi tam bölebilen tüm pozitif tamsayilari
        // Bir lise olarak döndüren bir method oluşturun
        Scanner scan=new Scanner(System.in);
        int sayi= scan.nextInt();
        if (sayi<=0)
        {
            System.out.println("Sayi pozitif tam sayi olmalıdır");
        }
        else
        {
          List<Integer> tblistesi=tamBolenlerListesi(sayi);
            System.out.println(tblistesi);
        }

    }
    public static List<Integer> tamBolenlerListesi(int sayi)
    {
        List<Integer> tambolenlistesi=new ArrayList<>();
        for (int i = 1; i <=sayi ; i++) {
            if(sayi%i==0)
            {
                tambolenlistesi.add(i);
            }
        }
        return tambolenlistesi;
    }
}
