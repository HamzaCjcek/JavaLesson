package Notlar2.StaticVariables;

public class Detay6 {
    public static void main(String[] args) {
        int fiyat=100;
        System.out.println(indirimYap10(fiyat));
        System.out.println(indirimYap10(fiyat));
        System.out.println(indirimYap10(fiyat));
        System.out.println(indirimYap10(fiyat));
        System.out.println(indirimYap10(fiyat));

        System.out.println(fiyat);
    }

    private static int indirimYap10(int fiyat) {
        fiyat=fiyat*9/10;
        return fiyat;
    }
}
