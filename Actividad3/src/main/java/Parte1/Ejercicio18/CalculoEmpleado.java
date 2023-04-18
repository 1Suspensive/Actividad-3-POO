/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1.Ejercicio18;

/**
 *
 * @author JEFERSON
 */
public class CalculoEmpleado {
    public int CaculoBruto(int Horas, int Valor){
        int SalarioBruto;
        SalarioBruto = Horas * Valor;
        return SalarioBruto;
    }
    public double CalculoNeto(int Horas, int Valor, double Porcentaje){
        double SalarioNeto;
        Porcentaje = Porcentaje/100;
        SalarioNeto = (Horas*Valor)-(Horas*Valor*Porcentaje);
        return SalarioNeto;
    }
}
