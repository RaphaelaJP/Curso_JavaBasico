package com.rafa.cursojava.exerciciosLista01;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer11 {
   
    public static void main(String[] args) {
        
        Scanner scan =  new Scanner (System.in);
       
        System.out.println("Informe um numero: ");
        int num1 = scan.nextInt();
        
        System.out.println("Informe o segundo numero: ");
        int num2 = scan.nextInt();
        
        System.out.println("Informe o terceiro numero: ");
        double num3 = scan.nextDouble();
        
        int resultado = (num1 * 2) * (num2 / 2);
        double resultado2 = (num1 * 3) + num3;
        double resultado3 = Math.pow(num3, 3);
        
        System.out.println("O resultado 1: " + resultado);
        System.out.println("O resultado2: " + resultado2);
        System.out.println("O resultado 3: " + resultado3);
        
        
        
        
        
        
        
    }
}
