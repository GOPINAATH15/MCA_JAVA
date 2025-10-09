package gopi;

import java.util.Scanner;

public class Valid_date {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day");
		int a = sc.nextInt();
		System.out.println("Enter the month");
		int b = sc.nextInt();
		System.out.println("Enter the year");
		int c = sc.nextInt();
		if(a>0 && a<=31 && b>0 && b<=12 && c>1900 && c<=2025)
					System.out.println("Valid Input");
		else if(a>31 && b>12 && c<1900 && c>=2025)
			System.out.println("Invalid day,month and year");
		else if(a>31)
			System.out.println("Invalid day");
		else if(b>12)
			System.out.println("Invalid month");
		else if(c<1900 && c>=2025)
			System.out.println("Invalid year");
		else
			System.out.println("Invalid input");
	}
}
