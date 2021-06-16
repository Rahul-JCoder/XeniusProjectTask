package com.Xenius.Task;

public class SodukoSolver {
		static int sudo[][] = 
			{ { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, 
			  { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, 
			  { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
			  { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, 
			  { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, 
			  { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
			  { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, 
			  { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, 
			  { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		static boolean subgrid[][] = new boolean[9][9];
		static boolean rowcheck[][] = new boolean[9][9];
		static boolean colcheck[][] = new boolean[9][9];

		public static void main(String[] args) 
		{	
			sudoku(4,6,4);
		}

		static public boolean sudoku(int i, int j, int num) {
			
			if(num>0&&num<10)
			{
				for (int a = 0; a < 9; a++)
				for (int b = 0; b < 9; b++)
					if (sudo[a][b] != 0) 
					{
						int ro, col;
						ro = (a / 3) * 3 + b / 3;
						col = sudo[a][b] - 1;
						subgrid[ro][col] = true;
						rowcheck[a][sudo[a][b]-1]=true;
						colcheck[b][sudo[a][b]-1]=true;
					}
			if(sudo[i-1][j-1]==num)
				System.out.println("Number is already fill");
			else if(!subgrid[((i-1)/3)*3+(j-1)/3][num-1])
					{
				if(!rowcheck[i-1][num-1]||!colcheck[j-1][num-1])
						{
							System.out.println("Number is valid");
							return true;
						}
			}
			}	
			System.out.println("Number is invalid!!!");
			return true;
		}
	}
