package gopi;

public class Greater {

	public static void main(String[] args) {
		int temp = 0;
		int a[] = {23,45,67,89,90};
		for(int i=0;i<a.length;i++)
		{
//			System.out.println(a[i]);
			if(temp<a[i])
			{
				temp=a[i];
				System.out.println(temp);
			}
		}
		System.out.println("Greatest Number is :"+temp);
		for(int i=0;i<a.length;i++)
		{
			if(temp>a[i])
			{
				temp=a[i];
				System.out.println(temp);
			}
		}
		System.out.println("Smallest number is :"+temp);
	}
}
