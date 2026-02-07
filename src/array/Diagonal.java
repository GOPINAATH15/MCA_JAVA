package array;

import java.util.Scanner;

public class Diagonal {

	public static void main(String[] args) {
		int size = 3;
		int[][] arr = new int [size][size];
		Scanner sc = new Scanner(System.in);
		for(int r=0;r<size;r++) 
		{
			for(int c=0;c<size;c++)
			{
				arr[r][c] = sc.nextInt();
			}
			
		}
		System.out.println("Data Stored Successfully");
	}
}
