package Varargs;

public class Varargs {
    public static void main(String[] args) {
        topla(2,3,3,4,5,6,7);
        enUzun("SalihDurden","Hamza","Ademİşler","xsdxsdxsdxw");
    }

    private static void enUzun(String... kelime) {

    }

    private static void topla(int... i1) {
        int sayi=0;
        for (int i = 0; i <i1.length ; i++) {
            sayi+=i1[i];
        }
        System.out.println(sayi);
    }

}
