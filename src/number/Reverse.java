package number;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to Reverse");
		int n = sc.nextInt();
		while(n>0)
		{
			System.out.print(n%10);
			n=n/10;
		}
	}
}
