package gopi;

import java.util.Scanner;

public class Sum_Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int fact = 1;
        for (int i = 2; i <= num+1; i++) {
            fact *= i;     
            sum += fact;   
        }
        System.out.println("Sum of the factorial is " + sum);
	}
}
