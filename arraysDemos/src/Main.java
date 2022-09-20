public class Main {
    public static void main(String[] args) {
        String ogrenci1="Mehmet";
        String ogrenci2="Derin";
        String ogrenci3="Dilek";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        //teker teker yazmak yerinde array oluşturmak kolaylık sağlar.
        //Arrays-Diziler

        String[] ogrenciler=new String[3];
        ogrenciler[0]="Mehmet";
        ogrenciler[1]="Derin";
        ogrenciler[2]="Dilek";

        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("------------------------");
        for(String ogrenci:ogrenciler){ //ogrenciler dizisindeki her bir elemanı kes.
            System.out.println(ogrenci);
        }

    }
}