package com.rafa.cursojava.exerciciosLista02;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer01 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite o primeiro numero: ");
        int num1 = scan.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        int num2 = scan.nextInt();
        
        if (num1 > num2){
            System.out.println("O num1 é maior: " + num1);
        
        } else {
            System.out.println("O num2 é maior: " + num2);
        }
    
    }
}
