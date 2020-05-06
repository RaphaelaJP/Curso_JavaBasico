package com.rafa.cursojava.aulas;

/**
 *
 * @author Raphaa JP
 */
public class LoopFor {
    
    public static void main(String[] args) {
        
       for (int i = 0; i <= 5; i++){
           System.out.println("O valor de i é: " + i);
       } 
       
       for (int i = 5; i > 0; i--){
           System.out.println("Decrescendo o valor de i: " + i);
       }
       
       

       // usando duas variaveis dentro do for.
       for (int i = 0 , j = 10; i < j; i++, j-- ){
           System.out.println("i = " + i + "; j = " + j );

       }
    }
    
}
