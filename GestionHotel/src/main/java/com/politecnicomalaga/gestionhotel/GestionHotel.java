/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.politecnicomalaga.gestionhotel;

import java.util.Scanner;

/**
 *
 * @author adriair-myScannerhool
 */
public class GestionHotel {

    public static void main(String[] args) {

        String dni, name, surname, address, phone, email, birthdate, age;
        Integer menu;
        Scanner myScanner = new Scanner(System.in);
        Hotel myHotel = new Hotel();

        do {

            System.out.println("\n\n");
            System.out.println("1.Agregar cliente\n2.Eliminar cliente\n3.Mostrar clientes\n4.Aplicar promoción\n\n0.Salir\n");
            menu = myScanner.nextInt();
            myScanner.nextLine();

            switch (menu) {
                case 1:

                    System.out.println("\n\n");

                    System.out.print("\nIntroduce el DNI del cliente: ");
                    dni = myScanner.nextLine();

                    System.out.print("\nIntroduce el Nombre del cliente: ");
                    name = myScanner.nextLine();

                    System.out.print("\nIntroduce los Apellidos del cliente: ");
                    surname = myScanner.nextLine();

                    System.out.print("\nIntroduce la dirección del cliente: ");
                    address = myScanner.nextLine();

                    System.out.print("\nIntroduce el Teléfono del cliente: ");
                    phone = myScanner.nextLine();

                    System.out.print("\nIntroduce el Email del cliente: ");
                    email = myScanner.nextLine();

                    System.out.print("\nIntroduce la Fecha de nacimiento del cliente: ");
                    birthdate = myScanner.nextLine();

                    System.out.print("\nIntroduce la Edad del cliente: ");
                    age = myScanner.nextLine();

                    System.out.println("\n\n");

                    myHotel.addClient(dni, name, surname, address, phone, email, birthdate, age);
                    break;

                case 2:

                    System.out.println("\n\n");
                    System.out.print("Introduce el DNI del cliente a eliminar: ");
                    dni = myScanner.nextLine();
                    myHotel.removeClient(dni);
                    break;

                case 3:

                    System.out.println("\n\n");
                    myHotel.showClients();
                    break;

                case 4:

                    System.out.println("\n\n");
                    System.out.print("Introduce el DNI del cliente a aplicar el descuento: ");
                    dni = myScanner.nextLine();
                    myHotel.changeDiscount(dni);
                    break;

                default:

                    System.out.println("\n\n");
                    System.out.println("Introuduce un valor válido...");

            }

        } while (menu != 0);
    }
}
