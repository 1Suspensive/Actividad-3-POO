/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte2;

/**
 *
 * @author JEFERSON
 */
class Trapecio {

    int base1, base2, altura, lado1, lado2;

    public Trapecio(int base1, int base2, int altura, int lado1, int lado2) {
        this.base1 = base1;
        this.base2 = base2;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    double calcularArea() {
        return ((base1 + base2) / 2) * altura;
    }

    double calcularPerimetro() {
        return (base1 + base1 + lado1 + lado2);

    }
}
