package Pratice6;

import java.util.Scanner;

public class Dizi2 {
    public static void main(String[] args) {
        //Kullanıcı tarafında girilen string ifadenin içindeki sayisal değerleri toplayın
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String[]cumlearr=str.split("");
        int toplam=0;

        for (int i = 0; i <cumlearr.length ; i++) {
            if(Character.isDigit(cumlearr[i].charAt(0)))
            {
               toplam+=Integer.valueOf(cumlearr[i]);
            }
        }
        System.out.println(toplam);
    }
}
