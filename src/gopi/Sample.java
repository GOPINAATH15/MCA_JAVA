package gopi;

public class Sample {

	public static void main(String[] args) {
		int a = 7;
//IF and ELSE Method
		if(a%2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");
//TERNARY OPERATOR
		String b = a%2==0 ? "Even" : "Odd";
		System.out.println(b);

		
	}
}
