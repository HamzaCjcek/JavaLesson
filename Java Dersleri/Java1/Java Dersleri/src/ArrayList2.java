import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
        List<String>harfler=new ArrayList<>();
        harfler.add("Durden");
        harfler.add("Salih");
        harfler.add("Yalçın");
        harfler.remove("Durden");
        System.out.println(harfler);
        List<String> yenilist=new ArrayList<>();
        yenilist.add("Salih");
        yenilist.add("Hamza");
        yenilist.add("Çiçek");
        System.out.println(yenilist.removeAll(harfler));
        System.out.println(yenilist);

        //
        int[] arr={4,3,6,7,8,9,4,3,1,2,3,5};
        List<Integer>sayilar=new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println(sayilar);
        System.out.println(sayilar.contains(3));
    }
}
