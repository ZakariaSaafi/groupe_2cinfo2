
package esprit.groupe.pkg2cinfo2;

public class EspritGroupe2cinfo2 {

    public static void main(String[] args) {
        int[] nombres = {1, 2, 3, 4, 5};

        System.out.println("Somme du tableau : " + Methodes.sommeTableau(nombres));
        System.out.println("Moyenne du tableau : " + Methodes.moyenneTableau(nombres));
        System.out.println("Factorielle de 5 : " + Methodes.factorielle(5));
        System.out.println("Le nombre 10 est-il pair ? " + Methodes.estPair(10));
        System.out.println("Le nombre 13 est-il premier ? " + Methodes.estPremier(13));
        System.out.println("Chaîne inversée : " + Methodes.inverserChaine("Bonjour"));
    }
    
}
