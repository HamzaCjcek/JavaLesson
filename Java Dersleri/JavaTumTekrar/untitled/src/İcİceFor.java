public class İcİceFor {
    public static void main(String[] args) {
        //Aşağıdaki programda, dış döngü olan a parametreli döngü 5 kez çalışıyor
        // (a=1, 2, 3, 4, 5). a’nın her değeri içinse içteki döngü 3 kez çalışıyor
        // (i=1, 2, 3). Böylece aşağıdaki çıktı elde ediliyor:
        for (int i = 1; i <=5 ; i++) {
            System.out.println("i ="+i);
            for (int j = 1; j <=3 ; j++) {
                System.out.println("j ="+j);
            }
            System.out.println();
        }
        //Çarpım Tablosu

        int altcizgi;
        System.out.println("1 2 3 4 5 6 7 8 9 10");
        for (altcizgi=1;  altcizgi<=50 ; altcizgi++) {
            System.out.print("_");
        }
        System.out.println();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i + "|");
            for (int j = 1; j <=10 ; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }
}
