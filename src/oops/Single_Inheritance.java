package oops;

class Sample{
	int rollno = 89;
	public void display() {
		System.out.println("Single Inheritance");
	}
}
//class Sample1 extends Sample{
//	public void display() {
//		System.out.println("Inheriting the property and behaviour");
//	}
//}

public class Single_Inheritance extends Sample{

	public static void main(String[] args) {

//		Demo obj = new Demo();
//		obj.display();
//		System.out.println(obj.rollno);

		
		Sample s= new Sample();
		System.out.println(s.rollno);
		s.display();
	}
}
