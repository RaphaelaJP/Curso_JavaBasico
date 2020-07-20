/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rafa.cursojava.aulas.Exemplos.Vetores;

import java.util.Arrays;

/**
 *
 * @author Raphaa JP
 */

public class VetorBinario {
   
    public static void main(String[] args) {
          
       int vetor [] = {3, 7, 6, 1, 9, 4, 2};
       for (int v : vetor){
            System.out.println("O valor do vetor é: " + v);
       } 
       
       int posicao = Arrays.binarySearch (vetor, 1); // o valor 1, está na posição 3.
       
       System.out.println("Encontrei o valor na posição " + posicao);

    }
}
