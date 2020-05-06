package com.rafa.cursojava.exerciciosLista03;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer03 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        boolean inforValida = false;
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;
        
        
        do {
            
            System.out.println("Entre com o nome: ");
            nome = scan.next();
            
            if (nome.length() >= 3){
                inforValida = true;
            } else {
                System.out.println("Nome precisa de 1 ou 3 caracteres");
            }
            
        } while (!inforValida);
        
        
        inforValida = false;
        do{
            
            System.out.println("Informe a idade: ");
            idade = scan.nextInt();
            
            if (idade  >= 0 && idade <= 150 ){
                inforValida = true;
            } else {
                System.out.println("Idade precisa ser entre 0 e 150!");
            }
        } while (!inforValida);
        
        
        inforValida = false;
        do {
            
            System.out.println("Informe o salário: ");
            salario = scan.nextDouble();
            
            if (salario > 0 ){
                inforValida =  true;

            } else {
                System.out.println("O salário precisa ser maior que 0.");
            }
        } while (!inforValida);
     
        
        inforValida = false;
        do {

            System.out.println("Informe o sexo: (F-M)");
            sexo = scan.next();
            
            if (sexo.equalsIgnoreCase("f") || 
                sexo.equalsIgnoreCase("m")){
            inforValida = true;
            } else {
                System.out.println("Sexo precisa ser F ou M");
            }
        } while (!inforValida);
        
        
        inforValida = false;
        do {
            
            System.out.println("Informe o estado civil: ");
            estadoCivil = scan.next();
           
            if (estadoCivil.equalsIgnoreCase("S") ||
                estadoCivil.equalsIgnoreCase("C") ||
                estadoCivil.equalsIgnoreCase("V") ||
                estadoCivil.equalsIgnoreCase("D")){
            inforValida = true; 
            }else {
                System.out.println("O estado civil precisa ser 'S', 'C', 'V', 'D': ");
            }
                                
        } while (!inforValida);
        
        System.out.println("As informações coletadas são: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);
    }
}