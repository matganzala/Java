/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_31;

import entities.Estudante;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author PCDEV
 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
    (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
    ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
    para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
    resolver este problema.

 */
public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("====== Sistema de notas ====== ");
        Estudante aluno1 = new Estudante();
        
       
        System.out.println("Digite o nome do aluno: ");
        aluno1.setNomeAluno(sc.next());
        
        System.out.println("\nValor da nota do primeiro trimestre: ");
        aluno1.setNota1(sc.nextDouble());
        
        System.out.println("\nValor da nota do segundo trimestre: ");
        aluno1.setNota2(sc.nextDouble());
        
        System.out.println("\nValor da nota do trimestre trimestre: ");
        aluno1.setNota3(sc.nextDouble());
        
        System.out.println(aluno1);
        
      
        
        
        
    }
}
