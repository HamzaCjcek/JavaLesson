public class Varargs {
    public static void main(String[] args) {
       topla(8,5);
        topla(5,7,3);
    }

    private static void topla(int i, int i1) {
        System.out.println(i+i1);
    }

    private static void topla(int i, int i1,int i2) {
        System.out.println(i+i1+i2);
    }
}
