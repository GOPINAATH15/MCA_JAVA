package oops;

public class Keyword_ex {

	int rollno = 34;
	double demo() {
		return 34.90;
	}
	Keyword_ex finalcall(){
		return this;
		
	}
	public Keyword_ex() {
		this(34);
		System.out.println(this.demo());
		System.out.println(this.rollno);
		System.out.println("Default Constructor");
	}
	
	Keyword_ex(int id){
		System.out.println("Employee id: "+id);
		
	}
	public static void main(String[] args) {
		Keyword_ex obj = new Keyword_ex();
		Keyword_ex obj1 = new Keyword_ex(101);
		Keyword_ex finalcall = new Keyword_ex();
		
	}
}
