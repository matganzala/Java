/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_14;

import java.util.Scanner;

import java.util.Locale;

/**
 *
 * @author matheus
 */
public class Exercicio_14 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Cálculo de impostos");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o salário: ");
        double salario = sc.nextDouble();
        
        if(salario <= 2000.00){
            System.out.printf("Isento");
        }else if(salario >= 2000.01 && salario <= 3000.00){
            double precoImposto = salario - 2000.00;
            double calculoImposto = (precoImposto / 100) * 8;
            System.out.printf("Imposto: R$ %.2f", calculoImposto);
        }else if(salario >= 3000.01 && salario <= 4500.00){
            double impostoFixo = 80.00;
            double precoImposto = salario - 3000.00;
            double calculoImposto = (precoImposto / 100) * 18 + impostoFixo;
            System.out.printf("Imposto: R$ %.2f", calculoImposto);
        }else if(salario > 4500.00){
            double impostoFixo = 350.00;
            double precoImposto = salario - 4500.00;
            double calculoImposto = (precoImposto / 100) * 28 + impostoFixo;
            System.out.printf("Imposto: R$ %.2f", calculoImposto);
        }
        
        
        
        
        
    }
}
