import java.util.ArrayList;
import java.util.List;

class Tehing {
    private String saajaKonto;
    private double summa;

    public Tehing(String saajaKonto, double summa) {
        this.saajaKonto = saajaKonto;
        this.summa = summa;
    }

    public String getSaajaKonto() {
        return saajaKonto;
    }

    public double getSumma() {
        return summa;
    }
}