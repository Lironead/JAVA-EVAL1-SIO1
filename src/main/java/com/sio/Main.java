package com.sio;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String GREEN = "\u001B[32m";
    private static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        System.out.println(GREEN);
        System.out.println("#############################################");
        System.out.println("            JAVA EVAL 1 SIO 1 ALT            ");
        System.out.println("#############################################");

        while(true){
            System.out.println("#############################################");
            System.out.println("1. Exercice 1");
            System.out.println("2. Exercice 2");
            System.out.println("3. Exercice 3");
            System.out.println("4. Exercice 4");
            System.out.println("0. Quitter le programme");
            System.out.println("#############################################");
            System.out.print("Entrer votre choix: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 1");
                    System.out.println("---------------------------------------------");
                    //Exercice 1 : Entrer votre code ici
                    System.out.println("Entrer un Nombre: ");
                    double nombre = scanner.nextDouble();
                    System.out.println("Entrer la puissance: ");
                    double puissance = scanner.nextDouble();

                    if (puissance <= 0) {
                        System.out.println("la puissance doit etre superieur ou égal à 0");
                    System.out.println("Entrer la puissance: ");
                    puissance = scanner.nextDouble();}
                        double resultat = Math.pow(nombre, puissance);
                        System.out.println("Le resultat de " + nombre + " puissance " + puissance + " est : " + resultat);





                    System.out.println("---------------------------------------------");
                    break;
                    case 2:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 2");
                    System.out.println("---------------------------------------------");
                    //Exercice 2 : Entrer votre code ici
                        System.out.println("Entrer le nombre de kilometre parcourus par le client: ");
                        double kilometre = scanner.nextDouble();
                        if (kilometre <= 0) {
                            System.out.println("la puissance doit etre superieur ou égal à 0");
                            System.out.println("Entrer le nombre de kilometre parcourus par le client: ");
                            kilometre = scanner.nextDouble();
                        }
                        if (kilometre <= 100) {
                            double infcent = kilometre / 5.0;
                            System.out.println("le montant à payer par le client est " + infcent +" : ");
                            }
                        if (kilometre >=100 && kilometre <= 500) {
                            double sup = kilometre / 2.0;
                            System.out.println("Le montant à payer par le client est " + sup + " : ");
                        }
                        if (kilometre > 500) {
                            double supcinq = kilometre * 0.8;
                            System.out.println("Le montant à payer par le client est " + supcinq + " : ");
                        }






                    System.out.println("---------------------------------------------");
                    break;
                case 3:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 3");
                    System.out.println("---------------------------------------------");
                    //Exercice 3 : Entrer votre code ici
                    System.out.println("Entrer la largeur du rectangle :");
                    int largeur = scanner.nextInt();
                    if (largeur <= 0) {
                        System.out.println("la largeur doit etre superieur à 0 ");
                        System.out.println("Entrer la largeur du rectangle :");
                        largeur = scanner.nextInt();
                    }
                    System.out.println("Entrer la hauteur du rectangle :");
                    int hauteur = scanner.nextInt();
                    if (hauteur <= 0) {
                        System.out.println("la hauteur doit etre superieur à 0 :");
                        System.out.println("Entrer la hauteur du rectangle :");
                        hauteur = scanner.nextInt();
                    }





                    System.out.println("---------------------------------------------");

                    break;
                case 4:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 4");
                    System.out.println("---------------------------------------------");
                    //Exercice 4 : Entrer votre code ici
                    System.out.println("Entrer un Nombre: ");
                    nombre = scanner.nextInt();
                    if (nombre <= 0) {
                        System.out.println("Le nombre doit etre superieur à 0");
                        System.out.println("Entrer un Nombre: ");
                        nombre = scanner.nextInt();
                    }
                    int factoriel = 1;
                    int f = 1;
                    while(f <= nombre) {
                        factoriel *= f;
                        f++;
                    }

                    System.out.println("Le factoriel de " + nombre + " est : " + factoriel);







                    System.out.println("---------------------------------------------");
                    break;
                case 0:
                    System.out.println(RESET);
                    System.exit(0);
                    break;
            }
        }
    }
}