package string;

public class String_Buffer {

	public static void main(String[] args) {
//		REVERSE 
		StringBuffer s = new StringBuffer("Hello");
		s.reverse();
		System.out.println(s);
//		APPEND
		StringBuffer s1 = new StringBuffer("Hello");
		s1.append(" ");
		s1.append("World");
		System.out.println(s1);
//		INSERT
		StringBuffer s2 = new StringBuffer("HelloJava");
		s2.insert(5, ",Welcome to the ");
		System.out.println(s2);
//		DELETE
		StringBuffer s3 = new StringBuffer("HelloWorld");
		s3.delete(0, 3);
		System.out.println(s3);
//		DELETE at CHARAT
		StringBuffer s4 = new StringBuffer("Hello");
		s4.deleteCharAt(1);
		System.out.println(s4);
	}
}
