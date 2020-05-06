package com.rafa.cursojava.exerciciosLista03;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer08 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        int num;
        int soma = 0;
        int media;
        
        for (int i = 0; i < 5; i++){
            System.out.println("Digite um numero: ");
            num = scan.nextInt();
            
            soma += num;
        }
            media = soma / 5;
            
            System.out.println("A soma é: " + soma);
            System.out.println("A média é: " + media);
    }
    
}
