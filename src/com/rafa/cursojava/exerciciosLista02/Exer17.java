package com.rafa.cursojava.exerciciosLista02;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer17 {
  
    public static void main(String[] args) {
        
       Scanner scan = new Scanner (System.in);
       
        System.out.println("Digite um ano: ");
        int ano = scan.nextInt();
        
        if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
                System.out.println("É Bissexto");
        
        } else {
            System.out.println("Não é Bissexto!");
        }
    }
}
