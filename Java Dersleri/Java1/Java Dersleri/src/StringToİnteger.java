public class StringToİnteger {
    public static void main(String[] args) {
        String str2="123";
        String str3="456";
        int str2Int=Integer.parseInt(str2);
        int str3Int=Integer.parseInt(str3);
        System.out.println(str2Int+str3Int);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        char krk1='$';
        System.out.println(Character.isDigit(krk1));//Sayı olup olmadgını kontrol etmek
        System.out.println(Character.getType(krk1));//İnt değerini döndürür
        System.out.println(Character.isLetter(krk1));//Harf olup olmadıgını kontrol eder

        // İnt to Double
        int x=5;
        double sayi=(double)x;
        System.out.println(sayi);

    }
}
