package oops;

public class Demo_Difference {

	 int balance = 0;
	public static void main(String[] args) {
		
		Demo_Difference user1= new Demo_Difference();
		Demo_Difference user2= new Demo_Difference();
		Demo_Difference user3= new Demo_Difference();

		user1.balance=9000;
		System.out.println(user1.balance);
		user2.balance=5000;
		System.out.println(user2.balance);
		user2.balance=8000;
		System.out.println(user2.balance);
		System.out.println(user1.balance);
		System.out.println(user3.balance);
	}
}
