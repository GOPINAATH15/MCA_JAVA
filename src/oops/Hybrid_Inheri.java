package oops;

class C
{
   public void disp()
   {
	System.out.println("C");
   }
}

class A extends C
{
   public void disp()
   {
	System.out.println("A");
   }
}

class B extends C
{
   public void disp()
   {
	System.out.println("B");
   }
	
}

class Hybrid_Inheri extends A
{
   public void disp()
   {
	System.out.println("Hybrid Inheritance");
   }
   public static void main(String args[]){

	   Hybrid_Inheri obj = new Hybrid_Inheri();
	obj.disp();
   }
}