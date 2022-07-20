/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.course;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanf = new Scanner(System.in);
        
        Product produto = new Product();
        
        System.out.println("Nome: ");
            produto.name = scanf.next();
        System.out.println("Preço: ");
            produto.price = scanf.nextDouble();
        System.out.println("Quantidade: ");
            produto.quantity = scanf.nextInt();
        double valueStock = produto.totalValueInStock();//Método para calcular a quantidade em estoque 
        int opcao;
        
        
        do{
            System.out.println("Deseja alterar o estoque ?\n1 - Sim\n2 - Mostrar Estoque\n3 - Sair");
            opcao = scanf.nextInt();
            switch(opcao){
            case 1:
                System.out.println("Adicionar quantos itens: ");
                produto.addProducts(scanf.nextInt());
                
                System.out.println("Remover quantos itens: ");
                produto.removeProducts(scanf.nextInt());
                
                 System.out.printf("Produto: %s%n "
                + "Preço: %f%n "
                + "Quantidade: %d%n "
                + "Valor em estoque: %f%n", produto.name, produto.price, produto.quantity, valueStock);
                
                break;
            case 2:
                System.out.printf("Produto: %s%n "
                + "Preço: %f%n "
                + "Quantidade: %d%n "
                + "Valor em estoque: %f%n", produto.name, produto.price, produto.quantity, valueStock);
                break;
            case 3:
                System.out.println("Fim");
                return;
            default:
                System.out.println("Digite uma opção válida: ");
                break;
                    
        }
            
        }while(opcao != 3);
            
        
        
        
        
        
    }
}
