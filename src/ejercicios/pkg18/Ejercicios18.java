/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.pkg18;

import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class Ejercicios18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner Teclado = new Scanner(System.in);
        int Rango1, Rango2;

        System.out.println("Digite el primer número del rango: ");
        Rango1 = Teclado.nextInt();

        System.out.println("Digite el segundo número del rango: ");
        Rango2 = Teclado.nextInt();

        for (int i = 0; i < 10; i++) {
            double Ale = Math.random() * Rango2 + Rango1;
            int Ale2 = (int) Ale;
            System.out.print(Ale2);
            System.out.print(" ");
        }

    }

}
