import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListD {
    public static void main(String[] args) {
        Integer[] arr={2,3,4,5,6,7,8,12,3};
        /*
        * Verilen bir arrayi'i list'e çevirmek için 2 yöntem vardir
        * 1-Bir loop ile tum elemetleri list'e kopyalamak
        * 2-asList() kullanmak
        * */
        List<Integer> list1=new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            list1.add(arr[i]);
        }
        System.out.println(list1); // [2, 3, 4, 5, 6, 7, 8, 12, 3]

        List<Integer> list2= Arrays.asList(arr); // [2, 3, 4, 5, 6, 7, 8, 12, 3]
        System.out.println(list2);
    }
}
