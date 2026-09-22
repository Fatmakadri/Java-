/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo2;

import java.util.Scanner;

/**
 *
 * @author Fatma KADRI
 */

/*
 * Partie 2 : Addition d'entiers
 */
public class Exo2 {

    public static void main(String[] args) {

        // Declaration des variables
        int nb;       // nombre d'entiers a additionner
        int result;   // resultat
        int ind;      // indice

        // Creation du Scanner
        Scanner sc = new Scanner(System.in);

        // Demande du nombre d'entiers a additionner
        System.out.println("\nEntrer le nombre :");
        nb = sc.nextInt();

        // Initialisation du resultat
        result = 0;

        // Addition des nb premiers entiers
        ind = 1;

        while (ind <= nb) {
            result = result + ind;
            ind++;
        }

        // Affichage du resultat
        System.out.println();
        System.out.println("La somme des " + nb
                + " entiers est : " + result);

        // Fermeture du Scanner
        sc.close();
    }
}

