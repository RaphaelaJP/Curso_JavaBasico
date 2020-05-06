package com.rafa.cursojava.exerciciosLista03;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer13 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe a base: ");
        int base = scan.nextInt();
        
        System.out.println("Informe a potencia: ");
        int potencia = scan.nextInt();
        
        int resultado = base;
        
        for (int i = 1; i < potencia; i++){
            resultado *= base;
        }
        
        System.out.println("O resultado é: " + resultado);
    }
}
