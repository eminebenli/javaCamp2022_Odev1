public class Main {
    public static void main(String[] args) {
        //bug:Bocek
        int number=1;
        int remainder=number % 2; //remainder:Kalan
        //System.out.println(remainder);
        boolean isPrime=true; //isPrime:Asal mı?

        if(number==1){
            System.out.println("Sayı asal değildir"); //bunu eklemediğimizde 1'i asal olarak kabul etti.
            return;                                   //mantıksal hata bug vardı düzeltildi.
        }

        if(number<1){
            System.out.println("Geçersiz sayı");
        }

        for (int i=2; i<number; i++){
            if(number % i == 0){
                isPrime=false;
            }
        }

        if(isPrime){
            System.out.println("Sayı asaldır");
        }else{
            System.out.println("Sayı asal değildir");
        }


    }
}