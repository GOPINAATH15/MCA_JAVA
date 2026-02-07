package oops;

public class Constructor {
	
	Constructor(){
		System.out.println("No arguments constructor");
	}
	Constructor(int a){
		System.out.println("New Constructor");
	}
	Constructor(String a)
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
	
		Constructor con = new Constructor();
		Constructor con1 = new Constructor(90);
		Constructor con2 = new Constructor("String");
		Constructor con3 = new Constructor();
	}
}