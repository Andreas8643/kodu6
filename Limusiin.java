public class Limusiin extends Luksusauto{
    public Limusiin(String omanik, String mudel, boolean elekter, int toodetud) {
        super(omanik, mudel, elekter, toodetud);
    }
    public double arvutaParanduseMaksumus(int a){
        return super.arvutaParanduseMaksumus(a) * 1.5;
    }
    public String autoliik(){
        return "Limusiin";
    }
}
