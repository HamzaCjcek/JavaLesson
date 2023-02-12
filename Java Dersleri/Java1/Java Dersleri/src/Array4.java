import java.util.ArrayList;
import java.util.List;

public class Array4 {
    public static void main(String[] args) {
        // Java'da bir çok yapida get ve set method'lari bulunur.
        // Get method'lari bilgiyi bize getirirken
        // Set method'lari bilgiyi update eder

        List<String> harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");

        System.out.println(harfler);// [A, Z, T]

        harfler.add(2,"F");
        System.out.println(harfler);// [A, Z, F, T]

        harfler.set(1,"H");
        System.out.println(harfler);// [A, H, Z, T]

    }
}
