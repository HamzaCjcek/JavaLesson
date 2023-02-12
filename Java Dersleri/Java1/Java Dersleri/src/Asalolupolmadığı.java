public class Asalolupolmadığı {
    public static void main(String[] args) {
        int input=33;
        int sayac=1;
        for (int i = 2; i <=input ; i++) {
              if (input%i==0)
              {
                  sayac++;
              }
              if (sayac==2)
              {
                  System.out.println("Sayı Asal");
                  break;
              }
              else
              {
                  System.out.println("Asal Değil");
                  break;
              }
        }
    }
}
