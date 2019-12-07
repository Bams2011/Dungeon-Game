/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import UI.DungeonUI;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author noname
 */
public class Game {
    
    

    public static void main(String[] args) {
        long milllisecondes = System.currentTimeMillis();
        long seed = 0;
        int largeurMin=30;
        int largeurMax=70;
        int longeurMin=8;
        int longeurMax=16;
        int [][] tableau;

        System.out.println("voulez entrer un seed");
        Scanner scanner = new Scanner(System.in);
        String reponse = scanner.nextLine();
        if(reponse.equals("oui")){

            System.out.println("entrer votre seed");
            seed = scanner.nextLong();

        }
        else if (reponse.equals("non")){
            seed = milllisecondes;
            System.out.println("votre seed est "+seed );
        }
        
        DungeonUI gui = new DungeonUI();
        gui.DrawGui();
         gui.setVisible(true);
        /*Random  r=new Random(seed);
        Random  g=new Random();
        int hauteur=longeurMin + r.nextInt(longeurMax - longeurMin);
        int larg=largeurMin+ r.nextInt(largeurMax-largeurMin);
        tableau = new int[hauteur][larg];
        for (int i = 0; i<tableau.length;i++){
            for (int j = 0;j<tableau[i].length;j++){
                tableau[i][j]= 1+g.nextInt(10-1);

            }
        }
        for (int i = 0; i<tableau.length;i++){// AFFICHAGE DU TABLEAU
            for (int j = 0;j<tableau[i].length;j++){
                if (i==2 && j==2){
                    System.out.print("\u001b[35m\u263A");//PERSONNAGE
                } else if (tableau[i][j]==1) {
                    System.out.print("\u001b[33m\u25CB");//OBSTACLE
                } else if (tableau[i][j]>1 &&tableau[i][j]<11) {
                    System.out.print("\u001b[31m\u25B2");//TRESOR

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/


    }

}

