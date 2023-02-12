public class Array2 {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8,9,2,2,4,5,6,7};
        int aranansayi=2;
        elemanBUl(arr,aranansayi);
    }
    public static void elemanBUl(int[] arr,int aranansayi)
    {
        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==aranansayi) {
                sayac++;
            }
        }
        System.out.println(sayac);
    }
}
