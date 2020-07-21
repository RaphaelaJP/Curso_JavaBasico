package com.rafa.cursojava.exerciciosLista04;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer11 {
    public static void main(String[] args) {
        
       Scanner scan = new Scanner (System.in);
       
       int vetorA [] = new int [10];
       
       for (int i = 0; i < vetorA.length; i++){
           System.out.println("Informe com o valor da posição: " + i);
           vetorA [i] = scan.nextInt(); 
       }
       
        int qtdPar = 0;
        for (int i = 0; i < vetorA.length; i++){
            if (vetorA [i] % 2 == 0){
               qtdPar++;
            }
        }
       
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA [i] + " ");
        }
        System.out.println();
        
        
        System.out.println("A quantidade de numeros pares são: " + qtdPar);
    }
}
