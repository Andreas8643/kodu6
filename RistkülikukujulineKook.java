import java.time.LocalDate;

public class RistkülikukujulineKook extends Kook{
    private double pikk;
    private double lai;

    public RistkülikukujulineKook(String nimi, LocalDate kuup, double hind, double pikk, double lai) {
        super(nimi, kuup, hind);
        this.pikk = pikk;
        this.lai = lai;
    }
    public double pindala(){
        return pikk * lai;
    }
}
