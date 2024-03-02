package esprit.groupe.pkg2cinfo2;

public class HelmiBacha {
    public static int calculerPuissance(int base, int exposant) {
        int resultat = 1;

        // Si l'exposant est négatif, on prend l'inverse de la base
        if (exposant < 0) {
            base = 1/ base;
            exposant = -exposant;
        }

        for (int i = 0; i < exposant; i++) {
            resultat *= base;
        }

        return resultat;
    }
}
