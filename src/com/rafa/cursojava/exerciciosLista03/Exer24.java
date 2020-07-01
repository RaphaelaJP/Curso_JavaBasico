package com.rafa.cursojava.exerciciosLista03;

/**
 *
 * @author Raphaa JP
 */
public class Exer24 {
    
    public static void main(String[] args) {
        
        System.out.println("Preço do pão: R$ 0.18");
        System.out.println("Panificadora Pão dos Sonhos - Tabela de preços");
        
        for (int i=1; i<=50; i++){
            System.out.println(i + " - R$ " + (0.18*i));
        }
    }
    
}
