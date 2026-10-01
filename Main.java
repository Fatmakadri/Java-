package gestionmagasin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Client c1 = new Client(1, "kadri", "fatma@gmail.com");
        Produit p1 = new Produit(1, "pomme", 1.99, 50);
        Produit p2 = new Produit(2, "orange", 2.40, 100);
        Produit p3 = new Produit(3, "cerise", 3.99, 75);

        Magasin m1 = new Magasin();
        m1.ajouterProduit(p1);
        m1.ajouterProduit(p2);
        m1.ajouterProduit(p3);

        Panier P = new Panier();

        Scanner sc = new Scanner(System.in);
        int i;

        do {
            System.out.println("\n--- Menu Magasin ---");
            System.out.println("1. Afficher les produits disponibles");
            System.out.println("2. Ajouter un produit au panier");
            System.out.println("3. Afficher le panier");
            System.out.println("4. Passer la commande");
            System.out.println("5. Quitter");
            System.out.print("Votre choix : ");
            i = sc.nextInt();

            switch (i) {
                case 1:
                    m1.afficherProduitsDisponibles();
                    break;

                case 2: {
                    System.out.print("Nom du produit : ");
                    String nom = sc.next();
                    Produit p = m1.trouverProduitParNom(nom);
                    if (p == null) {
                        System.out.println("Produit introuvable.");
                    } else {
                        System.out.print("Quantité : ");
                        int qte = sc.nextInt();
                        if (qte > 0 && qte <= p.getQuantite()) {
                            P.ajouterProduit(new Produit(p.getId(), p.getNom(), p.getPrix(), qte));
                            System.out.println("Produit ajouté au panier.");
                        } else {
                            System.out.println("Quantité indisponible.");
                        }
                    }
                    break;
                }

                case 3:
                    P.afficherPanier();
                    break;

                case 4: {
                    if (P.getProduits().isEmpty()) {
                        System.out.println("Le panier est vide.");
                    } else {
                        Commande commande = new Commande(c1, P.getProduits());
                        commande.afficherDetailsCommande();
                        P.getProduits().clear();
                    }
                    break;
                }

                case 5:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide.");
            }

        } while (i != 5);

        sc.close();
    }
}