package com.rafa.cursojava.exerciciosLista01;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer05 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);

        System.out.println("Informe a quantidade de metros: ");
        double metros = scan.nextDouble();
        
        // 1m = 100cm
        double cm = metros * 100;
        
        
        System.out.println("A quantidade em centimetros é: " + cm);
       
    }
}
