package com.rafa.cursojava.exerciciosLista03;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer22 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Informe com numero de CDs: ");
        int cds = scan.nextInt();
        
        double preco;
        double soma = 0;
        
        
        for (int i = 1; i <= cds; i++){
            
            System.out.println("Informe o valor do cd: " + i);
            preco = scan.nextDouble();
            
            soma += preco;
                
        }
        
        double media = soma / cds;
        System.out.println("A média gasto com cds foi: " + media);
        
    }
    
}
