/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.politecnicomalaga.diabetes;

import java.util.Scanner;

/**
 *
 * @author adriair-school
 */
public class Diabetes {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int sugarLevels;
        String isAware;

        System.out.print("Indique la cantidad de azucar en mg/dl del paciente: ");

        sugarLevels = myScanner.nextInt();
        myScanner.nextLine();

        if (sugarLevels < 0) {

            System.out.println("\n\nIntroduce un valor válido...");

        } else if (sugarLevels >= 70 && sugarLevels <= 180) {

            System.out.println("\n\nEstado correcto. Debería estar todo en orden.");

        } else if (sugarLevels > 600) {

            System.out.println("\n\nIntroduce un valor válido...");

        } else if (sugarLevels < 70) {

            do {
                System.out.print("\n\nHipoglucemia detectada. Está conciente? [y/n]: ");
                isAware = myScanner.nextLine();
                
                if ("y".equals(isAware) || "Y".equals(isAware)) {

                    System.out.println("\n\nDar líquidos azucarados de absorción rápida como Zumos, glucosports, azúcar...");
                    System.out.println("Repetir est 5-10 minutos después.");
                    System.out.println("Dar hidratos de carbono de absorción lenta como galletas, pan, chocolate...\n\n");

                } else if ("n".equals(isAware) || "N".equals(isAware)) {

                    System.out.println("\n\nNO dar nada por boca!");
                    System.out.println("Administrar glucagón.");
                    System.out.println("Avisar a familiares y a emergencias.\n\n");

                }

            } while (!"y".equals(isAware) && !"Y".equals(isAware) && !"n".equals(isAware) && !"N".equals(isAware));

        } else if (sugarLevels > 180) {

            System.out.println("\n\nHyperglucemia detectada.\nAdministre agua en abundancia y avise a familiares y personal médico.");

        }

    }
}
