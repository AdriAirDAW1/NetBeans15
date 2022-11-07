/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.politecnicomalaga.cajaFuerte;

import java.util.Scanner;

public class App {
 
     public static void main(String[] args) {

        CajaFuerte miCaja = new CajaFuerte();
        String passInput;
        String passInput2;
        int menu;
        boolean exit;
        Scanner myScanner = new Scanner(System.in);

        do {
            System.out.println("Seleccione una opción (0 - 2):");
            System.out.println("\n\t1. Asignar nueva combinación");
            System.out.println("\t2. Abrir caja fuerte");
            System.out.println("\n\t0. Salir\n\t");
            menu = myScanner.nextInt();
            myScanner.nextLine();

            switch (menu) {
                case 1:

                    System.out.println("Introduzca la contraseña anterior (4 caracteres): ");
                    passInput = myScanner.nextLine();
                    System.out.println("Introduzca una nueva contraseña (4 caracteres): ");
                    passInput2 = myScanner.nextLine();
                    if (miCaja.changePassword(passInput, passInput2)) {
                        System.out.println("Contraseña cambiada correctamente");
                    } else {
                        System.out.println("ERROR: Contraseña incorrecta O invalida");
                    }

                    exit = false;
                    break;
                case 2:
                    System.out.println("Introduce la contraseña (4 caracteres): ");
                    passInput = myScanner.nextLine();
                    myScanner.reset();
                    if (miCaja.openBox(passInput)) {

                        System.out.println("Caja fuerte abierta!");

                    } else {

                        System.out.println("ERROR: Contraseña incorrecta...");

                    }
                    exit = false;
                    break;
                case 0:

                    exit = true;
                    break;
                default:
                    System.out.println("Por favor, introduzca una opción válida...");
                    exit = false;
            }
        } while (!exit);
    }
    
}
