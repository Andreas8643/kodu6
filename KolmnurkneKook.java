import java.time.LocalDate;

public class KolmnurkneKook extends Kook{
    public double a;
    public double b;
    public double c;
    private double p;
    public KolmnurkneKook(String nimi, LocalDate kuup, double hind, double a, double b, double c) {
        super(nimi, kuup, hind);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double pindala(){
        p = (a+b+c)/2;
        return Math.sqrt(p*(p-1)*(p-b)*(p-c));
    }
}
