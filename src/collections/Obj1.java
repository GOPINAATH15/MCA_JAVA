package collections;

import java.util.Scanner;

public class Obj1 {

	int rollno;
	int age;
	String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return getName()+" "+ getAge()+" "+getRollno();
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Obj1 o[] = new Obj1[3];
		for(int i=0;i<3;i++)
		{
			Obj1 user = new Obj1();
			sc.nextLine();
			System.out.println("Enter user name: "+(i+1));
			user.name = sc.nextLine();
			
			System.out.println("Enter rollno: ");
			user.rollno = sc.nextInt();
			
			System.out.println("Enter age: ");
			user.age = sc.nextInt();
			
			o[i] = user;
			
		}
		for(int i=0;i<3;i++)
		{
			System.out.println(o[i]);
		}
	}
}
