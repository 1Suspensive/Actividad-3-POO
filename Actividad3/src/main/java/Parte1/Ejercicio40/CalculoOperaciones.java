/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1.Ejercicio40;

/**
 *
 * @author JEFERSON
 */
public class CalculoOperaciones {
    public double[] raizCuadrada(double valores[]){
        double resultado[] = new double[valores.length];        
        for(int i = 0;i< valores.length;i++){
            resultado[i] = Math.sqrt(valores[i]);
        }
        return resultado;
    }
    public double[] Cuadrado(double valores[]){
        double resultado[] = new double[valores.length];        
        for(int i = 0;i< valores.length;i++){
            resultado[i] = Math.pow(valores[i],2);
        }
        return resultado;
    }
    public double[] Cubo(double valores[]){
        double resultado[] = new double[valores.length];
        for(int i = 0;i< valores.length;i++){
            resultado[i] = Math.pow(valores[i],3);
        }
        return resultado;
    }
}
