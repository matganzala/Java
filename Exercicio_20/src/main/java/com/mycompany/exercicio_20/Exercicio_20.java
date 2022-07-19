/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_20;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class Exercicio_20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
            System.out.println("Digite a coordenada X: ");
            int x = sc.nextInt();
            
            System.out.println("Digite a coordenada Y:");
            int y = sc.nextInt();
            
             if(x >= 1 && y >= 1){
                System.out.println("Primeiro Quadrante ");
            }else if(x >= 1 && y <= -1){
                System.out.println("Quarto Quadrante ");
            }else if(x <= -1 && y >= 1){
                System.out.println("Segundo Quadrante ");
            }else if(x <= -1 && y <= -1){
                System.out.println("Terceiro Quadrante");
            }
             
        do{ 
            System.out.println("Digite a coordenada X: ");
            x = sc.nextInt();
            
            System.out.println("Digite a coordenada Y:");
            y = sc.nextInt();
            
            if(x >= 1 && y >= 1){
                System.out.println("Primeiro Quadrante ");
            }else if(x >= 1 && y <= -1){
                System.out.println("Quarto Quadrante ");
            }else if(x <= -1 && y >= 1){
                System.out.println("Segundo Quadrante ");
            }else if(x <= -1 && y <= -1){
                System.out.println("Terceiro Quadrante");
            }
            
        } while(x != 0 && y != 0);  
        System.out.println("Nulo");
        
        
        
        
        
    }
}
