/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_024;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author matheus
 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
    de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
    conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
    peso 5.
    
 */
public class Exercicio_024 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanf = new Scanner(System.in);
        
        System.out.println("Digite o número de casos :"); //Número de média a ser executada
        int n = scanf.nextInt();
        int i;
        double num1;
        double num2;
        double num3;
        double media = 0; 
        
            for(i = 0; i < n; i++){
                
            System.out.println("\nDigite o primeiro número: ");
            num1 = scanf.nextDouble();
            
            System.out.println("Digite o segundo número: ");
            num2 = scanf.nextDouble();
            
            System.out.println("Digite o terceiro número: ");
            num3 = scanf.nextDouble();
            
            media = (num1 + num2 + num3) / 3; 
            
        }
            
            System.out.printf("Media: %.2f", media );
        
        
        
    }
}
