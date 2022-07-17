/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_08;

import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class Exercicio_08 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N % 2 == 0) {
                System.out.println("PAR");
        }
        else {
                System.out.println("IMPAR");
        }

        sc.close();
    }
}
