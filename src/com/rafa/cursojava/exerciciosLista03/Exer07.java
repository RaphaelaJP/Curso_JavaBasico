package com.rafa.cursojava.exerciciosLista03;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer07 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        int num;
        int maior = Integer.MIN_VALUE;
        
        
        for (int i = 0; i < 5; i++){
            
            System.out.println("Informe um numero: ");
            num = scan.nextInt();
            
            if (num > maior){
                maior = num;
            }
            
        }
            System.out.println("O maior numero digitado foi: " +  maior);
    }
    
}
