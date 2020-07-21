package com.rafa.cursojava.exerciciosLista04;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer14 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
    
        int vetor [] = new int [10];
        
        for (int i = 0; i < vetor.length; i++){
            System.out.println("informe o valor da posição : " + i);
            vetor [i] = scan.nextInt();
        }
        
        int soma = 0;
        int impar = 0;
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] % 2 != 0){
                soma += vetor[i];
                impar++;
                
            } 
        }
        
        System.out.print("Vetor = ");
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        
        System.out.println("A soma: " + soma);
        System.out.println("A média é: " + (soma/impar));
    }
}
