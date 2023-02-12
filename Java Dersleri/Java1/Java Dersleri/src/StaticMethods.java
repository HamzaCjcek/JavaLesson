public class StaticMethods {
    public static void main(String[] args) {
        System.out.println("Main method calisti");
    }
    StaticMethods()
    {
        System.out.println("Constructor calisti");
    }
    static {
        //Static block'lar class'daki tum yapilardan,hatta main method'dan bile once calisir
        //Method'larin ve static block'larin siralamasi java acisindan onemli degildir
        //Ancak birden fazla static block varsa,kendi aralinda once ustteki calişir
        //Static block'da istedgimiz bir variable'a baslangic degerinin atanmasi
        //Kullanicidan yetki sorgulamasi gibi islemler yapilabilir
        //Main method calismadan once yapilmasi gereken islem oldugunda kullanilir
        System.out.println("Static block calisti");
    }
}

