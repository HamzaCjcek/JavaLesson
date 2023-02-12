import java.util.Random;
import java.util.Scanner;

public class Örn {
    public static void main(String[] args) {
        Random rnd=new Random();

        int oyun=rnd.nextInt(3)+1;

        int pc=0;
        int ben=0;
        System.out.println(oyun);
        Scanner scan=new Scanner(System.in);
        int me= scan.nextInt();
        if (oyun==me)
        {
            System.out.println("Beraber");

        }
         else
        {
            System.out.println("Pc :"+oyun +" Me :"+me);

        }


    }
}
