/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.politecnicomalaga.parimpar_eje1;

import java.util.Scanner;

/**
 *
 * @author adriair-school
 */
public class ParImpar_eje1 {

    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        Integer odd, even, menu;
        
        
        do{
            
            System.out.println("Qué desea hacer:\n\t0. Salir\n\t1. Empezar\n\n\t");
            menu = myScanner.nextInt();         
            
            switch(menu) {
                
                case 0:
                    System.out.println("Adiós :)");
                    break;
                case 1:
                    System.out.println("Introduce un número par: ");
                    even = myScanner.nextInt();
                    System.out.println("Introduce un número impar: ");
                    odd = myScanner.nextInt();
                    
                    if(even % 2 != 0 || odd % 2 == 0){
                        System.out.println("Has introducido algún valor erroneo...");
                    } else {
                        System.out.println("Gracias por su colaboración :)");
                        menu = 0;
                    }
                    
                    break;
                default:
                    System.out.println("Introduce un valor válido...");
            }
            
        }while(menu != 0);
    }   
}
