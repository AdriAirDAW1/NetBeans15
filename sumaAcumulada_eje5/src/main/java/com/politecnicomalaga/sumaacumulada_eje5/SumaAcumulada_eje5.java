/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.politecnicomalaga.sumaacumulada_eje5;

import java.util.Scanner;

/**
 *
 * @author adriair-school
 */
public class SumaAcumulada_eje5 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        Integer value;
        Integer result;

        result = 0;
        System.out.print("Introduce un número entero: ");
        value = myScanner.nextInt();

        if (value > 0) {

            for (int i = 1; i <= value; i++) {

                result = result + i;
                System.out.print(i + " ");

            }
            
            System.out.println("= " + result);
            
        } else if (value < 0) {
            
            for (int i = -1; i >= value; i--) {

                result = result + i;
                System.out.print(i + " ");

            }
            
            System.out.println("= " + result);
            
        } else {

            System.out.println(value);

        }

    }
}
