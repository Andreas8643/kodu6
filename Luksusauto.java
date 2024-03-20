public class Luksusauto extends Auto{
    private int toodetud;

    public Luksusauto(String omanik, String mudel, boolean elekter, int toodetud) {
        super(omanik, mudel, elekter);
        this.toodetud = toodetud;
    }
    public double arvutaParanduseMaksumus(int a){
        if(toodetud > 70){
            return super.arvutaParanduseMaksumus(a) * 15;
        }
        else {
            return super.arvutaParanduseMaksumus(a) * 10;
        }
    }
    public String autoliik(){
        return "Luksusauto";
    }
}
