package gopi;

public class Number {

	public static void main(String[] args) {
		int n=100;
		
		for(int i=1;i<=n;i++)
		{
			if (i%3==0 && i%5==0)
			{
				
				
				System.out.println("ab");
			}
			else if(i%3==0)
			{
				
				System.out.println("a ");
			}
			else if(i%5==0)
			{				
				
				System.out.println("b");
			}
			
			else
			{
				System.out.println(i);
			}
		}
	}
}
