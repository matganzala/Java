/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author PCDEV
 */
public class Employee {
    //Atributos;
    public String name;
    public double grossSalary;
    public double tax;
    
    //métodos;
    public double netSalary() {
        return grossSalary - tax;
    }
     
    /*public void increaseSalary(double percentage) {
        percentage = grossSalary / 100;
       
        
    }*/
    
    @Override
    public String toString() {
        return "Employee: " + name + ", $ " + String.format("%.2f", netSalary());
        
    }
    
    
}
