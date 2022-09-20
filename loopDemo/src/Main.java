import java.time.Clock;

public class Main {
    public static void main(String[] args) {

        //for
        for(int i=1; i<10; i++ ) {
            System.out.println(i);
        }
        System.out.println(" ");
        for(int i=1; i<=10; i++ ) { //i++ ile i+=1 aynı anlama geliyor.
            System.out.println(i);
        }
        System.out.println(" ");
        for(int i=1; i<=10; i+=2 )//tek sayıları verir 1-10
        {
            System.out.println(i);
        }
        for(int i=0; i<=10; i+=2 )//cift sayıları verir 0-10
        {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");

        //While
        int i=1;
        while(i<10){
            System.out.println(i);
            i++;
        }
        //infinite loop : sonsuz döngü (i++; eklemezsek sonsuz döngüye girer.)
        System.out.println("While Döngüsü Bitti");

        //Do-While
        int j=1;
        do{
            System.out.println(j);
            j+=2;
        } while(j<10);
        System.out.println("Do-While Döngüsü Bitti");

        //Note:Do-While ile While arasındaki fark;
        //While ile şart sağlanmazsa çalışmaz.
        //Do-While ise şart sağlanmazsa bile loglama yapar tek sefer çalışır.
        //örneğin int i=1 yerine 20, int j=2; yerine 20 yazdığımızda biri hiç çalışmaz birinde 20 yi yazdırır.
    }
}