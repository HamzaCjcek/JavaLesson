package Pratice6;

public class Dizi5 {
    public static void main(String[] args) {
        /*
        Verilen dizinin baş harflerini birleşitirip ekrana çıktı olarak yazdırın
         */
        String[] arr={"Hamza","Ayşe","Salih","Salih","İsmet","Kazım","Tuğce","İrem","Rasim"};
        String toplam="";
        for (int i = 0; i < arr.length ; i++) {
            toplam+=arr[i].charAt(0);
        }
        System.out.println(toplam);

    }
}
