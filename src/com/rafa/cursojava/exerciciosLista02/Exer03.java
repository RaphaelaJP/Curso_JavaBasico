package com.rafa.cursojava.exerciciosLista02;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer03 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite uma letra (F OU M): ");
        String letra = scan.next();
        
        if (letra.equalsIgnoreCase("f")){
            System.out.println("F -  Feminino");
        
        } else if (letra.equalsIgnoreCase("m")){
            System.out.println("M - Masculino");
        
        } else {
            System.out.println("Sexo Inválido!");
        }
    }
}
