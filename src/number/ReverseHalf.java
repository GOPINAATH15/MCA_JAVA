package number;

import java.util.Scanner;

public class ReverseHalf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to Reverse");
		int n = sc.nextInt();
		int n1=n;
		int n2=0;
		int count=0;
		while(n>0) 
		{
			n/=10;
			count++;
		}
		int i=0;
		while(i<count/2)
		{
			n2=(n2*10)+(n1%10);
			n1/=10;
			i++;
		}
		for(int j=0;j<count/2;j++)
		{
			n1*=10;
		}
		System.out.println(n1+n2);
	}
}