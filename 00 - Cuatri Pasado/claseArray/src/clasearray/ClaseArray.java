
package clasearray;

import java.util.Arrays;

public class ClaseArray {

    public static void main(String[] args) {
        int[][] matriz = new int[2][3];
        
        matriz[0][0] = 10;
        matriz[0][1] = 20;
        matriz[0][2] = 30;
        
        matriz[1] = new int[] {40,50,60}; // agrega toda una fila
        
        int [][] matriz2 = { { 5,5}, {6,6}, {7,7}};

        //System.out.println(Arrays.toString(matriz[1]));
        //System.out.println(matriz[1][1]);
        
       // for (int i = 0; i < matriz.length; i++) {
       //     for (int j = 0; j < matriz[i].length; j++) {
       //         System.out.println(matriz[i][j]);
       //     }
       // }
        
        for (int[] fila : matriz){
            for (int valor : fila) {
                System.out.println(valor);
            }
        }
    }
    
}