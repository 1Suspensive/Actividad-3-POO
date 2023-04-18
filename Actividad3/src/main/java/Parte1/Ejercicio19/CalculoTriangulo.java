/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1.Ejercicio19;

/**
 *
 * @author JEFERSON
 */
public class CalculoTriangulo {
    
    double a;
    
    public CalculoTriangulo(double a){
    this.a = a;
    }
    
    public double calculoPerimetro(){
        double perimetro;
        perimetro = a *3;
        return perimetro;
    }
    public double calculoAltura(){
        double altura;
        altura = (Math.sqrt(3)*a)/2;
        return altura;
    }
    public double calculoArea(){
        double area;
        area = (Math.pow(a, 2)*Math.sqrt(3))/4;
        return area;
    }
}
