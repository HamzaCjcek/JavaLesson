import java.util.Random;
import java.util.Scanner;

public class TasKagıtMakas {

    public static void main(String[] args) {
        int pc=0;
        int ben=0;
        for (int i = 1; i <=10 ; i++) {
            Random rnd=new Random();

            int oyun=rnd.nextInt(3)+1;
            Scanner scan=new Scanner(System.in);


            System.out.println(oyun);
            int me= scan.nextInt();
            if (oyun==me)
            {
                System.out.println("Beraber");

            } else if (oyun==1 && me==2) {
                ben++;
                System.out.println("Benim puanım :"+ ben +" Pc'nin puani" +pc);

            } else if (oyun==1 && me==3) {
                pc++;
                System.out.println("Benim puanım :"+ ben +" Pc'nin puani" +pc);

            } else if (oyun==2 && me==1) {
                pc++;
                System.out.println("Benim puanım :"+ ben +" Pc'nin puani" +pc);
            }
            else if (oyun==3 && me==1) {
                ben++;
                System.out.println("Benim puanım :"+ ben +" Pc'nin puani" +pc);
            }
            else if (oyun==3 && me==2) {
                pc++;
                System.out.println("Benim puanım :"+ ben +" Pc'nin puani" +pc);
            } else if (oyun==2 && me==3) {
                ben++;
                System.out.println("Benim puanım :"+ ben +" Pc'nin puani" +pc);
            }
            if (ben==3 || pc==3)
            {
                System.out.println("Sonuc ="+"Benim puanım :"+ ben +" Pc'nin puani :" +pc);
                break;}

        }
    }
}
