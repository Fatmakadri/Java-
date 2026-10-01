/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionmagasin;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author admin
 */
public class Magasin {
    private List<Produit> produits;

    public Magasin() {
        this.produits = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    public void afficherProduitsDisponibles() {
        System.out.println("Les produits disponibles sont : ");
        for (Produit p : produits) {
            if (p.getQuantite() > 0) {
                p.afficherDetails();
            }
        }
    }

    public Produit trouverProduitParNom(String nom) {
        for (Produit p : produits) {
            if (p.getNom().equalsIgnoreCase(nom)) {
                return p;
            }
        }
        return null;
    }
}
