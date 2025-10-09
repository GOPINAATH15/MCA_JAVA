package gopi;

import java.util.Scanner;

public class Factorial_Nth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for nth value");
		int n = sc.nextInt();
		int a = 1;
		for(int i =n;i>=1;i--)
		{			
			a=a*i;
		}
		System.out.println(a);
	}
}
