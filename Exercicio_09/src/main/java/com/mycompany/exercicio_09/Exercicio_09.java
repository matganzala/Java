/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_09;

import java.util.Scanner;

/**
 *
 * @author matheus
 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
    Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
    ordem crescente ou decrescente
 */
public class Exercicio_09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Digite o valor de A: ");
        int a = sc.nextInt();
        
        System.out.printf("Digite o valor de B: ");
        int b = sc.nextInt();
        
        if (a % b == 0 || b % a == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
        
        sc.close();
    }
}
