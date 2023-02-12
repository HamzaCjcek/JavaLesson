package Stringmanipulation;

import java.util.Locale;

public class Örnek {
    public static void main(String[] args) {
        String str="JAVA CANDIR";
        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR")));//java candır
        System.out.println(str.toLowerCase(Locale.GERMAN));//java candir

        /* str.equals( baskaStr ); Verilen iki String’in metinlerini karsilastirir. Iki String
birbiriyle ayni metinleri iceriyorsa true, herhangi bir farklilik
varsa false dondurur.*/
        String str1="Fatiah ";
        String srt2="fatih";
        System.out.println(str1.equals(srt2)); // false
        /* str.equalsIgnoreCase( baskaStr );
Verilen iki String’in metinlerini karsilastirir. Case-sensitive olmadan birbiriyle ayni
metinleri iceriyorsa true, herhangi bir farklilik varsa false dondurur*/
        System.out.println(str1.equalsIgnoreCase(srt2)); //true

        System.out.println(str1.substring(2)); // tih
        System.out.println(str1.substring(str1.length()-1)); //h
        System.out.println(str1.concat(srt2)); //Fatihfatih
        System.out.println(str1.contains("ih")); // true
        System.out.println(str1.indexOf("a",3)); // 4
        System.out.println(str1.indexOf("a")); //1

        //14. str.isEmpty ( );
        //Verilen bir String’in bos olup olmadigini boolean olarak döndürür.
        //Bir String’in sadece space’lerden olusmus oldugunu kontrol icin str.isBlank( )
        //kullanilabilir.
        System.out.println(str1.isBlank());//false
        System.out.println(str1.isEmpty());//false

        //15. str.replace ( degisecekString , yeniDeger );
        //Bir String’in icinde bulunan degisecekString’lerin tumunu yeniDeger yapar.
        //Parametre olarak char da kullanilabilir, bu durumda degisecekChar’larin tumunu
        //yeniChar yapar.

        System.out.println(str1.replace('F','b')); // batiah

        //16. str.replaceFirst ( degisecekString , yeniDeger );
        //Bir String’in icinde bulunan degisecekString’lerden ilkini yeniDeger yapar.
        //degisecekString String olabilecegi gibi regex de olabilir
        //Regex (Regular Expressions)
        //\\s : space \\S : space olmayan hersey
        //\\s+ : yanyana birden fazla space
        //\\d : digits \\D : digit olmayan hersey
        //\\w : harf veya rakam \\W : harf veya rakam olmayan hersey
        System.out.println(str1.replaceFirst("a","e")); // Fetiah

        //str.repeat ( tekrarSayisi);
        //Bir String’i tekrarSayisi kadar tekrar ettirir.
        System.out.println(str1.repeat(3));
        //str.trim ( );
        //Bir String’in basinda ve sonunda (varsa) bulunan space’leri siler
        System.out.println(str1.trim());


   }

}
