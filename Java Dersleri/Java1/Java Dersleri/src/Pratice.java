import java.util.Scanner;

public class Pratice {
    //Kullanıcı tarafından girilen string ifadenin içindeki sayısal değerleri toplayan methodu yaziniz
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Cümle giriniz :");
        String cumle= scan.nextLine();
        System.out.println(sayisalIfadeleriTopla(cumle));
    }

    private static int sayisalIfadeleriTopla(String cumle) {
        int toplam=0;
        String cumleArr[]=cumle.split(""); // Karakterleri Tek tek ayırıyoruz
        for (String each:cumleArr
             ) {
            if (Character.isDigit(each.charAt(0)))
            {
                toplam+=Integer.valueOf(each);
            }

            for (int i = 0; i < cumleArr.length ; i++) {
                if (Character.isDigit(cumleArr[i].charAt(0)))
                {
                    toplam+=Integer.valueOf(cumleArr[i]);
                }
            }

        }
        return toplam;
    }
}
