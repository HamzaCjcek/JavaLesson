public class ArtırmaOlayı {
    public static void main(String[] args) {
        int k=30;

        System.out.println(k++);
        System.out.println(k);
        System.out.println(++k);
        //
        int sayi=10;
        int sayi2=sayi++;
        int sayi3=--sayi;
        int sayi4=sayi++;

        System.out.println(sayi + "," + sayi2 + "," + sayi3 + "," + sayi4);

    }
}
