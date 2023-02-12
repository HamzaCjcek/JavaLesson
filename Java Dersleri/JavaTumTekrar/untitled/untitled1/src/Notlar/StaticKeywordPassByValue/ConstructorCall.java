package Notlar.StaticKeywordPassByValue;

public class ConstructorCall {  // 4.satirdaki variable istance variable'dir eğer static yazsaydı statik variable olucaktı
        String isim="John Doe";  // İnstance ya da static variablelara değer atasakta olur atamasakta
        int yas=40;

        public ConstructorCall() // 8.daki Constructor 'dır local variable'dır
        {
            String isim="Olcay"; // local variabler değer atanmayabilir ama kullanılamaz
            System.out.println("İsim :" + isim);
        }
        public ConstructorCall(String isim) // Class ismi ile tamamen aynı isimde olmalı return type olmucak o zaman Constructor'dır
        {
            this.yas=30;
            System.out.println("İsim :" + isim);
        }
        public ConstructorCall(String isim,int yas) // 17.satirdaki isim variable local variable'dır
        {
            this("Murat");
            this.yas=45;
        }
        public void ConstructorCall() // Void olduğu için Constructor değildir Method
        {
            System.out.println(isim);
        }

    public static void main(String[] args) {
        ConstructorCall obj1=new ConstructorCall("Esra");
    }
}

