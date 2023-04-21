/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class ejrci2conpi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("ingresar tamaño de vector");
        int dim = leer.nextInt();
        int numb,cont =0;
        int[] vector = new int[dim];
        
        for(int i=0; i< dim;i++){
            vector[i]= (int) (Math.random()*99);
            
        }
        for(int i = 0 ; i< dim;i++){
            System.out.println("["+vector[i]+ "]");
        }     
            System.out.println("ingrese numero a buscar");
            numb= leer.nextInt();
            for (int i= 0;i <dim;i++){
                if(numb== vector[i]){
                    System.out.println("el numero se encuentra "+i);
                    cont++;
                }
            }
            if(cont == 0){
    System.out.println("el numero no se encuentr en vector");
    }else if(cont >1){
                System.out.println("el numero se encuentra en vector");
            }
    }
    }

