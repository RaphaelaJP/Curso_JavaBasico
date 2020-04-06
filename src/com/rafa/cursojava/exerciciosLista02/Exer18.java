package com.rafa.cursojava.exerciciosLista02;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer18 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Informe um numero: ");
        int num = scan.nextInt();
        
        if (num % 2 == 0){
            System.out.println ("É par!");
            
        } else {
            System.out.println("É ímpar!");
        } 
    }
}
