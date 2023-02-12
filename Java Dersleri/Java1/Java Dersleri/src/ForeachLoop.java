import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ForeachLoop {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,1};
        for (int each:arr // arr ye git her bir integer'ı bana getir
             ) {
            System.out.println(each+" ");
        }
        System.out.println("--------");
        int toplam=0;
        for (int each:arr
             ) {
            toplam+=each;
        }
        System.out.println("Toplam :"+ toplam);
        System.out.println("----------");
        toplam=0;

        for (int each:arr
             ) {
            toplam+=each*each;
        }
        System.out.println("Kareleri Toplamı :" + toplam);
        System.out.println("---------");

        Integer[] arr2={2,3,4,1,5,6,7,8};
        List<Integer> list1=new ArrayList<>();
        for (Integer each: arr2
             ) {
            list1.add(each);
        }
        System.out.println("-------------");
        //Soru 4-Kullanicidan bir cumle ve bir harf alin
        //Harf cumlede kullanilmissa kaç kere kullanildiğini yazdirin
        //Kullanilmadiysa "harf cümlede kullanilmamis" yazdirin
        String cumle="Java ogrenmek cok guzel";
        String harf="a";
        String[] cumleArr=cumle.split("");
        int sayac=0;
        for (String eachharf: cumleArr
             ) {
            if (eachharf.equals(harf))
            {sayac++;}
        }
        if (sayac==0)
        {

        }
        else
        {
            System.out.println(sayac);
        }
        System.out.println("-------------");
        // Verilen iki array'in elementlerini karşılastirip
        //İkisinde ortak olan elementleri ayri bir liste olarak veren bir program yazin
        int[] arr3={3,4,5,1,2,6,5,3,4};
        int[] arr4={2,4,5,63,3,1,7,8,9,};
        List<Integer> ortakElementler=new ArrayList<>();
        for (int eachArr1:arr3
             ) {
            for (int eachArr2:arr4
                 ) {
                if (eachArr1==eachArr2)
                {
                    if (!ortakElementler.contains(eachArr1))
                    {ortakElementler.add(eachArr1);
                }
            }
        }

    }
        System.out.println(ortakElementler);
    }
}
