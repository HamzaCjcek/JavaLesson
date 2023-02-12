import java.util.Scanner;

public class ToUpperCaseLowerCase {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Soyisim Giriniz :");
        String Soyisim= scan.next();
        System.out.println(Soyisim.toUpperCase());//Büyük Harf yapma
        System.out.println(Soyisim.toLowerCase());//kücük harf yapma
    }
}
