public class Main {
    public static void main(String[] args) {
        String mesaj = "    Bugün hava çok güzel.  ";
        System.out.println(mesaj);

        /*System.out.println("Eleman sayısı : " + mesaj.length());
        System.out.println("5.eleman : " + mesaj.charAt(4)); //charAt n.elemanı alır.
        System.out.println(mesaj.concat("Yaşasın!")); //concat birleştirir.
        System.out.println(mesaj.startsWith("B")); //B ile başladığı için true döndürür.
        System.out.println(mesaj.endsWith(".")); //"." ile bittiği için true döndürür.

        char[] karakterler=new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        //srcBegin: nerden başlatmak istersek 0-5 arası
        //srcEnd: Bitiş index(son 5 aktif değil)
        //dstBegin: destination atanan karakterleri kaçtan 0 indexden itibaren aktar.
        System.out.println(mesaj.indexOf("av")); //baştan ilk av bulur.
        System.out.println(mesaj.lastIndexOf("e")); //soldan ilk e'yi bulur.*/

        System.out.println(mesaj.replace(" ", "-")); //değiştirmek boşluk olan yerlere - geldi.
        //yada bunu şu şekilde yazdıralım
        String yeniMesaj = mesaj.replace(" ", "-");
        System.out.println(yeniMesaj);

        //substring
        System.out.println(mesaj.substring(2)); //çıktı: gün hava çok güzel 2.indexden keser.
        System.out.println(mesaj.substring(2, 5)); //çıktı: gün  2.indexden keser 5.indexe kadar.

        //split:keser
        for (String kelime : mesaj.split(" ")) { //boşluğa göre
            System.out.println(kelime);
        }

        //toLowerCase-toUpperCase
        System.out.println(mesaj.toLowerCase()); //küçük harfe çevirir.
        System.out.println(mesaj.toUpperCase()); //büyük harfe çevirir.

        //trim
        System.out.println(mesaj.trim());
        /*ornek için mesajın başına ve sonuna boşluk ekle sonra trim fonskiyonunu çalıştır.
        String mesaj = "    Bugün hava çok güzel.  ";
        çıktı: Bugün hava çok güzel. --baş ve sondaki boşlukları keser.*/
    }
}