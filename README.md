# Java-

// Partie 1 : Affichage d'un message
public class Exercice1 {

    public static void main(String[] args) {

        // Création du Scanner
        Scanner sc = new Scanner(System.in);

        // Affichage du message de bienvenue
        System.out.println("Bonjour");

        // Demande du prénom
        System.out.println("Bonjour, quel est votre prenom ?");
        String prenom = sc.nextLine();

        // Message personnalisé
        System.out.println("Bonjour " + prenom + " !");

        // Message d'au revoir
        System.out.println("Au revoir " + prenom + " !");

        // Fermeture du Scanner
        sc.close();
    }
}
