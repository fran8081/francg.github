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
public class ejerc5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //DecimalFormat df = new DecimalFormat("###.##");
        Integer tam = 0;
        boolean teste = false;

        System.out.println("ingrese el tamaño de la matriz");
        tam = leer.nextInt();
        Integer mat[][] = new Integer[tam][tam];
        Integer m[][] = new Integer[tam][tam];

        System.out.println("ingrese los elementos de la matriz");
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.println("columna" + (i + 1) + "  fila" + (j + 1));
                mat[i][j] = leer.nextInt();
                m[i][j] = mat[i][j];
            }
        }

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                mat[j][i] = mat[i][j];
            }
        }

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                m[i][j] = -m[i][j];
            }
        }

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if ((mat[j][i]) == (m[i][j])) {
                    teste = true;
                } else {
                    teste = false;
                }
            }
        }
        if (teste == true) {
            System.out.println("la matriz es antisimétrica");
        } else {
            System.out.println("la matriz no es antisimétrica");
        }
    }
}
        
    
    

