package com.rafa.cursojava.exerciciosLista03;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer18 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        
        System.out.println("Digite um numero: ");
        int num = scan.nextInt();
        
        
        boolean primo = true;
        for (int i = 2; i < num; i++){
            
            if(num % i == 0){
                System.out.println("Não é primo!!");
                primo = false;
                
            }
        }
        if (primo){
            System.out.println("É primo!!");
        
        }
    }
    
}
