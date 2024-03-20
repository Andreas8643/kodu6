class TäpneVäljavõte extends Väljavõte {
    private String kontonumber;
    private double summa;

    public TäpneVäljavõte(Klient klient, String kontonumber) {
        super(klient);
        this.kontonumber = kontonumber;
    }

    public double getSumma() {
        return summa;
    }

    @Override
    public void lisaVäljavõttesse(String saajaKonto, double summa) {
        if (saajaKonto.equals(kontonumber)) {
            this.summa += summa;
        }
    }
}