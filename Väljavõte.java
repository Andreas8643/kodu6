abstract class Väljavõte {
    protected Klient klient;

    public Väljavõte(Klient klient) {
        this.klient = klient;
    }
    public abstract  void lisaVäljavõttesse(String saaja, double summ);
    public void arvuta(){
        for(Tehing tehing : klient.getTehingud()){
            lisaVäljavõttesse(tehing.getSaajaKonto(), tehing.getSumma());
        }
    }
}
