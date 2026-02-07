package task;

import java.util.Scanner;

class Student1 {
    int rollNo;
    String name;
    int age;
    String gender;
    String collegeName;

    public Student1(int rollNo, String name, int age, String gender, String collegeName) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.collegeName = collegeName;
    }

    void displayDetails() {
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Gender      : " + gender);
        System.out.println("College     : " + collegeName);
        System.out.println("-----------------------------");
    }
}

public class Students {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student1[] students = new Student1[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student ");

            System.out.print("Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("College Name: ");
            String college = sc.nextLine();

            students[i] = new Student1(roll, name, age, gender, college);
        }

        sc.close();

        System.out.println("All Student Details");
        for (Student1 s : students) {
            s.displayDetails();
        }
    }
}
