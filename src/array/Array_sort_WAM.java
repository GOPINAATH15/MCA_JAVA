package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_sort_WAM {

	public static void main(String[] args) {
		int [] arr = {5,4,3,2,1};
		System.out.println("Before Sorting: "+Arrays.toString(arr));
		sort(arr);
		System.out.println("Sorted Array: "+Arrays.toString(arr));
		System.out.println("Smallest Array: "+arr[0]);
		System.out.println("Smallest Array: "+arr[arr.length-1]);
	}
	static void sort(int[] arr) {
//		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}
