/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionmagasin;

/**
 *
 * @author admin
 */
public class Produit {
    private int id;
    private String nom;
    private double prix;
    private int quantite;
    
    public Produit(int id , String nom, double prix , int quantite){
        this.id=id;
        this.nom=nom;
        this.prix = prix;
        this.quantite= quantite;
    }
    
    public int getId(){
        return id;
    }
    
    public String getNom(){
        return nom;
    }
    
    public double getPrix(){
        return prix;
    }
    
    public int getQuantite(){
        return quantite;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public void setPrix(int prix){
        this.prix = prix;
    }
    
    public void setQuantite(int quantite){
        this.quantite = quantite;
    }
    
    public void afficherDetails(){
        System.out.println("L identifiant : " + getId());
        System.out.println("Le nom : " + getNom());
        System.out.println("le prix : " + getPrix());
        System.out.println("La quantite : " + getQuantite());
    }
    
}
