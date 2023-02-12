package Notlar2.StaticVariables;

public class Detay5 {

    Detay5()
    {
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("Main method calismaya basladi");
    }
    static {
        System.out.println("Static block calisti");
    }
}
