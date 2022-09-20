public class Main {
    public static void main(String[] args) {
        int ogrenciSayisi=12;
        String mesaj="Öğrenci sayısı :";
        System.out.println(mesaj + ogrenciSayisi); //*

        System.out.println("Öğrenci sayısı :"+ogrenciSayisi);
        System.out.println("Öğrenci sayısı :"+ogrenciSayisi);
        System.out.println(mesaj+ogrenciSayisi);

        System.out.println("Öğrenci sayısı:9");
        //Bu şekilde yazmak yerinde değişken tanımlayıp '*' burada olduğu gibi kolaylık sağlarız.
        //int ogrenciSayisi=12; burada camelCase kuralı geçerlidir. ilk harf küçük olup, ikinci harf büyük olur.

    }
}