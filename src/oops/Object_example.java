package oops;

public class Object_example {

	static int rollno= 89;//Global Variable/Instance Variable
	int id = 1;
//	fun()
//	{
//		int i = 2;Local Variable
//	}
	public static void main(String[] args) {
		System.out.println(rollno);
//		System.out.println(Random_class.name);
		Object_example i = new Object_example();
		System.out.println(i.id);
	}
}
