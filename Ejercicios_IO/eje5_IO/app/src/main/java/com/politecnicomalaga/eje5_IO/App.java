/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.politecnicomalaga.eje5_IO;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        String nombre, direccion, telefono;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre: ");
        nombre = myScanner.nextLine();
        System.out.println("Introduce tu dirección: ");
        direccion = myScanner.nextLine();
        System.out.println("Introduce tu teléfono: ");
        telefono = myScanner.nextLine();
        
        System.out.println("Mi nombre es: " + nombre
                + "\nMi dirección es: " + direccion
                + "\nMi teléfono es: " + telefono);

    }
}
