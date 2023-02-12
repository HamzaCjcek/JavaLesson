package Notlar2.StaticVariables;

public class Detay3 {
    static int sayi=20;
    int sx=40;

    public Detay3()
    {
        sayi++;
        sx++;
    }

    public static void main(String[] args) {
        Detay3 obj1=new Detay3();
        Detay3 obj2=new Detay3();
        Detay3 obj3=new Detay3();
        Detay3 obj4=new Detay3(); // 24 olmasının sebebi bunlardan kaynaklanıyor
        System.out.println(obj3.sx+ " " + obj3.sayi); // 41 24
    }
}
