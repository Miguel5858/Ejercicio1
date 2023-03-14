/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;
//miguelito

import javax.swing.JOptionPane;


/**
 *
 * @author ESTUDIANTE
 */
public class Ejercicio1 {

    public static void main(String[] args) {
       //System.out.println("Hello World!");
       //JOptionPane.showMessageDialog(null, "Hola Mundo!");
       
        Triangulo t1=new Triangulo();
        Triangulo t2=new Triangulo();
        t1.base=4.88;
        t1.altura=6.50;
        t1.estilo="Estilo 1";
        t2.base=7.78;
        t2.altura=12.77;
        t2.estilo="Estilo 2";
        System.out.println("Información para T1: ");
        t1.mostrarEstilo();
        t1.mostrarDimension();
        System.out.println("Su área es: "+t1.area());
        System.out.println();
        System.out.println("Información para T2: ");
        t2.mostrarEstilo();
        t2.mostrarDimension();
        System.out.println("Su área es: "+t2.area());

        
        System.out.println("========================================");
     
        Cuadrado Cuadrado = new Cuadrado();          
        System.out.println("El área del cuadrado es: "+Cuadrado.area());

    }
}
