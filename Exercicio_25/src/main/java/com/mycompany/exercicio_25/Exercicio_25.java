/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_25;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author matheus
 * Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
    segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

 */
public class Exercicio_25 {

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.println("Digite um número");
        double n = scanf.nextDouble();
        double n1;
        double n2;
        double divisao;
        int i;
        
        for(i = 0; i < n; i++){
            
            System.out.println("\nDigite o primeiro número");
            n1 = scanf.nextDouble();
            
            System.out.println("Digite o primeiro número");
            n2 = scanf.nextDouble();
            
            divisao = n1 / n2;

        
                if(n2 == 0){
                    System.out.println("Divisão Impossível");

                }else{
                    System.out.printf("%.1f", divisao);
                }
                
            }
        
        }
            
       
            
        
    }

