package com.rafa.cursojava.exerciciosLista02;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer05 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Informe a primeira nota: ");
        double nota1 = scan.nextDouble();
        
        System.out.println("Informe a segunda nota: ");
        double nota2 = scan.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        if (media == 10){
            System.out.println("Aprovado com Distinção!");
        
        } else if (media >= 7){
            System.out.println("Aprovado!");
        
        } else {
            System.out.println("Reprovado!");
        }
    }
}
