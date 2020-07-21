package com.rafa.cursojava.exerciciosLista04;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer16 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        int vetor [] = new int [10];
        
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Informe o valor da posição: " + i);
            vetor [i] = scan.nextInt();    
        }
        
        int somaMaior15 = 0;
        int somaMenor15 = 0;
        int qtdMaior15 = 0;
        int igual5 = 0;
        
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] == 15){
                igual5++;   
            
            } else if (vetor[i] < 15){
                somaMenor15 += vetor[i];
            
            }  else {
                qtdMaior15++;
                somaMaior15 += vetor[i];
            }
        }
    
        System.out.println("Vetor = ");
        for (int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i] + " ");
        }

        System.out.println();
        
        System.out.println("Quantidade de numeros igual a 15: " + igual5);
        System.out.println("Soma dos numeros menor que 15: " + somaMenor15);
        System.out.println("Media dos numeros maior que 15: " + (somaMaior15/qtdMaior15));    
    }    
}
