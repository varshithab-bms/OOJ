package CIE;

import java.util.Scanner;
public class Student {
protected String usn;
protected String name;
protected int sem;
public void inputStudentDetails(){
Scanner s = new Scanner(System.in);
System.out.print("Enter USN: ");
this.usn = s.nextLine();
System.out.print("Enter Name: ");
this.name = s.nextLine();
System.out.print("Enter Semester: ");
this.sem = s.nextInt();
}
public void displayStudentDetails() {
System.out.println("USN: " + usn);
System.out.println("Name: " + name);
System.out.println("Semester: " + sem);
}
}
