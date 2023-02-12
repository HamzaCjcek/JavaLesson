public class Method {
    public static void main(String[] args) {
        faktoriel(5);
        faktoriel(7);
    }

    public static void faktoriel(int i) {
        int carpım=1;
        for (int j = 1; j <=i ; j++) {
            carpım*=j;
        }
        System.out.println(carpım);
    }

}
