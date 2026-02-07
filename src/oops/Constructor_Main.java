package oops;

class Student{
    private String name;
    private int id;
    
    //default constructor
    Student()
    {
        System.out.println("Constructor");
    }
    //parameterized constructor
    Student(String n,int i)
    {
        this.name=n;
        this.id=i;
        //System.out.println(n+"  "+i);
    }
    
    void getData()
    {
        System.out.println(name);
        System.out.println(id);
    }
    
}
public class Constructor_Main
{
	public static void main(String[] args) {
	    
	        Student s1 = new Student("Dharaneesh",1);
	        Student s2 = new Student("Naveen",10);
	        Student s3 = new Student("Priya",100);
	        s2.getData();
	}
}
