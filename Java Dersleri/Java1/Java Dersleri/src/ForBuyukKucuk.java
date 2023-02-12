public class ForBuyukKucuk {
    public static void main(String[] args) {
        //String türünden input
        //input index'i tek sayı olanları kucuk harf
        //input index'i çift sayı olanları buyuk harf

        String input="Java Candır";
        for (int i = 0; i < input.length(); i++) {
            System.out.println(i%2==0
            ? input.substring(i,i+1).toUpperCase()
            : input.substring(i,i+1).toLowerCase());
        }
    }
}
