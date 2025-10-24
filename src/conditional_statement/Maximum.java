package conditional_statement;

public class Maximum {

	public static void main(String[] args) {
		int a=7,b=15,c=3,d=9;
		int out;
		if (a > b && a > c && a > d)
            out = a;
        else if (b > c && b > d)
            out = b;
        else if (c > d)
            out = c;
        else
            out = d;
        System.out.println("Maximum is : " + out);
	}
}