package oops;

class Fruit{
	String fullname = "Fruits";
	void display() {
		System.out.println("I'm Healthy");
	}
}
class Apple extends Fruit {
	String name = "I'm Apple";
	void display() {
		super.display();
		System.out.println("I'm so delicious");
	}
}
class Mango extends Apple{
	String name = "I'm Mango";
	void display() {
		super.display();
		System.out.println("I'm pretty sweet");
	}
	
}
public class MultiLevel_inheri {

	public static void main(String[] args) {
		Mango m = new Mango();
//		System.out.println(m.name);
		m.display();
//		System.out.println(m.fullname);
	}
}
