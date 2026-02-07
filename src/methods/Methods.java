package methods;
import java.util.*;

public class Methods
{
    //parameters/arguments==>void add(int a,int b)
    //A method without return type and parameter/argument
    //A method without return type and with parameter/argument
    //A method with return type and parameter/argument
    //A method with return type and without parameter/argument
     
     
     void print()
     {
         System.out.println("This is Method");
     }
     
     static void print2()
     {
         System.out.println("This is Ststic Method");
     }
     
     static int val(){
         System.out.println("Print Statement");
         return 5;
     }
     
     
	public static void main(String[] args) {
	    Methods m = new Methods();
		m.print();
		Methods.print2();
		System.out.println(Methods.val());
	}
}
