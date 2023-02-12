public class Varargs3 {
    public static void main(String[] args) {
        //Kactane string argument yazilirsa yazilsin
        //Argumenlerin en uzun alanini yazdiran bir method olusturun
        // Not: en uzun kelime olarak birde fazla kelime varsa ilkini yazidirin
        enUzunuYazir("Ilyas","Berivan","Murat");

    }

    private static void enUzunuYazir(String...isimler) {
        String isimtopla="";
        for (int i = 0; i < isimler.length ; i++) {
            isimtopla+=isimler[i];
        }
        System.out.println(isimtopla);
        String enUzunKelime=isimler[0];
        for (String eachKelime:isimler
             ) {
            if (eachKelime.length()>enUzunKelime.length())
            {
                enUzunKelime=eachKelime;
            }
        }
        System.out.println(enUzunKelime);
    }
}
