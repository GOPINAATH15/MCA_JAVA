package gopi;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for A");
		int a = sc.nextInt();
		System.out.println("Enter a number for B");
		int b= sc.nextInt();
		System.out.println("Enter the number for N");
		char n = sc.next().charAt(0);
		switch(n){
		case '+':
			System.out.println("Addition: "+(a+b));
			break;
		case '-':
			System.out.println("Subtraction: "+(a-b));
			break;
		case '*':
			System.out.println("Multiplication: "+(a*b));
			break;
		case '/':
			System.out.println("Division: "+(a/b));
			break;
		case '%':
			System.out.println("Modulus: "+(a%b));
			break;
			default:
				System.out.println("Invalid such a case");
		}
		sc.close();
	}
}
