/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_12;
import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class Exercicio_12 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite um número para apresentar o intervalo: ");
        double x = sc.nextDouble();
        
        if(x >= 0 && x <= 25){
            System.out.println("Intervalo (0,25]");
        }else if(x > 25 && x <= 50){
            System.out.println("Intervalo (25,50]");
        }else if(x > 50 && x <= 75){
            System.out.println("Intervalo (50,75]");
        }else if(x > 75 && x <= 100){
            System.out.println("Intervalo (75,100]");
        }
        
        
        
    }
}
