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
public class Commande {
    private static int cpt = 1;

    private int idCommande;
    private Client client;
    private List<Produit> produitsCommandes;
    private double total;

    public Commande(Client client, List<Produit> produitsPanier) {
        this.idCommande = cpt++;
        this.client = client;
        this.produitsCommandes = new ArrayList<>();
        this.total = 0;
        for (Produit p : produitsPanier) {
            this.produitsCommandes.add(new Produit(p.getId(), p.getNom(), p.getPrix(), p.getQuantite()));
            this.total += p.getPrix() * p.getQuantite();
        }
    }

    public int getIdCommande(){
        return idCommande; 
    }
    
    public Client getClient(){
        return client; 
    }
    
    public List<Produit> getProduitsCommandes(){
        return produitsCommandes; 
    }
    
    public double getTotal(){
        return total; 
    }

    public void afficherDetailsCommande() {
        System.out.println(" Commande n°" + idCommande );
        client.afficherDetails();
        System.out.println("Produits commandés :");
        for (Produit p : produitsCommandes) {
            p.afficherDetails();
        }
        System.out.println("Total à payer : " + total + " €");
    }    
}
