public class üksKomaSeitse extends üks{
    private int komad;

    public üksKomaSeitse(int komad) {
        super("Komakohaga arv");
        this.komad = komad;
    }
    @Override
    public String misMaOlen(){
        return "väike number, aga suurem";
    }

}
