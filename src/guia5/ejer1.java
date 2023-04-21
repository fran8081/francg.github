/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

/**
 *
 * @author franc
 */
public class ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  int[] numeros = new int[100];
  
  for (int i = 0; i< numeros.length;i++){
      numeros[i] = i +1;
      
  }
  for (int i = numeros.length -1; i>=0;i--){
      System.out.println(numeros[i]);
        // TODO code application logic here
    }
    }   
}
