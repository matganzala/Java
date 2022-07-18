/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_16;

/**
 *
 * @author matheus
 */
public class Exercicio_16 {
    //Condicional ternário;

    public static void main(String[] args) {
        /*double preco = 34.5;
        double desconto;
            if (preco < 20.0) {
            desconto = preco * 0.1;
            }
            else {
            desconto = preco * 0.05;
        }*/
        
        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
            

    }
}
