public class Varargs2 {
    public static void main(String[] args) {
        // Oyle bir method olusturalim ki
        // Kac tane argument yazarsam yazayim
        // Argumenlerin toplamini versin
        topla(5,6);
        topla(5,6,7);
        topla(7,8,9,0);
        /*
        Varargs array altyapisini kullanir
        Temel hedef argument sayisi degisse bile tum arg
        ayni data turundeki tum argumentleri alabilecek bir parametre olusturmaktır
         */
    }
    private static void topla(int...sayilar)
    {
        int toplam1=0;
        for (int i = 0; i < sayilar.length ; i++) {
            toplam1+=sayilar[i];
        }
        System.out.println(toplam1);
        System.out.println("-------------");
        int toplam2=0;
        for (int each:sayilar
             ) {
            toplam2+=each;
        }
        System.out.println(toplam2);


    }
}
