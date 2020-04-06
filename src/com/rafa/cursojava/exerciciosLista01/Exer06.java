package com.rafa.cursojava.exerciciosLista01;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer06 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Informe o raio do circulo: ");
        double raio = scan.nextDouble();
        
        double area = Math.PI * Math.pow (raio, 2);
        
        System.out.println("A area do circulo é: " +  area);

    }
}
