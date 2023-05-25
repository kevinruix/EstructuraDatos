/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Edificio C
 */
public class DiagonalSum {
public class Diagonal {
    public static void main(String[] args) throws Exception {
        int[][] matriz = {{2,10,10},{10,1,10},{10,10,3}};
        int result = sumDiagonal(matriz);
        System.out.println(result);
    }
    
    public static int sumDiagonal(int[][] matriz) throws Exception{
        if(!Cuadrada(matriz)){
            throw new Exception("no es una matriz cuadrada");
        }
        int dim = matriz.length;
        int result = 0;
        for(int i=0; i < dim; i++){
            result += matriz[i][i];
        }
        return result;
    }
    
    public static boolean Cuadrada(int[][] matriz){
        int dim = matriz.length;
        for(int i=0; i < dim; i++){
            if(matriz[i].length != dim){
                return false;
            }
        }
        return true;
    }
}
}
