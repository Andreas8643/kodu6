import java.time.LocalDate;

abstract public class Kook {
    private String nimi;
    private LocalDate kuup;
    private double hind;

    public Kook(String nimi, LocalDate kuup, double hind) {
        if(nimi.isEmpty()){
            this.nimi = "The cake is a lie";
        }
        else {
            this.nimi = nimi;
        }
        this.kuup = kuup;
        this.hind = hind;
    }
    abstract double pindala();
    public double koogiHind(){
        return Math.round(hind * pindala() * 100) / 100;
    }

    public int compareTo(Kook kook){
        return this.kuup.compareTo(kook.kuup);
    }
    @Override
    public String toString(){
        return "Koogi nimi on " + nimi + " hind " + koogiHind() + " ja parim enne: " + kuup;
    }
}
