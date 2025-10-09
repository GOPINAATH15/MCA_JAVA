package method;

import java.util.Scanner;

public class Main {

	void display(int a,int b) {
		System.out.println("Addition of A and B is: "+(a+b));
	}
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n=sc.nextInt();
		Main m = new Main();
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			m.display(a,b);
		}
	}
}
