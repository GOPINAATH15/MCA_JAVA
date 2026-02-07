package oops;

abstract class Demo{
	abstract void display();
	abstract void interest();
	public void sample() {
		System.out.println("Welcome");
	}
}
class Sample1 extends Demo{

	@Override
	void display() {
		System.out.println("Abstraction Example");
	}

	@Override
	void interest() {
		System.out.println("Abstraction of interest");
	}
	
}

public class Abstract {

	public static void main(String[] args) {
		Sample1 s = new Sample1();
		s.display();
		s.interest();
	}
}
