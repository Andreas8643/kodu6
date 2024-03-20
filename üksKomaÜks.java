public class üksKomaÜks extends üks{
    private int komad;

    public üksKomaÜks(int komad) {
        super("Komakohaga arv");
        this.komad = komad;
    }
    @Override
    public String misMaOlen(){
        return "väike number, aga suurem";
    }


}
