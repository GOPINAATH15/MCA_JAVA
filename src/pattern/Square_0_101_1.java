package pattern;

import java.util.Scanner;

public class Square_0_101_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int temp=i;
			for(int s=0;s<n-i-1;s++)
			{
				System.out.print("  ");
			}
			for(int j =0;j<(i*2)+1;j++)
			{
				System.out.print(Math.abs(temp--) +" ");
			}
			System.out.println();
		}
	}
}
