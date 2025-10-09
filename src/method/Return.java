package method;

import java.util.Scanner;

public class Return {

	void display(int a,int b) {
		System.out.println();
		return;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Return n = new Return();
		System.out.println(n.display(10,20));
	}
}
