package com.rafa.cursojava.exerciciosLista01;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer12 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        
        double pesoIdeal = (72.7 * altura) - 58;
        
        System.out.println("O peso ideal é: " + pesoIdeal);
    }
}
