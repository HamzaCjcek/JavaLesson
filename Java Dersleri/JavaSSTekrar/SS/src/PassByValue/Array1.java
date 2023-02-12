package PassByValue;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] arr={3,6,9,1,7};
        System.out.println(Arrays.toString(arr));//[3, 6, 9, 1, 7]
        elementleridegistir(arr);//[1, 6, 9, 5, 7]
        yeniarraylist(arr);//[0, 0, 0, 0]
    }

    private static void yeniarraylist(int[] arr) {
        arr=new int[4];
        System.out.println(Arrays.toString(arr));
    }

    private static void elementleridegistir(int[] arr) {
        arr[0]=1;
        arr[3]=5;
        System.out.println(Arrays.toString(arr));
    }

}
