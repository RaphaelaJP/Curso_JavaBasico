package com.rafa.cursojava.exerciciosLista03;

/**
 *
 * @author Raphaa JP
 */
public class Exer04 {
    
    public static void main(String[] args) {
        
        int populacaoA = 80000;
        int populacaoB = 200000;
        int cont = 0;
        
        while (populacaoA < populacaoB){
        
            populacaoA += (populacaoA / 100) * 3;
            populacaoB += (populacaoB / 100) * 1.5;
            cont++;
            
        }
        
        System.out.println("A população A: " + populacaoA);
        System.out.println("A população B: " + populacaoB);
        System.out.println("A quantidade de anos:  " + cont);
    }
    
}
