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
public class Panier {
    private List<Produit> produits;
    
    public Panier() {
        this.produits = new ArrayList<>();
    }
    
    public List<Produit> getProduits() {
        return produits;
    }
    
    public void ajouterProduit(Produit produit){
        produits.add(produit);
    }
    
    public void supprimerProduit(Produit produit){
        produits.remove(produit);
    }
    
    public void afficherPanier() {
        if (produits.isEmpty()) {
            System.out.println("Le panier est vide.");
            return;
        }
        System.out.println("Contenu du panier");
        for (Produit p : produits) {
            p.afficherDetails();
        }
        System.out.println("Total : " + calculerTotal() + " €");
    }
    
    public double calculerTotal() {
        double total = 0;
        for (Produit p : produits) {
            total += p.getPrix() * p.getQuantite();
        }
        return total;
    }
}
