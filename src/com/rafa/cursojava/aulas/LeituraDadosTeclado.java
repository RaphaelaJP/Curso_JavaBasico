package com.rafa.cursojava.aulas;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class LeituraDadosTeclado {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();
        
        System.out.println("Informe a sua idade: ");
        int idade = scan.nextInt();
        
        
        System.out.println("O nome informado foi: " + nome + ". E a idade é: " + idade);
       
        
    }
    
}
