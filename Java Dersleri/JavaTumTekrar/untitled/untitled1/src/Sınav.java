public class Sınav {

    int x = 1;

    static int y;

    Sınav(int i){

        x = x + i;

        y = y + i;

    }

    public static void main(String[] args) {

        Sınav obj1 = new Sınav(5);

        System.out.println(obj1.x + ", " + obj1.y);

        Sınav obj2 = new Sınav(7);

        System.out.println(obj2.x + ", " + obj2.y);

    }
}

