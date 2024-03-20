public class Auto {
    private String omanik;
    private String mudel;
    private boolean elekter;

    public Auto(String omanik, String mudel, boolean elekter) {
        this.omanik = omanik;
        this.mudel = mudel;
        this.elekter = elekter;
    }
    public double arvutaParanduseMaksumus(double a){
        if(elekter){
            return 36 * a;
        }
        return 40 * a;
    }
    public String autoliik(){
        return "Sõiduauto";
    }
    @Override
    public String toString(){
        return autoliik().toString() + ". Mudel: " + mudel + ". Omanik: " + omanik;
    }
}
