/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1.Ejercicio41;

/**
 *
 * @author JEFERSON
 */
public class CalculoMayor {
    public double calculo(String numeros[]){
        double resultado = 0;
        for(int i = 0;i<numeros.length;i++){
            if(Double.parseDouble(numeros[i]) > resultado){
                resultado = Double.parseDouble(numeros[i]);
            }
        }
        
        return resultado;
    }
}
