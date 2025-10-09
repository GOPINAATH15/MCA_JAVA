package pattern;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		for(int i =1;i<=n;i++)
		{
			for(int s=0;s<(n-i);s++)
			{
				System.out.print("  ");
			}
				for(int j=0;j<i;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
		}
	}
}
