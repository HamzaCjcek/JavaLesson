package Notlar2.StaticVariables;

public class Detay2 {
    static int sayi=20;
    int yas=40;

    public static void main(String[] args) {
        sayi++;
        //yas++; // Static  olmayan değeri static methodlar kabul etmez
        method1();
       // method2();
    }
    public static void method1()
    {
        sayi++;
       // yas++; // Static  olmayan değeri static methodlar kabul etmez
    }
    public void method2()
    {
        sayi++;
        yas++;
        method1();
        method2();
    }
}
