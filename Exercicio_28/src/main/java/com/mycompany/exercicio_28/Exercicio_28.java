/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_28;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author matheus
 * Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
    começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
    exemplo.
 */
public class Exercicio_28 {

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.println("Digite um número inteiro positivo: ");
        int n = scanf.nextInt();
        int i;
        double quadrado;
        double cubo;
        
        for(i = 1; i <= n; i++){
            quadrado = Math.pow(i, 2);
            cubo = Math.pow(i, 3);
            System.out.printf("%d %.0f %.0f%n", i, quadrado, cubo);
            
            
        }
        
        
        
    }
}
