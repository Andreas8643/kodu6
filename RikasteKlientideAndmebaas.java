import java.util.ArrayList;
import java.util.List;

public class RikasteKlientideAndmebaas extends KliendiAndmebaas{
    public RikasteKlientideAndmebaas(List<Klient> kliendid) {
        super(kliendid);
    }
    @Override
    public List<Klient> getKliendid(){
        List<Klient> rikkadKlienid = new ArrayList<>();
        for(Klient a: super.getKliendid()){
            if(a.getSaldo() > 10000){
                rikkadKlienid.add(a);
            }
        }
        return rikkadKlienid;
    }
}
