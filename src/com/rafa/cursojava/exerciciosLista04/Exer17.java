package com.rafa.cursojava.exerciciosLista04;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer17 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        int vetorIdade [] = new int [10];
        
        for (int i = 0; i < vetorIdade.length; i++){
            System.out.println("Informe a idade: " + i);
            vetorIdade[i] = scan.nextInt();
        }
        
        int qtd = 0;
        for (int i = 0; i < vetorIdade.length; i++){
            if (vetorIdade [i] > 35){
                qtd++;
            }
        }
        
        System.out.print("O vetor de idade = ");
        for(int i = 0; i < vetorIdade.length; i++){
            System.out.print(vetorIdade[i] + " ");
        }
        System.out.println();

        System.out.println("A quantidade de pessoas com idade > que 35 são: " + qtd);
    }  
}
