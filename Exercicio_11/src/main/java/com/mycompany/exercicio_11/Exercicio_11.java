/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_11;

import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class Exercicio_11 {

    public static void main(String[] args) {
        System.out.println("===== Barriquinha de Cachorro-Quente =====");
        Scanner sc = new Scanner(System.in);
        
        //Códigos dos lanches
        System.out.println("1 - Cachorro-quente: R$ 4,50\n2 - X-Salada: R$ 4,50\n3 - X-Bacon: R$ 5,00\n4 - Torrada Simples: R$ 2,00\n5 - Refrigerante: R$ 1,50\n");
        System.out.printf("Digite o código do lanche: ");
        int tipoLanche = sc.nextInt();
        float precoLanche = 0;
            switch(tipoLanche){
                case 1:
                    precoLanche = (float) 4.50;
                    break;
                case 2:
                    precoLanche = (float) 4.50;
                    break;
                case 3:
                    precoLanche = (float) 5.00;
                    break;
                case 4:
                    precoLanche = (float) 2.00;
                    break;
                case 5:
                    precoLanche = (float) 1.50;
                    break;
            }
        System.out.printf("Digite a quantidade desejada: ");
        int quantidade = sc.nextInt();
        
        //Cálculo lanche
        float valorFinal = (float) (precoLanche * quantidade);
        
        System.out.printf("O valor final foi: R$ %.2f", valorFinal);
        
        sc.close();
        
        
    }
}
