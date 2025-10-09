package gopi;

import java.util.Scanner;

public class Neww {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input: ");
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
		    int ch =  str.charAt(i);
		    if(ch<=90)
		    {
		    	ch = ch+32;
		    }
		    else
		    {
		    	ch = ch - 32;
		    }
		    System.out.println((char)(ch));
		}
	}
}
