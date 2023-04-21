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
public class ejer3 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("ingresar tamaño en vector");
               
        int n = leer.nextInt();
        int b;
        int cont;
        cont=0;
        int[] vector = new int[n];
        
        for (int i = 0; i< n; i++){
            vector[i]= (int)(Math.random()*10+1);
            System.out.print("["+ vector[i]+" ]");
            
        }
        System.out.println("ingrese el valor a buscar en el vector");
        b =leer.nextInt();
        for(int i=0;i<n;i++);{
            int i = 0;
        if(vector[i]==b){
            System.out.println("el valor "+b+"se encontro en la posicion :"+(i+1));
            cont+=1;
        }
    }
    if(cont>0){
            System.out.println("el valor "+b+"està"+"veces");
}
    else{
System.out.println("El valor"+b+"no se ecnontro en el vector");
    
}
    }}