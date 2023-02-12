import java.time.LocalTime;

public class Localtime {
    public static void main(String[] args) {
        LocalTime zaman=LocalTime.now();
        System.out.println(zaman); // 12:06:58.753498200
        System.out.println(zaman.getMinute());//8
        System.out.println(zaman.withSecond(0).withNano(0)); //12:09
        System.out.println(zaman.withSecond(1).withNano(1)); //12:09
        System.out.println(zaman.plusHours(100).plusMinutes(250));//20:21:38.703204400
        // bir for loop ile 1'den 10000'e kadar olan sayıları yan yana yazdırın
        // bu işlem için gecen zamani bulun
        LocalTime basZamani=LocalTime.now();
        System.out.println(basZamani);
        for (int i = 1; i <=10000 ; i++) {
            System.out.print(i + " ");
        }
        LocalTime bitisZaman=LocalTime.now();
        System.out.println(" ");
        System.out.println(bitisZaman);

        System.out.println("İslem suresi :" + (bitisZaman.getNano()-basZamani.getNano()));


         /*
            Olusturdugumuz time veya date guncel zamani veya tarihi tutmaya devam eden bir sayac degil
            olusturdugumuz satirdaki zamani veya tarih'i sistemden alip kaydeden bir variable'dir

            ilerleyen satirlarda guncel zaman veya tarihe ihtiyacimiz oldugunda
            yeni bir time veya date objesi olusturup
            o andaki degeri alabiliriz.
         */

    }
}
