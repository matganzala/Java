/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_26;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class Exercicio_26 {

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.println("Digite um número para calcular o fatorial: ");
        int n = scanf.nextInt();
        
        int fatorial = n * (n-1) * (n-2) * (n-3) * 1; 
        
        System.out.printf("Fatorial: %d!", fatorial);
    }
}
