package pattern;

import java.util.Scanner;

public class Sqauare_Reverse_Normal2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int even=1,odd=n;
			for(int j=0;j<n;j++)
			if(i%2==0)
				System.out.print(even ++ +" ");
			else
				System.out.print(odd-- + " ");
			System.out.println();
		}
	}
}
