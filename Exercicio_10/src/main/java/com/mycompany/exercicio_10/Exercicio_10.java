/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_10;

import java.util.Scanner;

/**
 *
 * @author matheus
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
    começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas
 */
public class Exercicio_10 {//

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Leitura das horas
        System.out.println("Hora Inicial");
        int horaInicial = sc.nextInt();
            if(horaInicial ){
                
            }
        
        System.out.println("Hora Final");
        int horaFinal = sc.nextInt();
            if(horaFinal < 0 && horaFinal > 24){
                System.out.println("Hora inválida");
            }
            
        //Cálculo de horas
       
        
       
        
        
        
       
    }
}
