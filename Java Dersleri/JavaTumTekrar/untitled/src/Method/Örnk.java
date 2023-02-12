package Method;

public class Örnk {
    public static void sayiTopla(int sayi1,int sayi2)
    {
        System.out.println(sayi1+sayi2);
    }
    public static int sayiToplaDondur(int sayi1,int sayi2)
    {
        return sayi1+sayi2;
    }

    public static void main(String[] args) {
        sayiTopla(1,2);
        int sonuc=sayiToplaDondur(2,3);
        System.out.println(sonuc  );
    }
}
