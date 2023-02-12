public class StringManipulation {
    public static void main(String[] args) {
        String cumle="Java başladı ve bitti ve ve";
        String istenenKelime="ve";
        kullanimSayisiniBul(cumle,istenenKelime);
    }

    private static void kullanimSayisiniBul(String cumle, String istenenKelime) {
        /*
        int counter = 0;
        cumle= cumle.toLowerCase();
        while(cumle.contains(istenenKelime)) {
            if (cumle.contains(istenenKelime)) {
                counter++;
                cumle = cumle.replaceFirst(istenenKelime, "_");
            }
        }
        System.out.println(counter);
         */
        int kullanimsayisi=0;
        for (int i = 0; i <=cumle.length()-istenenKelime.length() ; i++) {
            if (cumle.substring(i,i+istenenKelime.length()).equals(istenenKelime))
            {
                kullanimsayisi++;
            }
        }
        System.out.println(kullanimsayisi);
        }
}
