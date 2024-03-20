import java.util.List;

public class KliendiAndmebaas {
    private List<Klient> kliendid;

    public KliendiAndmebaas(List<Klient> kliendid) {
        this.kliendid = kliendid;
    }
    public List<Klient> getKliendid(){
        return kliendid;
    }
    public void väljastaAruanne(){
        for (Klient klient : this.getKliendid()){
            System.out.println("klient: " + klient.getNimi() + " ja saldo " + klient.getSaldo());
        }
    }
}
