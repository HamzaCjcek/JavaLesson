import java.util.Scanner;

public class CharDataCasting {
    public static void main(String[] args) {
        System.out.println('a'+'b'); // 97+98
        System.out.println('a'-32); // 97-32
        Scanner scan=new Scanner(System.in);
        //
        System.out.println("Rastgele kelime Giriniz :");
        char girilenkarakter=scan.next().charAt(0);
        System.out.println((char) (girilenkarakter+1));
        System.out.println(girilenkarakter);
    }
}
