/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_02;


import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author PCDEV
 */
public class Exercicio_02 {
    

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        double raio, a, pi;
        Scanner sc = new Scanner(System.in);
        pi = 3.14159;
        System.out.println("Insira o valor do Raio: ");
        raio = sc.nextDouble();
        a = pi * (Math.pow(raio, 2));
        
        System.out.printf("area é: %.4f ", a);
        
        
        
    }
}
