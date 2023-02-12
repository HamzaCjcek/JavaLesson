import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] arr1=new String[5];
        int[] arr2={1,2,3,4,5};
        System.out.println(arr2[2]); // 3
        arr1[3]="Durden";
        System.out.println(arr1[3]); // Durden
        System.out.println(Arrays.toString(arr2));//[1, 2, 3, 4, 5]

        for (int i = 0; i <arr2.length ; i++) {
            System.out.print(arr2[i] + ""); // 12345
        }

        String[] isimler ={"Huseyin","Yusuf","Mehmet","Akile"};
        String silinecekharf="u";
        for (int i = 0; i <isimler.length ; i++) {
            if(isimler[i].contains(silinecekharf))
            {
                isimler[i]=null;
            }
        }
        System.out.println(Arrays.toString(isimler)); // [null, null, Mehmet, Akile]
        int[] sayılar={1,2,3,-4,-5,5,6};
        System.out.println(arraydekiPozitifSayilariTopla(sayılar));
        //
        double[] fiyatlar ={23,34.5,42.1,35.6};
        enyuksekendusukFiyatYazdır(fiyatlar);
    }
    // Soru 2- verilen bir array'deki pozitif tamsayıları toplayıp
    // Sonucu bize döndüren bir method yaziniz.
    public static int arraydekiPozitifSayilariTopla(int[] arr)
    {
        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>0)
            {toplam+=arr[i];}
        }
        return toplam;
    }
    // Bir marketin fiyatlarını tutan bir array var
    // Bu marketteki en yüksek ve en düşük fiyatları yazdiran bir method oluşturun


    public static void enyuksekendusukFiyatYazdır(double[] fiyatlar)
    {
        double enDusukFiyat=fiyatlar[0];
        double enYukseFiyat=fiyatlar[1];
        for (int i = 0; i <fiyatlar.length; i++) {
            if (fiyatlar[i]<enDusukFiyat)
            {
                enDusukFiyat=fiyatlar[i];
            }
            if (fiyatlar[i]>enYukseFiyat)
            {
                enYukseFiyat=fiyatlar[i];
            }
        }
        System.out.println(enDusukFiyat);
        System.out.println(enYukseFiyat);

    }
}
