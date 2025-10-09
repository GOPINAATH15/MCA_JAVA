package gopi;

public class Char_Change {

	public static void main(String[] args) {
		String str = "abz";
		for(int i=0;i<str.length();i++)
		{
		    int ch = str.charAt(i); 
		    if(ch=='z')
		    {
		    	System.out.println('a');
		    }
		    else
		    System.out.println((char)(ch+1));
		}
	}
}
