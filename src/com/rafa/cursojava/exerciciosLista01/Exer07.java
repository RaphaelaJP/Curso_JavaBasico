package com.rafa.cursojava.exerciciosLista01;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer07 {
   
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o tamanho do lado do quadrado: ");
        double lado = scan.nextDouble();
        
        //area = lado * lado
        double area = Math.pow(lado, 2);
        
        System.out.println("A area do quadrado é: " + area);
        System.out.println("O dobro da area do quadrado é: " + (area * 2));
        
        
        
    }
}
