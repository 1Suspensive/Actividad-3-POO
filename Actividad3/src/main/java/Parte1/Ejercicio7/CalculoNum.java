/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1.Ejercicio7;

/**
 *
 * @author JEFERSON
 */
public class CalculoNum {
    
    double a,b;
    
    public CalculoNum(double a, double b) {
        this.a = a;
        this.b = b;          
    }
    
    public String CalculoNumero(){
        String resp;
        if (a > b) {
            resp="A es mayor que B";
        } else if (a == b) {
            resp="A es igual a B";
        } else {
            resp="A es menor que B";
        }
        return resp;
    }
    
}
