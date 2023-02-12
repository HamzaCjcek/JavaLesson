package Constructor;

public class Kimlik {
    String isim="Belirtilmedi";
    String soyisim="Belirtilmedi";

    int yas=22;
    int boy=188;
    String tc="12345678911";
    String kangrubu="A+";

    public Kimlik(String isim,String soyisim,int yas,int boy,String tc)
    {
        this.isim=isim;
        this.soyisim=soyisim;
        this.yas=yas;
        this.boy=boy;
        this.tc=tc;
    }
    public Kimlik()
    {

    }
    public static void yasam(){
        System.out.println("Tüm insanlar belli bir yaşa kadar yaşar");
    }

    @Override
    public String toString() {
        return "Kimlik{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                ", boy=" + boy +
                ", tc='" + tc + '\'' +
                ", kangrubu='" + kangrubu + '\'' +
                '}';
    }

}
