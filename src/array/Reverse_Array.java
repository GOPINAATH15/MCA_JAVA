package array;

public class Reverse_Array {

	public static void main(String[] args) {
		String str ="This is a Note";
		String a [] = str.split(" ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
}
