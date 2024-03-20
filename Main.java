import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Tehing> tehingud1 = new ArrayList<>();
        tehingud1.add(new Tehing("Konto1", 5000));
        tehingud1.add(new Tehing("Konto2", 12000));
        Klient klient1 = new Klient("Klient1", 17000, tehingud1);

        List<Tehing> tehingud2 = new ArrayList<>();
        tehingud2.add(new Tehing("Konto1", 8000));
        tehingud2.add(new Tehing("Konto2", 2000));
        Klient klient2 = new Klient("Klient2", 10000, tehingud2);

        List<Klient> kliendid = List.of(klient1, klient2);
        KliendiAndmebaas andmebaas = new KliendiAndmebaas(kliendid);

        System.out.println("Kõik kliendid:");
        andmebaas.väljastaAruanne();

        RikasteKlientideAndmebaas rikasteAndmebaas = new RikasteKlientideAndmebaas(kliendid);

        System.out.println("\nRikkad kliendid:");
        List<Klient> rikkadKliendid = rikasteAndmebaas.getKliendid();
        for (Klient klient : rikkadKliendid) {
            System.out.println("Klient: " + klient.getSaldo());
        }

        ÜldVäljavõte üldVäljavõte = new ÜldVäljavõte(klient1);
        üldVäljavõte.arvuta();
        System.out.println("\nKlient1 tehingute üldsumma: " + üldVäljavõte.getSumma());

        TäpneVäljavõte täpneVäljavõte = new TäpneVäljavõte(klient2, "Konto1");
        täpneVäljavõte.arvuta();
        System.out.println("Klient2 tehingute summa kontole 'Konto1': " + täpneVäljavõte.getSumma());
    }
}