package array;

public class Star_Array {

	public static void main(String[] args) {
		String a = "1234 5678 9012 3456";
		String s1= "**** ";
		String s2 = a.substring(15);
		System.out.println(s1.repeat(3)+s2);
	}
}
