import java.util.Scanner;

public class Giris {
    public static void main(String[] args) {
        System.out.println("Hello World"); // Veri Yazdırma
        Scanner scan=new Scanner(System.in); // Veri Alma Kullanılan Kütüphane
        System.out.print("İsim Giriniz :");
        String isim=scan.next(); // Veri Alma
        System.out.println(isim);
    }
}
