package com.rafa.cursojava.exerciciosLista03;

import java.util.Scanner;

/**
 * * @author Raphaa JP
 */
public class Exer20 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Informe a quantidade de idades: ");
        int idades = scan.nextInt();
        
        
        int idade;
        int soma= 0;
        
        for (int i = 0; i < idades; i++){
            System.out.println("informe da idade da pessoa: " + (i+1));
            idade = scan.nextInt();
            
            soma += idade;
        }
        
        double media = soma / idades;
        System.out.println("A média de idade é: " + media);
        
        if (media >= 0 && media <= 25){
            System.out.println("Jovem!");
        } else if (media >= 26 && media <= 60){
            System.out.println("Adulta!");
        } else if (media > 60){
            System.out.println("Idosa!");
        }
    } 
}
