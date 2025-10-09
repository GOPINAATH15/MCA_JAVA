package gopi;

import java.util.Scanner;

public class Odd_Even {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n number: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
				System.out.println("Odd: "+i);
		}
		for(int i=2;i<=n;i++)
		{
			if(i%2==0)				
				System.out.println("Even: "+i);
		}
		sc.close();
	}

}
