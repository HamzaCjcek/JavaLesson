package Pratice6;
import java.util.Arrays;

public class Dizi {
    public static void main(String[] args) {
        int[] input={3,5,1,2,7,9,2,3,5,7};
        //output={3,5+1,2+7+9,2+3+5+7}
        int[] output=new int[4];
        int sayac=0;
        int indexara=1;
        int toplam=0;
        for (int i = 0; i < output.length ; i++) {
            for (int j = 0; j <=sayac ; j++) {
               toplam+=input[indexara-1+ j];

            }
            output[i]=toplam;
            sayac++;
            toplam=0;
            indexara+=sayac;
        }//924   0 , 1,2 ,3,4,5, 6,7,8,9
        System.out.println(Arrays.toString(output));
    }
}
