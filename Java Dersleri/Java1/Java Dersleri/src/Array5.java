import java.util.ArrayList;
import java.util.List;

public class Array5 {

    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        for (int i = 0; i <10; i++) {
            sayilar.add(i);
        }
        System.out.println(sayilar);
        System.out.println(sayilar.indexOf(4));
        System.out.println(sayilar.lastIndexOf(3));
    }
}
