
package esprit.groupe.pkg2cinfo2;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Methodes {
  // Attributs
    private static final int MAX_VALUE = Integer.MAX_VALUE;

    // Méthodes
    public static int sommeTableau(int[] nombres) {
        int somme = 0;
        for (int nombre : nombres) {
            somme += nombre;
        }
        return somme;
    }

    public static double moyenneTableau(int[] nombres) {
        return (double) sommeTableau(nombres) / nombres.length;
    }

    public static int factorielle(int nombre) {
        if (nombre < 0 || nombre > MAX_VALUE) {
            throw new IllegalArgumentException("Valeur invalide pour la factorielle");
        }
        int factorielle = 1;
        for (int i = 1; i <= nombre; i++) {
            factorielle *= i;
        }

                return factorielle;
    }

    public static boolean estPair(int nombre) {
    return nombre % 2 == 0;
}

public static boolean estPremier(int nombre) {
    if (nombre <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(nombre); i++) {
        if (nombre % i == 0) {
            return false;
        }
    }
    return true;
}

    public static String inverserChaine(String str) {
//        StringBuilder sb = new StringBuilder(chaine);
//        return sb.reverse().toString();

        return IntStream.range(0, str.length())
                .mapToObj(i -> str.charAt(str.length() - i - 1))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
