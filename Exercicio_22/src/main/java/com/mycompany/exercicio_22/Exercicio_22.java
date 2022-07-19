/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_22;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author matheus
 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
        X, se for o caso.
 */
public class Exercicio_22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int x;
        do{
            x = sc.nextInt();
            System.out.printf("X é igual %d%n", x);
            for(int i = 1; i <= x; i++){
                if(i % 2 != 0){
                    System.out.println(i);
                }
            }
            
        }while(x <= 1 || x >= 1000);
        
        System.out.println("Ta fora !");
    }   
    
}
