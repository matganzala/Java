/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_15;

import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class Exercicio_15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dias da semana");
        int dia = sc.nextInt();
        
        switch(dia){
            case 1:
                System.out.println("Domingo !");
                break;
            case 2:
                System.out.println("Segunda-feira !");
                break;
            case 3:
                System.out.println("Terça-feira !");
                break;
            case 4:
                System.out.println("Quarta-feira !");
                break;
            case 5:
                System.out.println("Quinta-feira!");
                break;
            case 6:
                System.out.println("Sexta-feira !");
                break;
            case 7:
                System.out.println("Sabado !");
                break;
            default:
                System.out.println("Dia inválido !");
        }   
    }
}
