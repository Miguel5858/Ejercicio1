
package com.mycompany.ejercicio1;


//Realizado por: Miguel - Ejercicio de triángulos
//CALCULAR AREA DE UN TRIANGULO
        
        
public class Clase1 {
    
    double base;
    double altura;
    void mostrarDimension(){
        System.out.println("La base y altura es: "+base+" y "+altura);
    }
}
//Una subclase de DosDimensiones para Triangulo
class Triangulo extends Clase1{
    String estilo;
    double area(){
        return base*altura/2;
    }
    void mostrarEstilo(){
        System.out.println("Triangulo es: "+estilo);
    }
    
        
}
