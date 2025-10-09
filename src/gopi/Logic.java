package gopi;

import java.util.Scanner;

public class Logic {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter the Input: ");
		String str = in.nextLine();
		for(int i=(str.length()/2) +1 ;i<str.length();i++)
		{
		    System.out.println(i);
    		switch(str.charAt(i)){
    		    case '+':
    		        System.out.println("Add");
    		        break;
    		    case '-':
    		        System.out.println("Sub");
    		        break;
    		    case '*':
    		        System.out.println("MUL");
    		        break;
    		    case '/':
    		        System.out.println("Div");
    		        break;
    		    case '%':
    		        System.out.println("Mod");
    		        break;
    		}
		}
	}
}
