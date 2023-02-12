package Pratice7;

public class İkiBoyutluDiziler {
    public static void main(String[] args) {
        String[][] food={{"steak","hot","dog","cheeseburger"},
                {"pizza","pasta"},{"sushi","ramen","fried rice","dumolings"},
                {"kebab","mantı"},{"beriyani","mazal","curry","chicken tikka masalla"}};
        String[] countries={"Abd","Russia","Chine","Turkey","Egypt"};
        for (int i = 0; i < food.length ; i++) {
            System.out.println(countries[i]);
            for (int j = 0; j < food[i].length; j++) {
                System.out.println(food[i][j]);
            }
            System.out.println("------------");
        }
            
        
    }
}

