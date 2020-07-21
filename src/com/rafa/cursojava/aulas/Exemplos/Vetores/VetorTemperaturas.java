package com.rafa.cursojava.aulas.Exemplos.Vetores;

/**
 *
 * @author Raphaa JP
 */
public class VetorTemperaturas {
    
    public static void main(String[] args) {
        
        //Armazenar temperaturas 
        double temperaturas[] = new double[365];
        
        for (int cont = 0; cont <=365; cont++){
            System.out.println(temperaturas[cont]);
            
        }
                // OU
                
        for (double temp : temperaturas){
            System.out.println(temp);
        }
        
    }
    
}
