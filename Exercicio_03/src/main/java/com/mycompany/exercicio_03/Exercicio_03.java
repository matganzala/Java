/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_03;

import java.util.Scanner;

/**
 *
 * @author PCDEV
 */
public class Exercicio_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira os valores A, B, C, D, em sequência: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int diferenca = (a * b - c * d);
        System.out.println("Diferença =" + diferenca);
        
        
    }
}
