package com.rafa.cursojava.exerciciosLista02;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer04 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe uma letra: ");
        String letra = scan.next();
        
        
        switch(letra) {
            case "a":
            case "A":
            
            case "e":
            case "E":
            
            case "i":
            case "I":

            case "o":
            case "O":
                
            case "u":
            case "U":
                System.out.println("É uma vogal!");
            break;
            
            default:
                System.out.println("É uma consoante!");
        
        
        }

    }
}
