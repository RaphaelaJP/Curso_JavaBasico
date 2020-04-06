package com.rafa.cursojava.exerciciosLista01;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer14 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o tamanho aquivo: ");
        double tamanhoArquivo = scan.nextDouble();
        
        
        System.out.println("Digite a velocidade da internet: ");
        double velocidadeNet = scan.nextDouble();
        
        
        double tempo = tamanhoArquivo / velocidadeNet;
        
        System.out.println("O tempo de download é: " + tempo + " Minutos.");
    
    
    
    
    }   
}