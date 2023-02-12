package Tenary;

import java.util.Scanner;

public class Tenaryörnek   {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a= scan.nextInt();
        int x=1;
        int y=20;
        System.out.println(a%5==0 ? "Sayi 5’in tam kati" : "Sayi 5’in tam kati değildir");
        System.out.println(a<100 || a>0 ? "Sayi 0 ile 100 arasındadır":"Sayi 0 ile 100 arası değildir");

    }

}
