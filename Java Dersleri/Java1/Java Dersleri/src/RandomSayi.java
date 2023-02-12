import java.util.Random;

public class RandomSayi {
    public static void main(String[] args) {
        Random rnd=new Random();
        int x=rnd.nextInt(50);
        System.out.println(x);
        String İsim="Hamza Çiçek Malatya";
        System.out.println(İsim.charAt(İsim.length()-1)); // Tersten alır = a
        System.out.println(İsim.substring(3,5));  // za 3 ten 5 e kadar olan karakterleri getirir
        System.out.println(İsim.contains("Çiçek")); // yazılan değer içinde var  mı  yok mu diye kontrol eder
        System.out.println(İsim.contains("Çiçek") && İsim.contains("Malatya")); // True
        System.out.println(İsim.startsWith("Hamza")); // Hamza ile başlıyor mu
        System.out.println(İsim.startsWith("")); // true
        System.out.println(İsim.endsWith("Malatya")); // Malatya ile bitiyor mu ?


        System.out.println(İsim.indexOf('a',5)); //5 inci karakterden sonra a harfi kacıncı index te

    }
}
