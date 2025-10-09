package gopi;

import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year to check whelther it is leap or not");
		int year = sc.nextInt();
		String s =((year % 400 ==0) || (year%4==0 && year %100!=0))?"Leap year" : "Not a leap year";
		System.out.println(s);
		sc.close();
	}
}

//String s = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) ? "Leap Year": "Not a Leap Year";
//        System.out.println(s);