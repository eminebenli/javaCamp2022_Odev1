public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //degisken isimlendirmeleri java'da camelCase yazilir
        String ortaMetin = "İlginizi çekebilir";
        String altMetin="Vade süresi";

        System.out.println(ortaMetin);
        System.out.println(altMetin);

        int vade = 12;
        double dolarDun = 18.20;
        double dolarBugun= 18.20;

        boolean dolarDustuMu = false; //or true

        String okYonu="";

        if (dolarBugun<dolarDun) { //false
            okYonu="down.svg";
            System.out.println(okYonu);
        } else if(dolarBugun>dolarDun)
        {
            okYonu="up.svg";
            System.out.println(okYonu);
        }
        else {
            okYonu="equal.svg";
            System.out.println(okYonu);

        }

        //array
        String[] krediler = {"Hızlı Kredi", "Maaşını Halkbantan","Mutlu Emekli"};


        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }
    }

}