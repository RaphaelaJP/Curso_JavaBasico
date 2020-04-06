package com.rafa.cursojava.aulas;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class IfElse {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        
        if(idade >= 18){
            System.out.println("É maior de idade!!");
        } else {
            System.out.println("É menor de idade!");
        }
        
        System.out.println("=======================//==================================");
    
        //barato <= 10
        // 10 < valor < 15 - Pedir desconto
        // 15 <= valor 17 - Pesquisar mais
        // valor >= 17 - muito caro
        
        System.out.println("Informe o valor do item: ");
        double valor = scan.nextDouble();
        
        if (valor <= 10){
            System.out.println("Está acessível, pode comprar!");
        
        } else if (valor >= 10 && valor < 15){
            System.out.println("Pedir desconto!");
        
        } else if (valor >= 15 && valor < 17){
            System.out.println("Pesquisar mais!");
        
        } else if (valor >= 17){
            System.out.println("Muito caro, não compre!");
        }
        
    }
}
