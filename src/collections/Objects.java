package collections;

import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int age;
    String gender;
    String collegeName;

    void displayDetails() {
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Gender      : " + gender);
        System.out.println("College     : " + collegeName);
        System.out.println("-----------------------------");
    }
}

public class Objects {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("College Name: ");
            String college = sc.nextLine();

            students[i] = new Student();

            students[i].rollNo = roll;
            students[i].name = name;
            students[i].age = age;
            students[i].gender = gender;
            students[i].collegeName = college;
        }

        sc.close();

        System.out.println("All Student Details");
        for (Student s : students) {
            s.displayDetails();
        }
    }
}
