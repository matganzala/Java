/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_05;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class Exercicio_05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código, Número e preço do produto (1)");
        int codigoUm = sc.nextInt();
        int numeroPecasUm = sc.nextInt();
        double valorPecaUm = sc.nextDouble();
        
        System.out.println("Digite o código, Número e preço do produto (2)");
        int codigoDois = sc.nextInt();
        int numeroPecasDois = sc.nextInt();
        double valorPecaDois = sc.nextDouble();
        
        double calculoPecaUm = numeroPecasUm * valorPecaUm;
        double calculoPecaDois = numeroPecasDois * valorPecaDois;
        double valorFinal = calculoPecaUm + calculoPecaDois;
        
        System.out.printf("Valor a pagar: R$ %.2f", valorFinal);
        
    }
}
