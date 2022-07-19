/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_27;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class Exercicio_27 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanf = new Scanner(System.in);
        System.out.println("Leitura de divisores");
        System.out.println("Digite o número para calcular seus divisores: ");
        int n = scanf.nextInt();
        //int x = scanf.nextInt();
        int i;
        
        for(i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.println(i);
                        
            }
            
        }
        
    }
}
