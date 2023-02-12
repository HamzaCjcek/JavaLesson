import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Örnek {
    public static void main(String[] args) {
        String str="Java";
        String[] yinelenen=str.split("");

        List<String>tekrar=new ArrayList<>();
        for (int i = 0; i <=4; i++) {
               // tekrar.add(yinelenen[i]);
            for (int j = 4; j>=1 ; j--) {
                if (yinelenen[i].equalsIgnoreCase(yinelenen[j]))
                {
                    tekrar.add(yinelenen[i]);
                }
            }
            System.out.println(tekrar);

        }

    }
}
