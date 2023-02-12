public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(5);
        String x="tyler durden";
        System.out.println(x);
        String xyz="abcdefgh";
        System.out.println("XYZ değişkenin karakter sayisi :" + xyz.length());
        System.out.println("XYZ değişkenin büyük harfe almak :" + xyz.toUpperCase());
        System.out.println("XYZ değişkenin büyük harfe almak :" + xyz.toLowerCase());
        System.out.println(xyz.indexOf("d"));
        String isim="Hamza";
        String soyisim="Çiçek";
        System.out.println(isim.concat(soyisim)); // isim + soyisim
        int randomNum = (int)(Math.random() * 101); //Random sayı üretimi
        System.out.println(randomNum);

        int day=4;
        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thurday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println(day);
        }
        int z=1;
        do {
            System.out.println(z);
            z++;

        }
        while (z<10);

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        cars2[0] = "Opel";
        System.out.println(cars2[0]);
    }
}
