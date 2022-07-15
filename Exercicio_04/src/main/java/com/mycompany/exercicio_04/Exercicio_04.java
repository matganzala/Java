/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_04;

import java.util.Scanner;

/**
 *
 * @author PCDEV
 */
public class Exercicio_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorHoraRecebida = sc.nextDouble();        
        double salario = valorHoraRecebida * horasTrabalhadas;
        
        System.out.printf("Number: %d%nSalary: U$%.2f", numeroFuncionario, salario);
        
        
        
    }
}
