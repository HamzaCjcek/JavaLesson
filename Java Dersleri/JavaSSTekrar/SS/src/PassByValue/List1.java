package PassByValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class List1 {
    public static void main(String[] args) {
        List<Object> sayi=new ArrayList<>();
        sayi.add(10);
        sayi.add(20);
        sayi.add(30);
        System.out.println(sayi);//[10, 20, 30]
        elemanlaridegistir(sayi);//[15, 25, 35]
        yenilisteata(sayi);//[5, 15, 25]
        salihdurden(sayi);

    }

    private static void salihdurden(List<Object> sayi) {
        //Wc gidiyom ben
        sayi = new ArrayList<>();
        sayi.add("Salih");
        sayi.add('K');
        sayi.add(4.6);
        System.out.println(sayi);
    }

    private static void yenilisteata(List<Object> sayi) {
        sayi=new ArrayList<>();
        sayi.add(5);
        sayi.add(15);
        sayi.add(25);
        System.out.println(sayi);
    }

    private static void elemanlaridegistir(List<Object> sayi) {
        sayi.set(0,15);
        sayi.set(1,25);
        sayi.set(2,35);
        System.out.println(sayi);
    }
}
