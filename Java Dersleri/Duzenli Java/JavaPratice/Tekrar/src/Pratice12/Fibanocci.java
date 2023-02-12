package Pratice12;


import java.util.ArrayList;
import java.util.List;

public class Fibanocci {

    public static void main(String[] args) {
        // 0,1,1,2
        int input=13;
        List<Integer> fibanocci=new ArrayList<>();
        fibanocci.add(0);
        fibanocci.add(1);
        for (int i = 2; i<input ; i++) {
                fibanocci.add(fibanocci.get(i-1) + fibanocci.get(i-2));
        }
        System.out.println(fibanocci);
    }
}
