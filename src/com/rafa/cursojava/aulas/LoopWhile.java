package com.rafa.cursojava.aulas;

/**
 *
 * @author Raphaa JP
 */
public class LoopWhile {
    
    public static void main(String[] args) {
        
      int i = 1;
      int max = 10;
      
        System.out.println("Contando de 1 até: " + max);
        
        while (i <= max){
            System.out.println("O valor de i: " + i);
            i++;   
        }
        
        System.out.println("O valor do i agora é: " + i);
         
        do {
          i++;
            System.out.println("O valor de i: " + i);
            
        }while (i < 15);  
        
        System.out.println("O valor de i, agora é: " + i);
    }  
}
