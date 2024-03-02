
package esprit.groupe.pkg2cinfo2;

public class EspritGroupe2cinfo2 {

    public static void main(String[] args) {
        int[] nombres = {1, 2, 3, 4, 5};
        int nombre1 = 48;
        int nombre2 = 18;
        String chaine = "exemple de chaîne en minuscules";

        System.out.println("Somme du tableau : " + Methodes.sommeTableau(nombres));
        System.out.println("Moyenne du tableau : " + Methodes.moyenneTableau(nombres));
        System.out.println("Factorielle de 5 : " + Methodes.factorielle(5));
        System.out.println("Le nombre 10 est-il pair ? " + Methodes.estPair(10));
        System.out.println("Le nombre 13 est-il premier ? " + Methodes.estPremier(13));
        System.out.println("Chaîne inversée : " + Methodes.inverserChaine("Bonjour"));

        System.out.println("3 a la puissance 5 est: " + Methodes.calculerPuissance(3,5));
        System.out.println("Le PGCD de " + nombre1 + " et " + nombre2 + " est : " + Methodes.calculerPGCD(nombre1, nombre2));
        System.out.println("Chaîne en majuscules : " + Methodes.convertToUpperCase(chaine));

        System.out.println("Le nombre maximale du tableau  : " + Methodes.MaxElementInArray(nombres));
        Methodes.sortIntArray(nombres);
        System.out.println("Le tableau trier  : " + nombres);
        System.out.println("Le racine carré de 9 : " + Methodes.calculateSquareRoot(9));


    }
    
}
