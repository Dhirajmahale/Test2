package com.array.multidimensional;

import java.util.Scanner;


/**
 * @author DELL
 * @date
 *
 */
public class SearchNumber1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Size of row and colum :");
		 int row =scanner.nextInt();
		 int col =scanner.nextInt();
		 
		 int [][]a=new int [row][col];
		 
		 System.out.println("Enter the number of Arrray :");
		 for(int i=0; i<row; i++) {
			 for(int j=0; j<col; j++) {
				 a[i][j] = scanner.nextInt();
			 }
		 }
		 
		 System.out.println("Printing Array :");
		 for(int i=0; i<row; i++) {
			 for(int j=0; j<col; j++) {
				 System.out.print(a[i][j]+" ");
			 }
			 System.out.println();
		 }
		 
		 System.out.println("Enter the searching number :");
		 int search=scanner.nextInt();
		 for(int i=0; i<row; i++) {
			 for(int j=0; j<col; j++) {
				 if(a[i][j]==search) {
					 System.out.println(a[i][j]+" found At location ("+i+","+j+")");
				 }
				 
			 }
		 }
		 
	}
}
