package conditional;

public class Second {

	public static void main(String[] args) {
		int a=10,b=5,c=50;
		if(a>b)
			if(a>c)
				System.out.println("A is greater: "+a);
			else
				System.out.println("C is greater: "+c);
		else
			if(b>c)
			System.out.println("B is greater: "+b);
	}
}
//a =10,b=20,c=30