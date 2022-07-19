/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_24;

import java.util.Locale;
import java.util.Scanner;


/**
 *
 * @author matheus
 */
public class Exercicio_24 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Não terminado
        
        System.out.println("Digite a quantidade de valores: ");
        int n = sc.nextInt(); // Quantidade dos valores inteiros;
        int x = 0;
        int in = 0 ;
        int out = 0;
        int i;
        
        
        for(i = 0; i < n; i++){
        //System.out.println(i);
            System.out.println("Digite os valores: "); //Valores;
            x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                    in++;
            }
            else {
                   //out +=  1;
                   //out++;
                   //out = out +1;
                   //out = ++out;
                   out++;
            }
        }
        
        System.out.printf("in:  %d\nout: %d:", in, out);
        
        
        

        
            
        
                
        
        
        
        /*Condicional 
        if(x >= 10 && x <= 20){
            System.out.printf("in");
            
        }else{
            System.out.println("out");
        }*/
        
               
       /* for(i = n; i >= 0; i++){
            
            System.out.printf("Quantidade a ser imprimida: %d\n", i);
                
            }*/
            
            
        }
        
        
        
        
    }

