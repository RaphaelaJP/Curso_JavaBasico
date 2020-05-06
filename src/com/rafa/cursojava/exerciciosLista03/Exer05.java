package com.rafa.cursojava.exerciciosLista03;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer05 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double populaA;
        double populaB;
        double taxaPopulaA;
        double taxaPopulaB;
        
        boolean valido = false;
        do {
            
            System.out.println("informe a quantidade da população A:");
            populaA = scan.nextDouble();
            
            if (populaA > 0){
                valido = true;
            } else {
                System.out.println("População A precisa ser maior que 0.");
            }
            
        } while (!valido);
        
        
        valido = false;
        do {
            
            System.out.println("informe a quantidade da população B:");
            populaB = scan.nextDouble();
            
            if (populaB > 0){
                valido = true;
            } else {
                System.out.println("População B precisa ser maior que 0.");
            }
            
        } while (!valido);
        
        
        valido = false;
        do {
            
            System.out.println("Entre com a taxa de crescimento da população A:");
            taxaPopulaA = scan.nextDouble();
            
            if (taxaPopulaA > 0){
                valido = true;
            } else {
                System.out.println("Taxa de crescimento A precisa ser maior que 0.");
            }
            
        } while (!valido);
        
        
        valido = false;
        do {
            
            System.out.println("Entre com a taxa de crescimento da população B:");
            taxaPopulaB = scan.nextDouble();
            
            if (taxaPopulaB > 0){
                valido = true;
            } else {
                System.out.println("Taxa de crescimento B precisa ser maior que 0.");
            }
            
        } while (!valido);
        
        
        int cont = 0;
        
        while (populaA < populaB){
            
            populaA += (populaA/100) * taxaPopulaA;
            populaB += (populaB/100) * taxaPopulaB;
            cont++;
        }
        
        System.out.println("População A: " + populaA);
        System.out.println("População B: " + populaB);
        System.out.println("Qtd anos: " + cont);
    }  
}
