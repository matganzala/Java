/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_07;
import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class Exercicio_07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite um valor inteiro para 'X': ");
        int x = sc.nextInt();
        
        if(x < 0){
            System.out.println("Esse número é negativo");
        }else if(x >= 0){
            System.out.println("Esse número é positivo");
        }
                
    }
}
