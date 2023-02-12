import java.util.Arrays;

public class İkiboyutluarray {
    public static void main(String[] args) {
        char[][] harfler=new char[3][4]; // 4 elemanlı 3 tane dizi
        harfler[0][0]='A';
        harfler[0][1]='B';
        harfler[0][2]='C';
        harfler[0][3]='D';
        System.out.println(Arrays.deepToString(harfler)); // [[A, B, C, D], [ ,  ,  ,  ], [ ,  ,  ,  ]]
        System.out.println(Arrays.toString(harfler)); // [[C@1d251891, [C@48140564, [C@58ceff1]
        System.out.println(harfler[0]);//ABCD
        System.out.println(Arrays.toString(harfler[0]));

        int [][] sayilar={{10,20,30},{1,2,3},{100,200,300},{15,20,25}};
        System.out.println(Arrays.deepToString(sayilar));

        String[][] food={{"steak","hot dog","cheeseburger"},{"pizza","pasta","canoli"},{"sushi","ramen","fried rice","dumplings"},{"kebab","manto"},{"beriyani","masal","curry","chicken tikka masala"}};
        for (String[] ulkeler:food
             ) {
            for (String yemek:ulkeler
                 ) {
                System.out.println(yemek);
            }
            System.out.println("---------------");
        }
        String[] ulkeler={"american","italian","asian","afghani","indian"};
        for (int i = 0; i <food.length ; i++) {
            System.out.println("---------------"+ ulkeler[i]);
            for (int j = 0; j <food[i].length ; j++) {
                System.out.println(food[i][j]);
            }
        }

        // (do not use toCharArray() method)
        String str="John";
        char[] str2=str.toCharArray();
        System.out.println(Arrays.toString(str2));
        char[] harfler2=new char[str.length()];
        for (int i = 0; i <str.length() ; i++) {
            harfler2[i]=str.charAt(i);
            System.out.println(harfler2);
        }

    }
}
