package com.rafa.cursojava.exerciciosLista01;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer13 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor hota: ");
        double valorHora = scan.nextDouble();
        
        System.out.println("Digite com a quantidade de horas trabalhadas no mês: ");
        double horas = scan.nextDouble();
        
        double salarioBruto = valorHora * horas;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double ir = (salarioBruto / 100) * 11;
        double totalDesconto = inss + sindicato + ir;
        double salarioLiquido = salarioBruto - totalDesconto;
       
        System.out.println("O salario bruto: " + salarioBruto);
        System.out.println("INSS: " + inss);
        System.out.println("Sincidato: " + sindicato);
        System.out.println("IR: " + ir);
        System.out.println("Total de Descontos: " + totalDesconto);
        System.out.println("Salário líquido: " + salarioLiquido);
        

        
        
        
        
    }
}
