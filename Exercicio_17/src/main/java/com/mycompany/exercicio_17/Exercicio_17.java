/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_17;


import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class Exercicio_17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int minutosUsados = sc.nextInt();
        
        double conta = 50.0;
        
        if(minutosUsados > 100){
            conta = conta + (minutosUsados - 100) * 2.0;
                        
        }
        
        System.out.printf("Valor da conta = %.2f", conta);
        
        sc.close();
        
        
    }
}
