package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Sort {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the array numbers: ");
		int arr[] = {10,45,2,89,102};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Smallest array: "+arr[0]);
		System.out.println("Largest array: "+arr[arr.length-1]);
	}
}
