public class Autoteenindus {
    private int parandatud;
    private double tulu;
    public Autoteenindus(){
        this.parandatud = 0;
        this.tulu = 0;
    }

    public void paranda(Auto a, int b) {
        System.out.println(a.arvutaParanduseMaksumus(b));
        tulu += a.arvutaParanduseMaksumus(b);
        parandatud++;
    }
    @Override
    public String toString(){
        return "Parandatud autosid: " + parandatud + " ja teenitud tulu: " + tulu;
    }


}
