/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author ESTUDIANTE
 */
public class AreaCuadrado {
    
    double lado1=10;
    double lado2=10;

    void mostrarDimension(){
      
    }
}
//Una subclase de DosDimensiones para Triangulo
class Cuadrado extends AreaCuadrado{
    String estilo;
    double area(){
        return lado1*lado2;
    }
    void mostrarEstilo(){
        System.out.println("Cuadrado es: "+estilo);
    }
    
}

