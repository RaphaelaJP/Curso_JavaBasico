package com.rafa.cursojava.exerciciosLista03;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer02 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        boolean inforValidas = false;

    do {
        System.out.println("Informe com o nome do usuário: ");
        String nomeUser = scan.next();
        
        System.out.println("Informe a senha: ");
        String senha = scan.next();
        
        if (nomeUser.equalsIgnoreCase (senha)){
            System.out.println("Senha inválida!! Digite novamente: ");
        } else {
            inforValidas = true;
            System.out.println("Senha e usuario, valido!");
        }
        
    } while (!inforValidas);
    
    }
}