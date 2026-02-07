package oops;

public class Acess_Modifier {

//	public - within the class,within package,outside package
//	private - within the same class only
//	default - within class, within package -- Not Outside package
//	protected - 
	
	private static  String name = "GOpi";
	
	public static void main(String[] args) {
	
		System.out.println(name);
//		System.out.println(Random_class.name);//Can't access another private string from another class if we are accesing from another classs it will show the error
	}
}
