package oops;

//	Polymorphrism
public class Polymorphrism {

//	Compile time Polymorphrism(Method overloading)
	public void exit() {
		System.out.println("Exit through LIFT");
	}
	public void exit(int a) {
		System.out.println("Exit through Window");
	}
	public void exit(String s) {
		System.out.println("Exit through Main Gate");
	}
	
//	Runtime Polymprphrism(Method Overriding)
		public void exit() {
			super.display()
			System.out.println("Single Inheritance from parent");
		}.
	public static void main(String[] args) {
		Polymorphrism p = new Polymorphrism();
		p.exit();
		p.exit(12);
		p.exit("Exit");
		Child c = new Child();
		
	}
}
