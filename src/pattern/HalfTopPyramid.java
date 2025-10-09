package pattern;

import java.util.Scanner;

public class HalfTopPyramid {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n =sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int s=0;s<(n-i);s++)
			{
				System.out.print("  ");
			}
			for(int j =0 ;j<(i*2)+1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
