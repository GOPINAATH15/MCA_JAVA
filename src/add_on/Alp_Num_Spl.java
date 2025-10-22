package add_on;

public class Alp_Num_Spl {

	public static void main(String[] args) {
		char a='@';
		if (a >= 'A' && a <= 'Z')
            System.out.println("Between A-Z");
        else if (a >= '0' && a <= '9')
            System.out.println("Between 0-9");
        else
        	System.out.println("Not a letter or digit");
	}
}
