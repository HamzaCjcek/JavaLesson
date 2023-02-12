package Notlar2.StaticVariables;

public class Detay {
    static int sayi=20;
    int yas=40;
    public Detay() //Cons
    {

    }
    public void Detay() //Method
    {
        sayi++;
        yas++;
    }

    public static void main(String[] args) {
        Detay obj1=new Detay();
        Detay obj2=new Detay();
        System.out.println(obj2.sayi+" "+obj2.yas);
    }
}
