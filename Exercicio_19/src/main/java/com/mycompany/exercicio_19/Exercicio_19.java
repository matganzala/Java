/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_19;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author matheus
 * Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
    incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
    impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
 */
public class Exercicio_19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.println("Informe a senha: ");
        int senha = sc.nextInt();
        
        while(senha != 2002){
            System.out.println("Senha Incorreta: \n");
            
            //Repetição de senha;
            System.out.println("Informe a senha: ");
            senha = sc.nextInt();
        }
        
        System.out.println("Acesso permitido!");
        
    }
}
