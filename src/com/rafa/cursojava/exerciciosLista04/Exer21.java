package com.rafa.cursojava.exerciciosLista04;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer21 {
    
    public static void main(String[] args) {
        
        //Scanner scan = new Scanner (System.in);
        
        int vetorA[] = new int [10];
        int qtd0 = 0;
        int qtd1 = 0;
        
        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = (int) Math.round(Math.random() * 1);
            
            if (vetorA [i] == 0){
                qtd0++;
            } else {
                qtd1++;
            }   
        }
        
        double porcentagem0 = (qtd0 * 100) / vetorA.length;
        double porcentagem1 = (qtd1 * 100) / vetorA.length;
        
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++ ){
            System.out.print(vetorA [i] + " ");
        }
        System.out.println();
        
        
        System.out.println("A porcentagem 0 é:  " + porcentagem0);
        System.out.println("A porcentagem 1 é: " + porcentagem1);








        
        
    }   
}
