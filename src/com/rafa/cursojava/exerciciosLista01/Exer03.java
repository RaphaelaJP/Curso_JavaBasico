package com.rafa.cursojava.exerciciosLista01;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer03 {
    
    public static void main(String[] args) {
       
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Informe o primeiro numero: ");
        int num1 = scan.nextInt();
        
        System.out.println("Informe o segundo numero: ");
        int num2 = scan.nextInt();
        
        int resultado = (num1 + num2);
        
        System.out.println("O resultado da soma é: " + resultado);
    }
}
