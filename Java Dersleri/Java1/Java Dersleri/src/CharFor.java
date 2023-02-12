import java.util.Scanner;

public class CharFor {
    public static void main(String[] args) {
        // Girilen kelimeyi karakterlerine ayırma
        Scanner scan=new Scanner(System.in);
        System.out.print("Kelime yazınız :");
        char girilenkarakter=scan.next().charAt(0);
        for (int i = 0; i <=10 ; i++) {
            System.out.println((char)(girilenkarakter+i));
        }
    }
}
