package com.rafa.cursojava.exerciciosLista02;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer15 {
    
    public static void main(String[] args) {
        
      Scanner scan = new Scanner (System.in);
      
      System.out.println("Digite o primeiro lado: ");
        int lado1 = scan.nextInt();
        
        System.out.println("Digite o segundo lado: ");
        int lado2 = scan.nextInt();
        
        System.out.println("Digite o terceiro lado: ");
        int lado3 = scan.nextInt();
        
        
        if (((lado1 + lado2) > lado3) ||
            ((lado1 + lado3) > lado2) ||
            ((lado2 + lado3) > lado1)) {
        
        if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
            System.out.println("É um triangulo Équilátero");
        
        } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2){
            System.out.println("É um triangulo Escaleno");
        
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            System.out.println("É um triangulo Isóceles");
        
        }

        } else {
            System.out.println("Não é um triângulo!");
        }
      
    }
}
