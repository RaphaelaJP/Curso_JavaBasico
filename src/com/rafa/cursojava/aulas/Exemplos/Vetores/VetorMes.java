package com.rafa.cursojava.aulas;

/**
 *
 * @author Raphaa JP
 */
public class VetorMes {
    public static void main(String[] args) {
        
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai",  "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        
        int totDias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for (int i = 0; i < mes.length; i++){
            
            System.out.println(" O mes " + mes[i] + " tem " + totDias[i] + " dias!");
        } 
    }
}
