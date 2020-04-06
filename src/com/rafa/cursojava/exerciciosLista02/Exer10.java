package com.rafa.cursojava.exerciciosLista02;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer10 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Qual turno voce estuda? ");
        String turno = scan.next();
        
        switch (turno){
            case "M":
            case "m":
                    System.out.println("Bom dia!");
                break;
                
            case "V":
            case "v":
                    System.out.println("Boa tarde!");
                break;
                
            case "N":
            case "n":
                    System.out.println("Boa noite!");
                break;
            default: System.out.println("Turno inválido!");
        }
    
    }
 
}
