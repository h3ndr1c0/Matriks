/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriks;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class Matriks_Perkalian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukan = new Scanner(System.in);        
        
        int matrix1[] [] = new int[4][4]; //jumlah kurung siku untuk melihat dimensi dari array
        
        int matrix2[] [] = new int[4][4];
        
        System.out.println("Matrix 1");
        
        for (int a = 0; a < matrix1.length; a++){
            for (int b = 0; b < matrix1[0].length; b++)
            {
                System.out.println("Masukkan isi Baris ke  [" + a +"][" +b +"] : ");
                matrix1[a][b] = masukan.nextInt();
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        System.out.println("");
        System.out.println("Matrix 2");
        
        for (int a = 0; a < matrix2.length; a++){
            for (int b = 0; b < matrix2[0].length; b++)
            {
                System.out.println("Masukkan isi Kolom ke [" + a +"][" +b +"] : ");
                matrix2[a][b] = masukan.nextInt();
            }
            System.out.println("");
        }
        System.out.println(" ");
        System.out.println("Matrix 1 ");
        
        for (int a = 0; a < matrix1.length; a++){
            for (int b = 0; b < matrix1[0].length; b++)
            {
                System.out.print(matrix1[a][b] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Matrix 2 ");
        
        for (int a = 0; a < matrix2.length; a++){
            for (int b = 0; b < matrix2[0].length; b++)
            {
                System.out.print(matrix2[a][b] + " ");
            }
            System.out.println("");
        }
      
        
        System.out.println("");
        System.out.println("Perkalian");
        
        for (int a = 0; a < matrix1.length; a++){
            for (int b = 0; b < matrix1[0].length; b++){
                int hasil = matrix1[a][b] * matrix2[a][b];
                System.out.print(hasil + " ");
            }
            System.out.println("");
        }
    }
    
}
