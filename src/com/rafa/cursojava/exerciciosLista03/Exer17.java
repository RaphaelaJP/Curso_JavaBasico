package com.rafa.cursojava.exerciciosLista03;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer17 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite um numero: ");
        int num = scan.nextInt();
        
        System.out.println(num + "! = " + num + " * ");
        
        int fatorial = 1;
        for (int i = num; i > 0; i--){
            fatorial *= i;
            
            System.out.println(i);
        
        }
         System.out.println("O resultado é: " + fatorial );
    }
    
}
