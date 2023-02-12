package PassByValue;

public class PBV {
    public static void main(String[] args) {
        method1();
        method2(4);
        System.out.println(method3(3));
    }

    private static int method3(int s) {
        return s;
    }

    private static void method1() {
        method2(5);
        String isim="Hamza";
        System.out.println(isim.toUpperCase());
    }

    private static void method2(int sayi) {
        sayi=sayi*sayi;
        System.out.println(sayi);
    }
}
