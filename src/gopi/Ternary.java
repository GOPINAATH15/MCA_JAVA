package gopi;

public class Ternary {

	public static void main(String[] args) {
		int a=10,b=20,z=90;
		String s = ((a>b) && (b>z)) ? "A is greater" : (b>z) && (b>a) ? "B is greater" :"Z is greater";
		System.out.println(s);

	}

}
