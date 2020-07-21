package com.rafa.cursojava.exerciciosLista04;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer01 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        int vetA [] = new int[5];
        int vetB [] = new int[5];
        
        for (int cont = 0; cont < vetA.length; cont++){
            System.out.println("Informe o valor da posição: " + cont);
            vetA[cont] = scan.nextInt();
            
            vetB[cont] = vetA[cont];
    }
        
        System.out.print("Vetor A =  ");        
        for (int cont = 0; cont < vetA.length; cont++){
            System.out.print(vetA[cont] + " ");
        }
        System.out.println();
        
        
        System.out.print("Vetor B = ");
        for (int cont = 0; cont < vetB.length; cont++){
            System.out.print(vetB[cont] + " ");
        }
    }
}
