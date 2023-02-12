import java.util.LinkedList;

public class LinkedListT {


    public static void main(String[] args) {
        LinkedList<String> isimler=new LinkedList<>();
        isimler.add("Hamza");
        isimler.add("Salih");
        isimler.add("Adem");
        isimler.add("Ronaldo");
        System.out.println(isimler);//[Hamza, Salih, Adem, Ronaldo]
        String ilkIsim="Salih";
        String ikincisim="Ronaldo";
        String temp="";
        temp=ilkIsim;
        int ilkIsimİndex= isimler.indexOf(ilkIsim);
        int ikinciIsimİndex= isimler.indexOf(ilkIsim);

        isimler.set(ilkIsimİndex,ikincisim);
        isimler.set(ikinciIsimİndex,ilkIsim);
        System.out.println(isimler);
    }
}
