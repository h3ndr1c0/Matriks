/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matriks;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class Matriks_Pengurangan {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
        int i;
        int j;
        int[][]matrixA = new int[4][4];
        int[][]matrixB = new int[4][4];
        int[][]kurangMatrix= new int[4][4];
    
        
        //input matrix A

        for(i=1;i<4;i++)
        {
            for(j=1;j<4;j++)
            {
                System.out.print("Matrix A  " + i + "." + j + "= ");
                matrixA[i][j] =input.nextInt();
            }
        }

        System.out.println();

        // input matrix B
        
        for(i=1;i<4;i++)
        {
            for(j=1;j<4;j++)
            {
                System.out.print("Matrix B  " + i + "." + j + "= ");
                matrixB[i][j] =input.nextInt();
            }
        }
    
    
    
          for(i=1;i<4;i++)
        {
            for(j=1;j<4;j++)
            {
                kurangMatrix[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        
          
        //tampilan matrix A
        System.out.println("\nMatrix A\n");
        for(i=1;i<4;i++)
        {
            for(j=1;j<4;j++)
            {
                System.out.print(" " + matrixA[i][j]);
            }
            System.out.println();
        }

        //tampilan matrix B
        System.out.println("\nMatrix B\n");
        for(i=1;i<4;i++)
        {
            for(j=1;j<4;j++)
            {
                System.out.print("   " + matrixB[i][j]);
            }
            System.out.println();
        }
        
    
    
        //tampil kurangmatrix
        System.out.println("\nMatrix A - Matrix B\n");
        for(i=1;i<4;i++)
        {
            for(j=1;j<4;j++)
            {
                System.out.print(" " + kurangMatrix[i][j]);
            }
            System.out.println();
        }
    
    
    
    }
}
