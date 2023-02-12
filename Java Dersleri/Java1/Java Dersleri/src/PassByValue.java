import java.util.Arrays;

public class PassByValue {
    public static void main(String[] args) {
        int[] arr={3,6,9,1,7};
        elementleriDegistir(arr);
    }

    private static void elementleriDegistir(int[] b) {
        b[0]=13;
        b[2]=19;
        System.out.println(Arrays.toString(b));
    }
}
