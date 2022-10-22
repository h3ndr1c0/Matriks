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
public class Matriks_penjumblahan {
   public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int[][] matriksA;
		int[][] matriksB;
		int[][] matriksC;

		int baris;
		int kolom;

		// Input jumlah baris & kolom.
		// Jika jumlah baris & kolom tidak sama,
		// user diminta untuk melakukan input baris & kolom lagi

		do {
			System.out.print("Masukkan Baris: ");
			baris = input.nextInt();

			System.out.print("Masukkan Kolom: ");
			kolom = input.nextInt();

			System.out.println();

			matriksA = new int[baris][kolom];
			matriksB = new int[baris][kolom];
			matriksC = new int[baris][kolom];
		} while (baris != kolom);

		// Input Matriks A

		System.out.println("Matriks A");

		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				System.out.print("matriksA [" + i + "][" + j + "] = ");

                int isiMatriks = input.nextInt();

                matriksA[i][j] = isiMatriks;
			}
		}

        // Input Matriks B

		System.out.println("Matriks B");

        for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				System.out.print("matriksB [" + i + "][" + j + "] = ");

                int isiMatriks = input.nextInt();

                matriksB[i][j] = isiMatriks;
			}
		}

        // Hitung penjumlahan Matriks A dengan Matriks B

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriksC[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        System.out.println("\n");

        // Tampilkan Matriks A

        System.out.println("\n");

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriksA[i][j] + "   ");
            }

            System.out.println();
        }

        System.out.println("\n");

         // Tampilkan Matriks B

        System.out.println("\n");

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriksB[i][j] + "   ");
            }

            System.out.println();
        }

        // Tampilkan hasil penjumlahan Matriks A dengan Matriks B

        System.out.println("Hasil Penjumlahan Matriks A dengan Matriks B: ");

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriksC[i][j] + "   ");
            }

            System.out.println();
        }
	}
}