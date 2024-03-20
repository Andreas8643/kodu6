public class Veoauto extends Auto{
    private boolean isik;

    public Veoauto(String omanik, String mudel, boolean elekter, boolean isik) {
        super(omanik, mudel, elekter);
        this.isik = isik;
    }
    public double arvutaParanduseMaksumus(int a){
        if(isik){
            return super.arvutaParanduseMaksumus(a) * 2;
        }
        return super.arvutaParanduseMaksumus(a) * 3;
    }
    public String autoliik(){
        return "Veoauto";
    }
}
