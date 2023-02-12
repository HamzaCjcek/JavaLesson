import java.util.ArrayList;
import java.util.List;

public class ArrayList3 {
    public static void main(String[] args) {
        // Verilen bir array'deki tekrar eden elementleri silip
        // Array'i unique degerlerden olusan bir array haline getirin
        int[] arr={4,3,6,7,3,5,6,7,8,9,4,2,1};
        List<Integer> benzersizElementlerList=new ArrayList<>();
        // Array'deki tum elementleri alip
        // Listede var mi diye kontrol edelim
        // Ve olmayanlari ekleyelim
        for (int i = 0; i < arr.length ; i++) {
            if (!benzersizElementlerList.contains(arr[i])) {
                benzersizElementlerList.add(arr[i]);
            }
        }
        System.out.println(benzersizElementlerList); // [4, 3, 6, 7, 5, 8, 9, 2, 1]
    }
}
