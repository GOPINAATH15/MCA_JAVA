package gopi;

public class Ternary1 {

	public static void main(String[] args) {
		char ch = 'G';
		int charval = (int) ch;//a=97
		String output = (charval>=65 && charval<=90 || charval>=97 && charval<=122 ? "Is Alplabet" : "Is Not Alpahabet");
		System.out.println(output);
	}

}

