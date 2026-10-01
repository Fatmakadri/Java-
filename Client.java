/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionmagasin;

/**
 *
 * @author admin
 */
public class Client {
    private int id;
    private String nom;
    private String email;
    
    public Client(int id , String nom, String email){
        this.id=id;
        this.nom=nom;
        this.email = email;
    }
    
    public int getId(){
        return id;
    }
    
    public String getNom(){
        return nom;
    }
    
    public String getEmail(){
        return email;
    }
    
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void afficherDetails(){
        System.out.println("L identifiant : " + getId());
        System.out.println("Le nom : " + getNom());
        System.out.println("le email : " + getEmail());
    }
}
