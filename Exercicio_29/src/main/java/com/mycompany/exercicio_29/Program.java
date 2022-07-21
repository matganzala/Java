/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio_29;

import entities.Rectangle;
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
        Rectangle retangulo = new Rectangle(); //Instânciando a classe;
        
        //System.out.println(retangulo);//Sem os dados retornará [x=0,y=0,width=0,height=0];
        int opcao;
        
        
        do{
            
            System.out.println("=========Calculos=========");
            System.out.println("Digite a base do retângulo: ");
            retangulo.width = sc.nextDouble();
            
            System.out.println("Digite a altura do retângulo: ");
            retangulo.height = sc.nextDouble();

            double area = retangulo.area();
            double perimetro = retangulo.perimeter();
            double diagonal = retangulo.diagonal();

            System.out.printf("\nÁrea: %.2f%n", area);
            System.out.printf("Perímetro: %.2f%n", perimetro);
            System.out.printf("Diagonal: %.2f%n", diagonal);
            
            System.out.println("\n0 para Sair\nQualquer tecla para continuar");
            opcao = sc.nextInt();
            
            
        }while(opcao != 0);
            System.out.println("ATÉ MAIS!");
        
        sc.close();
        
    }
}
