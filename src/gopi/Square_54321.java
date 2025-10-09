package gopi;

import java.util.Scanner;

public class Square_54321
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n= sc.nextInt() ;
		for(int i=0;i<n;i++)
		{
		    for(int s=0;s<i;s++)
		    {
		        System.out.print("  ");//space
		    }
		    for(int j=0;j<(n-i);j++)
		    {
		        System.out.print(n-j - i+" ");
		    }
		    System.out.println();
		}
	}
}