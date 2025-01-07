package SEE;

import CIE.Internals;
import java.util.Scanner;
public class Externals extends Internals {
protected int externalMarks[] = new int[5];
protected int finalMarks[] = new int[5];
public Externals() {
externalMarks = new int[5];
finalMarks = new int[5];
}
public void inputSEEmarks() {
Scanner s = new Scanner(System.in);
System.out.println("Enter External Marks for 5 courses: ");
for (int i = 0; i < 5; i++) {
System.out.print("Course " + (i + 1) + ": ");
externalMarks[i] = s.nextInt();
}
}
public void calculateFinalMarks() {
for (int i = 0; i < 5; i++) {
finalMarks[i] = marks[i] + externalMarks[i]; // Internal + External
}
}
public void displayFinalMarks() {
displayStudentDetails();
displayCIEmarks();
System.out.println("External Marks: ");
for (int i = 0; i < 5; i++) {
System.out.println("Course " + (i + 1) + ": " + externalMarks[i]);
}
System.out.println("Final Marks: ");
for (int i = 0; i < 5; i++) {
System.out.println("Course " + (i + 1) + ": " + finalMarks[i]);
}
}
}
