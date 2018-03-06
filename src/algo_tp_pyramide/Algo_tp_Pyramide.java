/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo_tp_pyramide;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author niko
 */
public class Algo_tp_Pyramide {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Création de scanner de l'entrée standard
        Scanner sc = new Scanner(System.in);
        //Verfi type entier
        if(sc.hasNextInt()) {
            int hauteur = sc.nextInt();
            //traitement pour faire pyramide
                for (int haut=0;haut<=hauteur;haut++) 
                //boucle de hauteur
                {
                    for (int espace=0;espace<hauteur-haut;espace++)
                    //boucle des espaces
                    {
                        System.out.print(" ");
                    }
                    for (int etoile=0;etoile<=2*haut;etoile++)
                    //boucle des etoiles
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                //System.out.println();
        }
        // TODO code application logic here
    }
    
}
