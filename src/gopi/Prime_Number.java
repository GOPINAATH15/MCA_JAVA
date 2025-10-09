package gopi;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
			if((n/n==1 && n%2!=0) || (n%3!=0))
				System.out.println(n+" is a Prime Number");
			else
				System.out.println(n+" is not a Prime");
	}
}
