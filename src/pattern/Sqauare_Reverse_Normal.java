package pattern;

import java.util.Scanner;

public class Sqauare_Reverse_Normal {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		for(int i =0;i<n;i++)
		{
			if(i%2==0) 
				for(int j=0;j<n;j++)
				{
					System.out.print(j+1+" ");
				}
			else
				for(int k=n;k>0;k--)
				{
					System.out.print(k+" ");
				}
			System.out.println();
		}
	}
}
