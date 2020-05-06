package com.rafa.cursojava.exerciciosLista03;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer19 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Informe o numero de notas: ");
        int notas = scan.nextInt();
        
        int soma = 0;
        int media;
        double nota;
        
        for (int i = 0; i < notas; i++){
            
            System.out.println("Informe a nota: " + (i+1));
            nota = scan.nextDouble();
            
            soma += nota;
            
        }
        
            media = soma / notas;
            
            
            System.out.println("A soma é: " + soma);
            System.out.println("Média: " + media); 
    }  
}
