package techstore;

import java.util.ArrayList;
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> noms = new ArrayList<String>();
        ArrayList<Double> prix = new ArrayList<Double>();
        ArrayList<Long> quantites = new ArrayList<Long>();
        noms.add("Micro Casque 588 Filaire");
        prix.add(120.0);
        quantites.add(10L);
        noms.add("Clavier Gaming");
        prix.add(250.0);
        quantites.add(5L);
        Stock stock = new Stock(noms, prix, quantites);
        int choix;
        do {
            System.out.println("========== GESTION DU STOCK TECHSTORE ==========");
            System.out.println("0 - Ajouter un article");
            System.out.println("1 - Augmenter la quantite d'un article");
            System.out.println("2 - Modifier un article");
            System.out.println("3 - Supprimer un article");
            System.out.println("4 - Consulter le stock");
            System.out.println("5 - Quitter");
            System.out.print("Choix : ");
            choix = sc.nextInt();
            sc.nextLine();
            switch (choix) {
            case 0:
                System.out.print("Nom : ");
                String nom = sc.nextLine();
                System.out.print("Prix : ");
                double p = sc.nextDouble();
                System.out.print("Quantite : ");
                long q = sc.nextLong();
                sc.nextLine();
                stock.ajouterArticle(nom, p, q);
                break;
            case 1:
                System.out.print("Reference : ");
                String ref1 = sc.nextLine();
                System.out.print("Quantite a ajouter : ");
                long q1 = sc.nextLong();
                sc.nextLine();
                stock.incrementerQuantiteArticle(ref1, q1);
                break;
            case 2:
                System.out.print("Reference : ");
                String ref2 = sc.nextLine();
                System.out.print("Nouveau nom : ");
                String nom2 = sc.nextLine();
                System.out.print("Nouveau prix : ");
                double p2 = sc.nextDouble();
                System.out.print("Nouvelle quantite : ");
                long q2 = sc.nextLong();
                sc.nextLine();
                stock.modifierArticle(ref2, nom2, p2, q2);
                break;
            case 3:
                System.out.print("Reference : ");
                String ref3 = sc.nextLine();
                stock.supprimerArticle(ref3);
                break;
            case 4:
                System.out.println(stock);
                break;
            case 5:
                break;
            default:
                System.out.println("Choix invalide");
            }
        } while (choix != 5);
        sc.close();
    }
}