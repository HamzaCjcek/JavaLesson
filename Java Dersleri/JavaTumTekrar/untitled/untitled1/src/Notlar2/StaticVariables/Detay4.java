package Notlar2.StaticVariables;

public class Detay4 {
    static int sayi=20;
    int yas=40;
    static String okul="ITU";
    public Detay4(int a,int b,String c) // Cons
    {
        this.sayi=a;
        this.yas=b;
        this.okul=c;
    }
    public static void method1(Detay4 dty)
    {
        System.out.println("sayi: "+dty.sayi+ ", yas: "+dty.yas+ " ,"+dty.okul);
    }

    public static void main(String[] args) {
        Detay4 obj1=new Detay4(20,30,"ODTU");
        Detay4 obj2=new Detay4(15,25,"MARMARA");

        method1(obj1);
        method1(obj2);
    }
}
