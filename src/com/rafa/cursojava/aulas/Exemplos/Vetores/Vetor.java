package com.rafa.cursojava.aulas;

/**
 *
 * @author Raphaa JP
 */
public class Vetor {
    
    public static void main(String[] args) {
        
        int num[] = {3,2,8,7,5,4};
        System.out.println("O total de posições do meu vetor é: " + num.length);
        
        for (int cont =0; cont <= 5; cont++){
            System.out.println("Na posição " + cont + " Temos o valor: " + num[cont]);
        }  
    }
}
