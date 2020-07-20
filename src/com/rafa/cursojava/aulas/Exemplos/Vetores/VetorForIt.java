package com.rafa.cursojava.aulas.Exemplos.Vetores;

import java.util.Arrays;

/**
 *
 * @author Raphaa JP
 */
public class VetorForIt {

    public static void main(String[] args) {
      
        double v [] = {5.5, 7.8, -4.5, 8.2};
        
        
        Arrays.sort(v);
        for (double valor : v){
            System.out.println("valor " + valor);
        }
    }
}
    
    
    

