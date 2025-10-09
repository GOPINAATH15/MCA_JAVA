package gopi;

public class Unary {

	public static void main(String[] args) {
//	System.out.println("Hello");
//		System.out.println("The Bitwise Operator");
//		System.out.println("OR is: "+(9|6));
//		System.out.println("AND is: "+(9&6));
//		System.out.println("XOR is: "+(9^7));
		int a =1;
		int b=2;
		System.out.println("...Swapping Two numbers using XOR...");
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("The value of a is:"+a);
		System.out.println("The value of b is:"+b);
		int c=1,d=2;
		int e=c*d,f=d-c;
		System.out.println("...Swapping numbers using Arthmetic Operator...");
		System.out.println("The valus of c is:"+e);
		System.out.println("The value of d is:"+f);
		System.out.println("...Swapping numbers using Another Variable...");
		int num1=20,num2=30;
		int swap=num2;
		num2=num1;
		num1=swap;
		System.out.println("The num1 value is :"+num1);
		System.out.println("The num2 value is :"+num2);
	}

}
