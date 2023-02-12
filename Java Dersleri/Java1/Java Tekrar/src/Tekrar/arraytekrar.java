package Tekrar;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class arraytekrar {
    public static void main(String[] args) {
        // Input1:{John,Brand,Ange,Sofia,Emily} : {sofia,brad,grace,emily,hazel}
        // Output : {sofia,brad,emily}

      /*  String [] array1= {"John","Brand","Ange","Sofia","Emily"};
        String [] array2={"sofia","brad","grace","emily","hazel"};  */

        // İki array arasında aynı olan elemanlari bir liste ekleyen program yazin

        String[] array1=new String[5];
        System.out.println("Array1 referansi =" +array1); // [Ljava.lang.String;@566776ad
        System.out.println("array1 =" + Arrays.toString(array1)); //[null, null, null, null, null]
        array1[0]="John";
        array1[1]="Brad";
        array1[2]="Angel";
        array1[3]="Sofia";
        array1[4]="Emily";
        String[] array2={"sofia","brad","grace","emily","hazel"};
        System.out.println("array2 =" + Arrays.toString(array2)); // [sofia, brad, grace, emily, hazel]

        ortakelemanlar(array1,array2);

    }

    private static void ortakelemanlar(String[] arr1, String[] arr2) {
        ArrayList<String> arrList=new ArrayList<>();
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr2.length ; j++) {
                if(arr1[i].equalsIgnoreCase(arr2[j])) {arrList.add(arr1[i]);} // İçine olup olmadığı
            }
        }
        System.out.println(arrList); //[Brad, Sofia, Emily]
    }
}
