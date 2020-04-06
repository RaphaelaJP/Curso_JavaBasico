package com.rafa.cursojava.exerciciosLista01;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer08 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite o valor/hora: ");
        double valorHora =  scan.nextDouble();
        
        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double horas = scan.nextDouble();
        
        double salario = valorHora * horas;
        
        System.out.println("O salario é: " +  salario);
        
        
        
        
        
    }
}
