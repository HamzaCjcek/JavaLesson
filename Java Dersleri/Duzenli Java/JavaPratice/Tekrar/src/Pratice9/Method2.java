package Pratice9;

public class Method2 {
    public static void main(String[] args) {
        kilogram(1);
        saat(1);
        mil(3);
    }

    private static void mil(int i) {
        double mil=1.609344;
        mil=mil*i;
        System.out.println("Kilometre :" +mil);
    }

    private static void saat(int i) {

        double dakika=60*i;
        System.out.println("Dakika : "+dakika);
    }

    private static void kilogram(int i) {
        double gram=1000;
        gram=gram*i;
        System.out.println("Gram :" + gram);
    }
}
