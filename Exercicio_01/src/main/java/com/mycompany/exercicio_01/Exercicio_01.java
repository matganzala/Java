/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_01;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class Exercicio_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Insira o primeiro número: ");       
        int x = sc.nextInt(); 
        System.out.printf("Insira o segundo número: ");   
        int y = sc.nextInt();
        
        int resultado = x + y;
        System.out.println("Resultado: " + resultado);   
        
        
        System.out.printf("%d + %d = %d", x, y, resultado);
    }
}




