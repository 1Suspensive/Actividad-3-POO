/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte2;

/**
 *
 * @author JEFERSON
 */
class Rombo {

    int lado, diagonalmayor, diagonalmenor;

    public Rombo(int lado, int diagonalmayor, int diagonalmenor) {
        this.lado = lado;
        this.diagonalmayor = diagonalmayor;
        this.diagonalmenor = diagonalmenor;
    }

    double calcularArea() {
        return (diagonalmayor * diagonalmenor / 2);
    }

    double calcularPerimetro() {
        return (lado * 4);
    }
}
