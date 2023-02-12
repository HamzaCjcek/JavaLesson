import java.util.ArrayList;
import java.util.List;

public class Örnek2 {
    public static void main(String[] args) {
      /*
      Soru 30-)
        Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın. ( mülakat sorusu )
        Örnek:
        String str="Javacokkolay"
        Yinelenen karakterler : [a, o, k]
        İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.
               Stringdeki bir harfi Stringde bulunan diger harfler ile karşılaştırıpkonteynıra atacaksınız
               bu yüzden iç içe loop kullanmak mantıklı duruyor
       */

        String str="Javajvzxz";
        String[] yinelenen=str.split("");

        List<String> tekrar=new ArrayList<>();
        for (int i = 0; i <str.length(); i++) {
            // tekrar.add(yinelenen[i]);
            for (int j = str.length()-1; j>i ; j--) {
                if (yinelenen[i].equalsIgnoreCase(yinelenen[j]))
                {
                   tekrar.add(yinelenen[i]);
                }
            }
        }
        System.out.println(tekrar);//[J, a, v]

    }
}
