package gopi;

import java.util.Scanner;

public class New {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter input: ");
	String str = sc.nextLine();
	for(int i=0;i<str.length();i++)
	{
	    int ch =  str.charAt(i);
	    if(str.charAt(i) =='z' || str.charAt(i) =='Z')
	    {
	        System.out.println((char)(ch-25));
	    }
	    else
	    System.out.println((char)(ch+1));
	}
	sc.close();
}
}
