/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;
import java.util.Scanner;
/**
 *
 * @author Fatma KADRI
 */

// Exercice 01 :
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    // Exercice 02 :
    
    System.out.println("Please enter the operator:");
    System.out.println("1)add");
    System.out.println("2)substract");
    System.out.println("3)multiply");
    System.out.println("4)divide");
    System.out.println("5)modulo");

    
    // Exercice 03 :
    Scanner sc = new Scanner(System.in);
    int operator  = sc.nextInt();
    
    // Exercice 07 : 
    if (operator < 1 || operator > 5) { 
        System.out.println("Error: operator invalid."); 
        System.exit(0); }
    
    // Exercice 04 :
    System.out.println("Veillez saisir une premiere valeur :");
    int operande1 = sc.nextInt();
    
    // Exercice 05 :
    System.out.println("Veillez saisir une deuxieme valeur :");
    int operande2 = sc.nextInt();
    
    // Exercice 06 :
    int res = 0;
    
    switch (operator) {

            case 1:
                res = operande1 + operande2;
                break;

            case 2:
                res = operande1 - operande2;
                break;

            case 3:
                res = operande1 * operande2;
                break;

            case 4:
                res = operande1 / operande2;
                break;

            case 5:
                res = operande1 % operande2;
                break;

            default:
                System.out.println("Error: operator invalid.");
                return;
        }

        // Affichage du resultat
        System.out.println("The result is : " + res);
    }
}