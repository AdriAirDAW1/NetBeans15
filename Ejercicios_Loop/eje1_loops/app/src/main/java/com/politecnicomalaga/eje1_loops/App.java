/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.politecnicomalaga.eje1_loops;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int numero = 0;
        int[] multiplos = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        numero = myScanner.nextInt();

        for (int i = 0; i <= 9; i++) {
            
            multiplos[i] = numero * (i + 1);
            System.out.print(multiplos[i] + ", ");
            
        }
    }
}