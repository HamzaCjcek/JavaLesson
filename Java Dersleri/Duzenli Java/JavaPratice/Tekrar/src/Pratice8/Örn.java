package Pratice8;

import java.util.Arrays;

public class Örn {
    public static void main(String[] args) {
        String[][] food={{"steak","hot","dog","cheeseburger"},
                {"pizza","pasta"},{"sushi","ramen","fried rice","dumolings"},
                {"kebab","mantı"},{"beriyani","mazal","curry","chicken tikka masalla"}};
        String[] countries={"Abd","Russia","Chine","Turkey","Egypt"};
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print((countries[i])+"\n"+Arrays.toString(food[i])+"\n");
            }
        }
    }
}
