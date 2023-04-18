/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1.Ejercicio23;

/**
 *
 * @author JEFERSON
 */
public class Raices {
    public double calculoRaiz1(double A, double B, double C){
        double aux = (Math.pow(B, 2))- 4*A*C,valor1 = 0;
        if(aux > 0){
            valor1 = (-B + Math.sqrt(aux))/2*A;
        }
        return valor1;
    }
    public double calculoRaiz2(double A, double B, double C){
        double aux = (Math.pow(B, 2))- 4*A*C,valor2 = 0;
        if(aux > 0){
            valor2 = (-B - Math.sqrt(aux))/2*A;
        }
        return valor2;
    }
    
}
