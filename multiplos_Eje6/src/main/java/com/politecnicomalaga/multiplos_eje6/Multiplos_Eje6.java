/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.politecnicomalaga.multiplos_eje6;

import java.util.Scanner;

/**
 *
 * @author adriair-school
 */
public class Multiplos_Eje6 {

    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        Integer m, min, max;

        System.out.println("Escribe un valor para M: ");
        m = myScanner.nextInt();
        System.out.println("Escribe un valor mínimo: ");
        min = myScanner.nextInt();
        System.out.println("Escribe un valor máximo: ");
        max = myScanner.nextInt();
        
        for (int i = 0; i <= max; i = i + m) {
            
            if (i >= min) {
                
                System.out.println("\n");
                System.out.println(i);
                
            }
        }
        
    }
}
