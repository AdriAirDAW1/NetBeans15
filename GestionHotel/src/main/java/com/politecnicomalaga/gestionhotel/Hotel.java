/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.gestionhotel;

import java.util.ArrayList;

/**
 *
 * @author adriair-school
 */
public class Hotel {

    private final String description, name, address, phone, email;
    private final ArrayList<Client> client;

    public Hotel() {

        this.description = "Hotel situado en málaga con 5 estrellas. Tiene piscina, gimnasio y wifi.";
        this.name = "Gran Hotel Miramar";
        this.address = "Paseo de Reding";
        this.phone = "123123123";
        this.email = "miramar@gmail.com";
        this.client = new ArrayList<>();

    }

    public void showClients() {

        if (!client.isEmpty()) {

            for (int i = 0; i < client.size(); i++) {

                System.out.println("\n\nDNI: " + client.get(i).getClientInformation()[0]);
                System.out.println("Name: " + client.get(i).getClientInformation()[1]);
                System.out.println("Apellidos: " + client.get(i).getClientInformation()[2]);
                System.out.println("Dirección: " + client.get(i).getClientInformation()[3]);
                System.out.println("Teléfono: " + client.get(i).getClientInformation()[4]);
                System.out.println("Email: " + client.get(i).getClientInformation()[5]);
                System.out.println("Fecha de Nacimiento: " + client.get(i).getClientInformation()[6]);
                System.out.println("Edad: " + client.get(i).getClientInformation()[7]);

                if (Boolean.parseBoolean(client.get(i).getClientInformation()[8])) {

                    System.out.println("Promoción: Aplicada");

                } else {

                    System.out.println("Promoción: No Aplicada");

                }
            }

        } else {

            System.out.println("\n\nNo hay clientes registrados...");

        }

    }

    public void addClient(String dni, String name, String surname, String address, String phone, String email, String birthdate, String age) {

        client.add(new Client(dni, name, surname, address, email, phone, birthdate, age));

    }

    public void removeClient(String dni) {

        if (!client.isEmpty()) {

            for (int i = 0; i < client.size(); i++) {

                if (client.get(i).getClientInformation()[0].equals(dni)) {

                    System.out.println("\n\n");
                    System.out.println("Se ha eliminado a " + client.get(i).getClientInformation()[1] + " " + client.get(i).getClientInformation()[2]);
                    System.out.println("\n\n");

                    client.remove(client.get(i));

                } else {

                    System.out.println("No se ha encontrado al cliente deseado...\nRevise el DNI introducido (Key Sensitive).");

                }

            }

        } else {

            System.out.println("\n\nNo hay registrado ningún cliente.\n");

        }

    }

    public void changeDiscount(String dni) {

        if (!client.isEmpty()) {

            for (int i = 0; i < client.size(); i++) {

                if (client.get(i).getClientInformation()[0].equals(dni)) {

                    if (Integer.parseInt(client.get(i).getClientInformation()[7]) >= 18 && Integer.parseInt(client.get(i).getClientInformation()[7]) <= 28) {

                        if (!Boolean.parseBoolean(client.get(i).getClientInformation()[8])) {

                            client.get(i).applyDiscount();
                            System.out.println("\n\nSe ha aplicado el descuento.\n"); //Se le ha aplicado el descuento al cliente. Tiene la edad necesaria y no la tenía aplicada.
                            break;

                        } else {

                            System.out.println("\n\nEl cliente ya tiene la promoción aplicada.\n");

                        }

                    } else {

                        System.out.println("\n\nEl cliente no tiene la edad requerida para aplicarse el descuento.\n");

                    }

                }

            }

        } else {

            System.out.println("\n\nNo hay registrado ningún cliente.\n");

        }

    }

}
