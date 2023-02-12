public class YaziyiTerstenYazdırma {
    public static void main(String[] args) {
        String isim="Hamza Durden";
        String terstenisim="";
        for (int i = isim.length()-1; i>=0 ; i--) {
            terstenisim +=isim.substring(i,i+1);
        }
        System.out.println(terstenisim);
    }
}
