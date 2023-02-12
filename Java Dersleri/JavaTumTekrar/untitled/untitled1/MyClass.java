public class MyClass {
    static String ad = "Ali Can";

    static int kilo = 33;

    public static void main(String[] args) {

    }

    public static void artirma() {

        kilo++;

        System.out.println(kilo);

    }

}



public class Static04 {

    int num1 = 12;

    static int num2 = 22;

    public static void main(String[] args) {

        Static03.artirma();

        Static03 obj = new Static03();

        obj.artirma();

        obj.artirma();

    }
}
