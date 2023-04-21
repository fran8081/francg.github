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
public class Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] matriz = new String [3][3];
    
       matriz [0][0]= "manuela";
       for (int i = 0 ;i <3;i++){
           for (int j= 0; j<3; j++){
               matriz[i][j]="manuela";
           }
       }

for(int i = 0;i<3; i++){
    for(int j = 0;j<3;j++){
        
        System.out.println("["+matriz[i][j]+"]");
}
    System.out.println("");    
}
}
}


    