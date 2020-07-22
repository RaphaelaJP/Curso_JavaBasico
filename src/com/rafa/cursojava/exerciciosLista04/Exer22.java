package com.rafa.cursojava.exerciciosLista04;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer22 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        int vetorA[] = new int [10];
        
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Informe o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
            
            if (vetorA [i] % 2 != 0){
                break;
            }
        }    
    }  
}
