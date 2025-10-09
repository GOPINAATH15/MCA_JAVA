package gopi;

import java.util.Scanner;

public class Calci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first value: ");
		int a = sc.nextInt();
		int c= 0 ;
		while(true)
		{
			System.out.println("Enter a number for choice");
			int n = sc.nextInt();
			System.out.println("Enter a second value: ");
			int b = sc.nextInt();
			switch (n) {
			case 1:
				a+=b;
				System.out.println("Addition: "+a);
				break;
			case 2:
				a-=b;
				System.out.println("Subtraction: "+a);
				break;
			case 3:
				a*=b;
				System.out.println("Multiplication: "+a);
				break;
			case 4:
				a/=b;
				System.out.println("Division: "+a);
				break;
			case 5:
				a%=b;
				System.out.println("Modulus: "+a);
				break;
				default:
					System.out.println("Invalid Input Exiting....");
					break;
			}
		}
		
		
	}
}
