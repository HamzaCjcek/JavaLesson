public class Hastane {
    static String hastaneismi="Yıldız Hastanesi";
    static String hastaneAdres="Cankaya/Ankara";

    String personelİsmi;
    String personleAdresi;
    String personelTel;

    public static void main(String[] args) {
        Hastane p1=new Hastane();
        p1.personelİsmi="Salih";
        p1.personleAdresi="RealMardin";
        p1.personelTel="05344440678";

        System.out.println(p1.personelİsmi);
        System.out.println(p1.personelTel);
        System.out.println(p1.personleAdresi);
    }
}
