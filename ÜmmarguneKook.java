import java.time.LocalDate;

public class ÜmmarguneKook extends Kook{
    private double raadius;

    public ÜmmarguneKook(String nimi, LocalDate kuup, double hind, double raadius) {
        super(nimi, kuup, hind);
        this.raadius = raadius;
    }
    public double pindala(){
        return Math.PI * (raadius * raadius);
    }
}
