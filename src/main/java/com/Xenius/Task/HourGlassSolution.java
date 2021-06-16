package com.Xenius.Task;

import java.util.Scanner;
public class HourGlassSolution {

		public static void main(String[] args) 
		{
			int m,n;
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the rows and coloumn: ");
			m=scan.nextInt();
			n=scan.nextInt();
			if(m<3 || n< 3 )
				System.out.println("Invalid input");
			else {
			System.out.println("Enter the elements of matrix");
			int matrix[][]=new int[m][n];
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					matrix[i][j]=scan.nextInt();
			scan.close();
			hourglass(matrix,m,n);	
			}
		}
		public static void hourglass(int input[][],int row,int col) 
		{
			int filter[][]= {{1,1,1},{0,1,0},{1,1,1}};
			int m=row-2,n=col-2;
			int result[][]=new int[m][n];
			
			for(int a=0;a<m;a++)
				for(int b=0;b<n;b++)
					for(int c=0;c<3;c++)
						for(int d=0;d<3;d++)
							result[a][b]+=input[a+c][b+d]*filter[c][d];
							
			System.out.println("Output of given matrix is: ");
			for(int i=0;i<m;i++)
				{
					System.out.println("\n\n");
				
				for(int j=0;j<n;j++) 
					System.out.print(result[i][j]+"\t");
				}		
		}		
	}

