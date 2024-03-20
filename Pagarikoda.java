import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.*;

public class Pagarikoda {
    public static List<Kook> loeKoogid(String fail){
        List<Kook> kook = new ArrayList<>();
        try (Scanner skän = new Scanner(new File(fail))){
            while (skän.hasNextLine()){
                String rida = skän.nextLine();
                if(!rida.isEmpty()){
                    String[] a = rida.split("; ");
                    String nimi = a[0];
                    LocalDate kuup = LocalDate.parse(a[1]);
                    double hind = Double.parseDouble(a[2]);
                    if(a.length == 4){
                        double b = Double.parseDouble(a[3]);
                        kook.add(new ÜmmarguneKook(nimi, kuup, hind, b));
                    } else if (a.length == 5) {
                        double b = Double.parseDouble(a[3]);
                        double c = Double.parseDouble(a[4]);
                        kook.add(new RistkülikukujulineKook(nimi, kuup, hind, b, c));
                    }else {
                        double b = Double.parseDouble(a[3]);
                        double c = Double.parseDouble(a[4]);
                        double d = Double.parseDouble(a[5]);
                        kook.add(new KolmnurkneKook(nimi, kuup, hind, b, c, d));
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return kook;
    }
    public static void main(String[] args){
        List<Kook> k = loeKoogid("koogid.txt");
        for(Kook kook :k);
        System.out.println(k.toString());
    }
}
