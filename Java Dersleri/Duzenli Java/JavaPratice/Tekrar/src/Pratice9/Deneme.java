package Pratice9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deneme {
    //Input =AAABBCDD  Output=A3B2C1D2
    public static void main(String[] args) {
        String str="AAABBCDDFF";
        String boskova="";

        int sayac=0;
        List<String> ekle=new ArrayList<>();
        for (int i = 0; i <str.length() ; i++) {
            for (int j = 0; j <str.length() ; j++) {
                if(str.substring(i,i+1).equals(str.substring(j,j+1)))
                {
                    sayac++;
                }
            }
            if(!boskova.contains(str.substring(i,i+1)))
            {
                boskova=boskova+str.charAt(i)+sayac;
            }
            sayac=0;
        }
        System.out.println(boskova);

    }
}
