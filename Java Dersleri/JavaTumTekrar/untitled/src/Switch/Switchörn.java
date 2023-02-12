package Switch;

import java.util.Scanner;

public class Switchörn {
    public static void main(String[] args) {
        int x=1;
        switch (x)
        {
            case 1:
                System.out.println("Pazartersi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            default:
                System.out.println("Öyle gün yok");
                break;
        }
        //Soru 4- Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
        //ve girilen harfin karsiligini yazdirin.
        //I : International S : Software T : Testing Q : Qualifications B: Board

        Scanner scan=new Scanner(System.in);
        String a= scan.nextLine();
        char b=a.charAt(0);
        switch (b)
        {
            case 'I':
                case 'i':
                    System.out.println("International");
                    break;
            case 'S':
            case 's':
                System.out.println("Software");
                break;
            case 'T':
            case 't':
                System.out.println("Testing");
                break;
            case 'Q':
            case 'q':
                System.out.println("Qualifications");
                break;
            case 'B':
            case 'b':
                System.out.println("Board");
                break;
            default:
                System.out.println("Bunlardan hiçbiri değil");
                break;
        }
    }
}
