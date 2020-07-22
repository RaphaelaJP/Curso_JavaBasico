package com.rafa.cursojava.exerciciosLista04;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer24 {
   
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        int vetorA [] = new int [20];
        int vetorB [] = new int [vetorA.length]; //pares
        int vetorC [] = new int [vetorA.length]; // impares
        
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Informa o valor da posição:  "+ i);
            vetorA[i] = scan.nextInt();   
        }
        
        int posicaoB = 0;
        int posicaoC = 0;
        
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA [i] % 2 == 0){
               
               vetorB[posicaoB] = vetorA[i];
               posicaoB++;
            
            } else {
                
                vetorC[posicaoC] = vetorA[i];
                posicaoC++;
            }
        }
        
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        System.out.print("Vetor B é formado por números par = ");
        for (int i = 0; i < posicaoB; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
            
        System.out.print("Vetor C é formado por número ímpar = ");
        for (int i = 0; i < posicaoC; i++) {
            System.out.print(vetorC [i] + " ");
        }    
    }
}
