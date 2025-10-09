package gopi;

import java.util.Scanner;

public class Calci1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first value: ");
		int a = sc.nextInt();
		int c= 0 ;
		while(true)
		{
			System.out.println("Enter a number for choice");
			char n = sc.next().charAt(0);
			System.out.println("Enter a second value: ");
			int b = sc.nextInt();
			switch (n) {
			case '+':
				a+=b;
				System.out.println("Addition: "+a);
				break;
			case '-':
				a-=b;
				System.out.println("Subtraction: "+a);
				break;
			case '*':
				a*=b;
				System.out.println("Multiplication: "+a);
				break;
			case '/':
				a/=b;
				System.out.println("Division: "+a);
				break;
			case '%':
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
