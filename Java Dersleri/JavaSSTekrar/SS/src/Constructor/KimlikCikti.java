package Constructor;

public class KimlikCikti {
    public static void main(String[] args) {
        Kimlik km=new Kimlik("hamza","çiçek",22,188,"22222222222");
        System.out.println(km);
        Kimlik km2=new Kimlik();
        System.out.println(km2.isim+km2.soyisim);
        System.out.println(km2.toString());
    }
}
