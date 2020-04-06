package com.rafa.cursojava.exerciciosLista02;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer02 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite um valor: ");
        int num = scan.nextInt();
        
        if (num >= 0){
            System.out.println("O número é positivo!");
            
        } else if (num <= 0){
            System.out.println("O número é negativo!");
        }
    }
}