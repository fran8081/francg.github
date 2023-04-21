/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;


 
 import java.util.Scanner;
 
public class matrizmag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear la matriz 3x3
        Scanner sc = new Scanner(System.in); 
            // Crear la matriz 3x3
            int[][] cuadrado = new int[3][3];
            
            // Leer los números del usuario y guardarlos en la matriz
            System.out.println("Introduce los números del cuadrado mágico (del 1 al 9): ");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    cuadrado[i][j] = sc.nextInt();
                }
            }
            
            // Comprobar que los números introducidos son correctos (del 1 al 9)
            boolean numerosCorrectos = true;
            boolean[] numerosUtilizados = new boolean[10]; //  verificar que los números no sean repetidos
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int num = cuadrado[i][j];
                    if (num < 1 || num > 9 || numerosUtilizados[num]) {
                        numerosCorrectos = false;
                        break;
                    } else {
                        numerosUtilizados[num] = true;
                    }
                }
            }
            
            if (!numerosCorrectos) {
                System.out.println("Los números introducidos no son correctos.");
            } else {
                // Calcular la suma de la primera fila para comparar con las demás sumas
                int sumaFila = cuadrado[0][0] + cuadrado[0][1] + cuadrado[0][2];
                
                // Comprobar filas
                boolean filasMagicas = true;
                for (int i = 1; i < 3; i++) {
                    int suma = cuadrado[i][0] + cuadrado[i][1] + cuadrado[i][2];
                    if (suma != sumaFila) {
                        filasMagicas = false;
                        break;
                    }
                }
                
                // Comprobar columnas
                boolean columnasMagicas = true;
                for (int i = 0; i < 3; i++) {
                    int suma = cuadrado[0][i] + cuadrado[1][i] + cuadrado[2][i];
                    if (suma != sumaFila) {
                        columnasMagicas = false;
                        break;
                    }
                }
                
                // Comprobar diagonales
                boolean diagonal1Magica = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2] == sumaFila;
                boolean diagonal2Magica = cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0] == sumaFila;
                
                // Determinar si el cuadrado es mágico o no
                if (filasMagicas && columnasMagicas && diagonal1Magica && diagonal2Magica) {
                    System.out.println("El cuadrado es mágico.");
                } else {
                    System.out.println("El cuadrado no es mágico.");
                }
            }
        }
    }


    
