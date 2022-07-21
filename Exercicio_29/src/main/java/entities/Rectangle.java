/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author PCDEV
 */
public class Rectangle {
    //Atributos
    public double width;
    public double height;
    
    //Metodos
    public double area() {
        return width * height;
    }
    
    public double perimeter() {
        return 2 * (width + height);
    }
    
    public double diagonal() {
        return Math.pow(height, 2) + Math.pow(width, 2);
    
    }
    
    
}
