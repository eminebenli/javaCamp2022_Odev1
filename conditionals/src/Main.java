public class Main {
    public static void main(String[] args) {

        int sayi=25;
        if(sayi<20){
            System.out.println("Sayı 20'den küçüktür.");
        }
        else {
            System.out.println("Sayı 20'den küçük değil.");
        }

        //if-else if
        //Tek satır yazmada scope kaldırılabilir.
        if(sayi<20)
            System.out.println("Sayı 20 den küçüktür.");
        else if(sayi==20)
            System.out.println("Sayı 20'ye eşittir.");
        else
            System.out.println("Sayı 20'den büyüktür.");
    }
}