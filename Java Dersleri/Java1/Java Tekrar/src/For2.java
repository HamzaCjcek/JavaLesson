import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
        //Girilen bir metnin alt alta yazdırılmasını sağlama:
        String cumle;
        Scanner scan=new Scanner(System.in);
        cumle= scan.next();
        String aktar="";
        for (int i = 0; i <=cumle.length() ; i++) {
            System.out.println(cumle.substring(0,i));
        }
        //For Döngüsü kullanarak a’ dan z’ ye kadar olan harfleri ekranda gösteren örnek:
        char karakter;
        for (karakter='a'; karakter <= 'z' ; karakter++) {
            System.out.println(karakter);
        }
        //For Döngüsü kullanarak Kullanıcıdan aldığı 10 adet sayıyı toplayarak ekranda gösteren uygulama.
        int toplam,sayi;
        toplam=0;
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i +". Sayiyi Giriniz :");
            sayi= scan.nextInt();
            toplam+=sayi;
        }
        System.out.println(toplam);
        //Genişliği ve yüksekliği kullanıcı tarafından verilen dikdörtgen oluşturma örneği:
        int uzunkenar,kisakenar;
        System.out.print("Uzunkenar Giriniz :");
        uzunkenar= scan.nextInt();
        System.out.print("KısaKenar Giriniz :");
        kisakenar= scan.nextInt();
        for (int i = 1; i <=uzunkenar ; i++) {
            for (int j = 1; j <=kisakenar ; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        //Girilen stringteki “0” (Sıfır) adetini bulan ve ekrana yazdıran program örneği:

    }
}
