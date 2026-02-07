package string;

import java.util.StringTokenizer;

public class String_Tokenizer {

	public static void main(String[] args) {
		StringTokenizer str = new StringTokenizer("Hello");
		System.out.println(str.countTokens());
		while(str.hasMoreTokens())
		{
			System.out.println(str.nextToken());
		}
	}
}
