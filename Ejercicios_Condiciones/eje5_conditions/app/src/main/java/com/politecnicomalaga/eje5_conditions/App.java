/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.politecnicomalaga.eje5_conditions;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int[] num = {0, 0, 0};
        int peque = 0, grande = 0, medio = 0;
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Primer valor: ");
        num[0] = myScanner.nextInt();
        System.out.println("Segundo valor: ");
        num[1] = myScanner.nextInt();
        System.out.println("Tercer valor: ");
        num[2] = myScanner.nextInt();

        if (num[0] >= num[1] && num[0] >= num[2]) {
            grande = num[0];
            num[0] = num[1];
            num[1] = num[2];
        } else if (num[1] >= num[0] && num[1] >= num[2]) {
            grande = num[1];
            num[1] = num[2];
        } else if (num[2] >= num[0] && num[2] >= num[1]) {
            grande = num[2];
            num[1] = num[1];
        }

        if (num[0] <= num[1]) {

            medio = num[1];
            peque = num[0];

        } else if (num[1] <= num[0]) {

            medio = num[0];
            peque = num[1];

        }

        System.out.println(peque + " <= " + medio + " <= " + grande);

    }
}
