/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.politecnicomalaga.eje4_conditions;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        float nota1, nota2, nota3, media;
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Introduce la primera nota (Sobre 10): ");
        nota1 = myScanner.nextFloat();
        System.out.println("Introduce la segunda nota (Sobre 10): ");
        nota2 = myScanner.nextFloat();
        System.out.println("Introduce la tercer nota (Sobre 10): ");
        nota3 = myScanner.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;
        
        if (media >= 8.5 && media <= 10){
            System.out.println("Sobresaliente");
        } else if (media >= 7) {
            System.out.println("Notable");
        } else if (media >= 6) {
            System.out.println("Bien");
        } else if (media >= 5) {
            System.out.println("Suficiente");
        } else if (media >= 0){
            System.out.println("Insuficiente");
        } else {
            System.out.println("Has introducido algún valor erroneo...");
        }
        
    }
}
