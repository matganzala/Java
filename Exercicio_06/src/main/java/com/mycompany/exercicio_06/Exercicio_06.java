/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_06;

import java.util.Scanner;

/**
 *
 * @author matheus
 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
    mostre:
    a) a área do triângulo retângulo que tem A por base e C por altura.
    b) a área do círculo de raio C. (pi = 3.14159)
    c) a área do trapézio que tem A e B por bases e C por altura.
    d) a área do quadrado que tem lado B.
    e) a área do retângulo que tem lados A e B
 */
public class Exercicio_06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        
        /*setNumeros*/
        System.out.printf("Digite o primeiro número: ");
        double a = sc.nextDouble();
        System.out.printf("Digite o segundo número: ");
        double b = sc.nextDouble();
        System.out.printf("Digite o primeiro número: ");
        double c = sc.nextDouble();
        
        /*Foŕmulas*/
        double areaTriangulo = a * c / 2;
        double areaCirculo = pi * Math.pow(c, 2);
        double areaTrapezio = (a + b) * c / 2;
        double areaQuadrado = Math.pow(b, 2);
        double areaRetangulo = a * b;
        
        /*Execução*/
        System.out.printf("Área do triângulo retângulo: %.2f%n", areaTriangulo);
        System.out.printf("Área do circulo: %.2f%n", areaCirculo);
        System.out.printf("Área do trapézio: %.2f%n", areaTrapezio);
        System.out.printf("Área do quadrado: %.2f%n", areaQuadrado);
        System.out.printf("Área do retângulo: %.2f%n", areaRetangulo);
                
             
    }
}
