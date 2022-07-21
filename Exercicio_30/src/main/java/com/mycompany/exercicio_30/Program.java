/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_30;

import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author PCDEV
 */
public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee aumento = new Employee();
       
        System.out.println("Digite os dados do funcionário: ");
        System.out.println("Nome: ");
        aumento.name = sc.next();

        System.out.println("Salário bruto: ");
        aumento.grossSalary = sc.nextDouble();

        System.out.println("Imposto: ");
        aumento.tax = sc.nextDouble();

        System.out.println(aumento);// método toString, não obriga a usar toString para exibir;

        System.out.println("\nEm quantos % você quer incrementar o salário líquido? ");
        double percent = sc.nextDouble();

        double calcPercent = aumento.grossSalary / 100 * percent + aumento.netSalary();
        System.out.printf("\nAtualização: %s, $ %.2f", aumento.name, calcPercent);
        
    }
}
