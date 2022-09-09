package com.zohoGS.Tasks;

import java.util.Scanner;

public class Array_MatrixMultiplication {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the Number of Row in Matrix1 : ");
		int mat1_row = in.nextInt();
		System.out.println("Enter the Number of Column in Matrix1 : ");
		int mat1_col = in.nextInt();

		int[][] mat1 = new int[mat1_row][mat1_col];

		System.out.println("Enter Elements for Matrix1: ");
		for(int i = 0; i < mat1_row; i++) {
			for(int j = 0; j < mat1_col; j++) {
				mat1[i][j] = in.nextInt();
			}
		}


		System.out.println("Enter the Number of Row in Matrix2 : ");
		int mat2_row = in.nextInt();
		System.out.println("Enter the Number of Column in Matrix2 : ");
		int mat2_col = in.nextInt();

		int[][] mat2 = new int[mat2_row][mat2_col];

		System.out.println("Enter Elements for Matrix2: ");
		for(int i = 0; i < mat2_row; i++) {
			for(int j = 0; j < mat2_col; j++) {
				mat2[i][j] = in.nextInt();
			}
		}
		int[][]  mat3 = new int[mat1_row][mat2_col];

		if(mat1_col == mat2_row) {

			System.out.println("Output: ");

			for(int i = 0; i < mat1_row; i++) {		

				for(int j = 0; j < mat2_col; j++) {

					//mat3[i][j] = 0; 
					for(int k = 0; k < mat2_row; k++) {
						mat3[i][j] += mat1[i][k]*mat2[k][j];
					}
					System.out.print(mat3[i][j]+" "); 
				}
				System.out.println();
			}
		}
		else
			System.out.println("Not possible to multiply the given array!!!");

	}

}
