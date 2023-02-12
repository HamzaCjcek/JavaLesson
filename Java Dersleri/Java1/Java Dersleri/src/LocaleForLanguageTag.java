import java.util.Locale;

public class LocaleForLanguageTag {
    public static void main(String[] args) {
        String str="JAVA CANDIR";
        System.out.println(str.toLowerCase());
        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr"))); // Tr diline çevirir yazıyı

        String str1="Ja";
        String str2=str1.concat("va"); // Birleştirme
        String str3="Java";
        String str4="ja";
        System.out.println(str2);
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3)); // Değerlerin aynı olup olmadıgını kontrol eder
        System.out.println(str1.equalsIgnoreCase(str4)); // Değerlerin aynı olup olmadıgını kontrol eder.Büyük küçük harf fark etmez

    }
}
