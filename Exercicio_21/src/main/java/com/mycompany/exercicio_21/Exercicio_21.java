/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_21;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author matheus
 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
    um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
    4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
    que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
    mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
    exemplo.
 */
public class Exercicio_21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int x = -1;
        int gasolina = 0;
        int diesel = 0;
        int alcool = 0;
        
        do{ 
            System.out.println("1 - Alcool\n2 - Gasolina\n0 - Diesel\n4 - Encerrar");
            x = sc.nextInt();
            switch(x){
            case 1:
                System.out.println("Alcool: 1");
                alcool++;
                break;
            case 2:
                System.out.println("Gasolina: 2");
                gasolina++;
                break;
            case 0:
                System.out.println("Diesel: 0");
                diesel++;
                break;
            case 4:
                System.out.println("MUITO OBRIGADO!");
                System.out.println("Gasolina:" + gasolina);
                System.out.println("DIESEL:" + diesel);
                System.out.println("alcool:" + alcool);
                break;
            default:
                System.out.println("OPA AMIGÃO!! CODIGO INVALIDO.. repita essa bagaça aew");
                return;
            }
        
        }while(x != 4);
            sc.close(); 
    }
}
