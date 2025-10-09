package gopi;
import java.util.*;

public class Sample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a =7;
//		String b = a%2==0 ? "Even" : "Odd";
//		String c = a%2==0 ? "Even" : "odd";
//		System.out.println(c);
		System.out.println("Enter the number");
		int b = sc.nextInt();
		if(b%2==0)
			System.out.println("Even");
		else
			System.out.println("odd");
	}
}
