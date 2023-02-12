package For;

import java.util.Scanner;

public class örn {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //hesaplayin.

        Scanner scan=new Scanner(System.in);
        int x= scan.nextInt();
        int faktoriel=1;
        if (x<20)
        {
            for (int i = x; i>=1 ; i--) {
                faktoriel*=i;
            }
            System.out.println(faktoriel);
        }
        //Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        String original=scan.nextLine();
        String reverse2="";
        int length=original.length();
        for (int i = length-1; i >=0 ; i--) {
            reverse2=reverse2+original.charAt(i);
        }
        System.out.println(reverse2);
        StringBuffer a = new StringBuffer("Java harika");
        System.out.println(a.reverse());
        int sembol=1;
        for (int i = 0; i <9 ; i++) { // Yıldızın satırlarda kaça kadar yıldız yazdıracağını belirtiriz
            for (int j = 0; j <sembol; j++) { //Yıldızımızın satırlarda kaçar kaçar basılacağını belirttik.
                System.out.print("*");//Sembolümüzü belirttik.
            }
            System.out.println("");//Yıldızlarımız basıldıktan sonra alt satıra geçilmesini sağlıyoruz.
            sembol++;//Yıldızımızın birer birer artmasını sağlarız.

        }
    }
}
