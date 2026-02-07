package string;

public class String_Palindrome {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("abcbde");
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				StringBuffer s1 = new StringBuffer(s.substring(i, j));
				
				StringBuffer s2 = new StringBuffer(s1).reverse();
				if (s1.toString().equals(s2.toString()) ) {
                    System.out.println(s2);
//				System.out.println(s1);
//				System.out.println(s2);
				
			}
			}
		}
		
	}
}
	