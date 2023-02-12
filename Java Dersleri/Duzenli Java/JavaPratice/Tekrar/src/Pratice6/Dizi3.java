package Pratice6;

public class Dizi3 {
    public static void main(String[] args) {
        int somun[]={1,2,3,4,5,6,7,8,9};
        int civata[]={3,6,5,7,79,9,3,1,33};
        for (int i = 0; i < somun.length ; i++) {
            for (int j = 0; j < civata.length ; j++) {
                if(somun[i]==civata[j])
                {
                    System.out.println("Somun sayisi :" + somun[i] + " Civata sayisi :" + civata[j]);
                }
            }
        }
    }
}
