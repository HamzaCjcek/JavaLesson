import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        // kullanicidan bir char alip
        // o karakterden sonra gelen 10 karakteri yazdirin

        Scanner scanner=new Scanner(System.in);
        char girilenkarakter= scanner.next().charAt(0);
        for (int i = 1; i <=10 ; i++) {
            System.out.print((char) (girilenkarakter+i));
        }
        System.out.println("--------------");
        // input olarak verilen bir Stringde
        // index'i tek sayi olanlari kucuk harfle
        // index'i cift sayi olanlari buyuk harfle yazdirin
        // ornek : Java  output: JaVa
        String input="JAva candir,Selenium heycandır";
        String x="";
        String y=input.substring(0,1);
        System.out.println(y);
        for (int i = 0; i <input.length() ; i++) {
                if (i%2==0)
                {
                   x=input.substring(i,i+1).toUpperCase();
                }
                else{
                    input.substring(i,i+1).toLowerCase();
                }
            System.out.print(x);
        }
        //// input olarak verilen bir tamsayinin
        //// asal sayi olup olmadigini yazdirin
        System.out.println("---------------");
        int xs=7;
        String sonuc="Sayi asal";
        for (int i = 2; i <xs ; i++) {
            if (xs%i==0)
            {
                sonuc="Sayi asal değil";
                break;
            }

        }
        System.out.println(sonuc);

        // // Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
        int baslangic=scanner.nextInt();
        int son=scanner.nextInt();
        int toplam=0;
        if(baslangic>son)
        {
            System.out.println("Son ilkte büyük");
        }
        else {
            for (int i = baslangic; i <=son ; i++) {
                toplam+=i;
            }
            System.out.println(toplam);
        }
        // Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.
        String str="Javafs dafsda";
        String terstenstr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            terstenstr+=str.charAt(i);
        }
        System.out.println(terstenstr);

          /*
                * * * * * * * *   // bir satiri nasil yazdiracagimizi inner loop ile belirliyoruz
                * * * * * * * *
                * * * * * * * *
                * * * * * * * *
                * * * * * * * *
             Satirda yaptigimiz islemi kac kere tekrar edecegimizi ise outer loop belirliyor

         */
        int kisakenar=6;
        int uzunkenar=9;
        for (int i = 1; i <=kisakenar ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = kisakenar; i >=1 ; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
