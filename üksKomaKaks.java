public class üksKomaKaks extends üks{
    private int komad;

    public üksKomaKaks(int komad) {
        super("Komakohaga arv");
        this.komad = komad;
    }
    @Override
    public String misMaOlen(){
        return "väike number, aga suurem";
    }

}
