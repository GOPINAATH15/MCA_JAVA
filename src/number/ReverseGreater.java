package number;

import java.util.Scanner;

public class ReverseGreater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to reverse: ");
		int n = sc.nextInt();
		int n1=n;
		int n2=0;
		while(n>0)
		{
			n2 = (n2*10) + (n%10);
			n=n/10;
//			System.out.println("Reversed number is "+n);
		}
		if(n1>n2)
			System.out.println("The greatest number is :"+n1);
		else
			System.out.println("The greatest number is: "+n2);
	}
}
