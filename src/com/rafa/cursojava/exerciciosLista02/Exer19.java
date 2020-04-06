package com.rafa.cursojava.exerciciosLista02;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer19 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite um número: ");
        int num1 = scan.nextInt();
        
        System.out.println("Digite o segundo número: ");
        int num2 = scan.nextInt();
        
        System.out.println("Informe a operação que deseja realizar: (+, -, *, /)");
        String operacao = scan.next();
        
        double resultado = 0;
        boolean valido = true;
        
        switch (operacao){
            case "+":
                resultado = num1 + num2;
              break;
            case "-":
                resultado = num1 - num2;
              break;
            case "*":
                resultado = num1 * num2;
              break;
            case "/":
                resultado = num1 / num2;
              break;
            default: System.out.println("Operação Inválida!"); 
            valido = false;
              break;
            
        }
        
        if (valido){
            
            if (resultado >= 0){
                System.out.println("Resultado positivo!");
            
            } else {
                System.out.println("Resultado negavito!");
            }
            
            if (resultado % 2 == 0){
                System.out.println("É par!" + resultado);
            
            
            } else {
                System.out.println("É ímpar!" + resultado);
            
            }
        
        }
        
    }
}
