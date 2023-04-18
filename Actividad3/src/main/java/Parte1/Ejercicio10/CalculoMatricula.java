/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1.Ejercicio10;

/**
 *
 * @author JEFERSON
 */
public class CalculoMatricula {
    public double CalculoPrecio(int pat, int es){
        double pagmat = 50000;
        if (pat > 2000000 && es > 3) {
            pagmat = pagmat + 0.03 * pat;
        }
        return pagmat;
    }
}
