public class ÜldVäljavõte extends Väljavõte {
    private double summ;

    public ÜldVäljavõte(Klient klient) {
        super(klient);
    }

    @Override
    public void lisaVäljavõttesse(String saaja, double summ) {
        this.summ = summ;
    }

    public double getSumma(){
        return summ;
    }

}
