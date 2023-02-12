package Tekrar;

public class ArrayİcindekiSayılarıToplamı {
    public static void main(String[] args) {
        float[] numbers={1.0f,2.7f,3.5f,5.3f,7.0f};
        double toplam=0;
        for (int i = 0; i < numbers.length; i++) {
            toplam+=numbers[i];
        }
        System.out.println(toplam);
    }
}
