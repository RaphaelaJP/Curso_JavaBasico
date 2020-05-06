package com.rafa.cursojava.exerciciosLista03;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer15 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("informe o n-ésimo termo da serie de fibonacci: ");
        int n = scan.nextInt();
        
        int num1 = 1;
        int num2 = 1;
        int proximo;
        
        for (int i = 3; i <= n; i++){
        
            proximo = num1 + num2;
            num1 = num2;
            num2 = proximo;

            System.out.println(proximo);
        }  
    }
}
