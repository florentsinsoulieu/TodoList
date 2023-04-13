package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ListeDeTaches {
    public static void main(String[] args) {
        ArrayList<String> listeTaches = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Que voulez-vous faire ?");
            System.out.println("1 - Ajouter une tâche");
            System.out.println("2 - Supprimer une tâche");
            System.out.println("3 - Afficher la liste des tâches");
            System.out.println("4 - Quitter");

            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("Entrez une tâche : ");
                    String tache = scanner.next();
                    listeTaches.add(tache);
                    System.out.println("Tâche ajoutée !");
                    break;
                case 2:
                    System.out.print("Entrez le numéro de la tâche à supprimer : ");
                    int numeroTache = scanner.nextInt();
                    if (numeroTache >= 1 && numeroTache <= listeTaches.size()) {
                        listeTaches.remove(numeroTache - 1);
                        System.out.println("Tâche supprimée !");
                    } else {
                        System.out.println("Numéro de tâche invalide !");
                    }
                    break;
                case 3:
                    if (listeTaches.size() == 0) {
                        System.out.println("Aucune tâche à afficher !");
                    } else {
                        System.out.println("Liste des tâches :");
                        for (int i = 0; i < listeTaches.size(); i++) {
                            System.out.printf("%d - %s\n", i + 1, listeTaches.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Au revoir !");
                    return;
                default:
                    System.out.println("Choix invalide !");
            }
        }
    }
}