package com.rafa.cursojava.exerciciosLista03;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer01 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        boolean notaValida = false;
        
      do {
        
        System.out.println("Informe uma nota: ");
        double nota = scan.nextDouble();
     
        if (nota >= 0 && nota <= 10){
            notaValida = true;
            System.out.println("voce informou a nota: " + nota);
        
        }else {
            //notaValida = false;
            System.out.println("Nota inválida, digite novamente!");
        }
    
      }while (!notaValida);
    
    }
    
}
