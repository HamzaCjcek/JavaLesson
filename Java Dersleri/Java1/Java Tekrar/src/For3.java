import java.util.Scanner;

public class For3 {
    public static void main(String[] args) {

        //Girilen stringteki “0” (Sıfır) adetini bulan ve ekrana yazdıran program örneği:
        Scanner scan =new Scanner(System.in);
        String sifirsayisi;
        sifirsayisi=scan.next();
        int sayac=0;
        for (int i = 0; i <=sifirsayisi.length() ; i++) {
            if (sifirsayisi.substring(i)=="0")
            {
                sayac++;
            }
            else
            {
                break;
            }
        }
        System.out.println(sayac);

    }
}
