import java.util.Random;

public class AutodeParandamine {
    public static void main(String[] args) {
        Autoteenindus autoteenindus = new Autoteenindus();

        Auto soiduauto = new Auto("Peeter Paanika", "Audi A4 Avant", false);
        Veoauto veoauto = new Veoauto("Jaak Joosep", "Volvo FH16", false, true);
        Luksusauto luksusauto = new Luksusauto("Mari Maasikas", "Rolls-Royce Phantom", false, 50);
        Limusiin limusiin = new Limusiin("Jüri Juurikas", "Mercedes-Benz S-Class", true, 80);

        Random random = new Random();

        autoteenindus.paranda(soiduauto, (int) (random.nextInt(20) + 1 / 2.0));
        autoteenindus.paranda(veoauto, (int) (random.nextInt(20) + 1 / 2.0));
        autoteenindus.paranda(luksusauto, (int) (random.nextInt(20) + 1 / 2.0));
        autoteenindus.paranda(limusiin, (int) (random.nextInt(20) + 1 / 2.0));

        System.out.println(autoteenindus.toString());
    }
}
