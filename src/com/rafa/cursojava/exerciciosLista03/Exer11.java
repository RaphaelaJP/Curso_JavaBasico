package com.rafa.cursojava.exerciciosLista03;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer11 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Infome o primeiro numero: ");
        int num1 = scan.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        int num2 = scan.nextInt();
        
        int soma = 0;
        
        
        for (int i = num1; i <= num2; i++){
            soma += i;
            
        }
        
        System.out.println("A Soma é: " + soma);
    }
    
}
