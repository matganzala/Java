/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.Scanner;

/**
 *
 * @author PCDEV
 */
public class Estudante {

   
    //Atributos;
    private String nomeAluno;
    private double nota1, nota2, nota3;
    
     /**
     * @return the nomeAluno
     */
    public String getNomeAluno() {
        return this.nomeAluno;
    }

    /**
     * @param nomeAluno the nomeAluno to set
     */
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    
    public void setNota1(double notaInserida){
        boolean isNotaValida = false;
        Scanner sc = new Scanner(System.in);
        
        do{
            
            if(notaInserida >= 0 && notaInserida <=30){
                isNotaValida = true;
                this.nota1 = notaInserida;
            }
            else{
                System.out.println("nota invalida");
                System.out.println("\nInforme a nota VÁLIDA(0 - 30) do primeiro trimestre novamente: ");
                notaInserida = sc.nextDouble();
            }
        }while(!isNotaValida);
    }
    
    public double getNota1(){
        return this.nota1;
    }
    
    public void setNota2(double nota2){
        this.nota2 = nota2;
    }
    
    public double getNota2(){
        return this.nota2;
    }
    
    public void setNota3(double nota3){
        this.nota3 = nota3;
    }
    
    public double getNota3(){
        return this.nota3;
    }
    
    
    
    public double calcularNotaAnal(){
        return nota1 + nota2 + nota3;
    }
    
    public String verificarAprovacao() {
        if(calcularNotaAnal() < 60){
            double failed = 60 - calcularNotaAnal();
            System.out.printf("Faltam: %.2f para ser aprovado!\n", failed);
            return "Reprovado!";
        }else{
            return "Aprovado!";
        }
    }
    
    
    public String toString() {
        return "A nota anual: " + calcularNotaAnal() + "\nResultado: " + verificarAprovacao();
    }
        
        
}
    
    
   

