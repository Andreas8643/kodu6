import java.util.List;

public class Klient {
    private String nimi;
    private double saldo;
    private List<Tehing> tehingud;

    public String getNimi() {
        return nimi;
    }

    public double getSaldo() {
        return saldo;
    }


    public Klient(String nimi, double saldo, List<Tehing> tehingud) {
        this.nimi = nimi;
        this.saldo = saldo;
        this.tehingud = tehingud;
    }
    public List<Tehing> getTehingud(){
        return tehingud;
    }
}
