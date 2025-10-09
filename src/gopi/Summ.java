package gopi;

public class Summ {

	public static void main(String[] args) {
		String str = "5668+*-";
		int a = str.charAt(0)-'0';
		for(int i = 1;i<str.length()/2;i++) 
		{
			int b = str.charAt(i)-'0';
			int c = str.charAt(str.length()/2+i);
			switch(c) {
			case '+':
				a=a+b;
				break;
			case '-':
				a=a-b;
				break;
			case '*':
				a=a*b;
				break;
			case '/':
				a=a/b;
				break;
			case '%':
				a=a%b;
				break;
			}
		}
		System.out.println(a);
	}
}
