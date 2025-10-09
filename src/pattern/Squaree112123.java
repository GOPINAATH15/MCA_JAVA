package pattern;

import java.util.Scanner;

public class Squaree112123 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=4;i++)//i=3 3<=5 
		{
			for(int j=1;j<=i;j++)// j=3 , i=2 3<=2 j=4,i=3 4<=3
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
