package array;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = {10,20,30,45};
		for(int i =0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.println("Even");
			else
				System.out.println("Odd");
		}
	}
}
