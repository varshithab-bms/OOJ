import java.util.Scanner;

class Student {
    String usn;
    String name;
    int[] marks1, marks2;
    int[] credits1, credits2;
    int sub;

    void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter USN: ");
        usn = sc.next();
        System.out.print("Enter the number of subjects: ");
        sub = sc.nextInt();

        marks1 = new int[sub];
        credits1 = new int[sub];
        marks2 = new int[sub];
        credits2 = new int[sub];

        System.out.println("Enter marks and credits for 1st semester:");
        acceptMarksAndCredits(sc, marks1, credits1);

        System.out.println("Enter marks and credits for 2nd semester:");
        acceptMarksAndCredits(sc, marks2, credits2);
    }

    private void acceptMarksAndCredits(Scanner sc, int[] marks, int[] credits) {
        for (int i = 0; i < sub; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Invalid marks (between 0-100). Enter again: ");
                marks[i] = sc.nextInt();
            }
            System.out.print("Enter credits for subject " + (i + 1) + ": ");
            credits[i] = sc.nextInt();
            while (credits[i] <= 0) {
                System.out.print("Invalid credits (must be greater than 0). Enter again: ");
                credits[i] = sc.nextInt();
            }
        }
    }

    void displayDetails() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
    }

    double calcSgpa(int sem) {
        int[] marks = (sem == 1) ? marks1 : marks2;
        int[] credits = (sem == 1) ? credits1 : credits2;

        double gradePoints = 0;
        double totalCredits = 0;

        for (int i = 0; i < sub; i++) {
            gradePoints += convertMarksToGradePoints(marks[i]) * credits[i];
            totalCredits += credits[i];
        }

        return totalCredits == 0 ? 0 : gradePoints / totalCredits;
    }

    double calcCgpa() {
        double sgpa1 = calcSgpa(1);
        double sgpa2 = calcSgpa(2);
        return (sgpa1 + sgpa2) / 2;
    }

    private double convertMarksToGradePoints(int marks) {
        if (marks >= 90) return 10;
        else if (marks >= 80) return 9;
        else if (marks >= 70) return 8;
        else if (marks >= 60) return 7;
        else if (marks >= 50) return 6;
        else if (marks >= 40) return 5;
        else return 0;
    }
}

public class StudentInfo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.acceptDetails();
        s1.displayDetails();
        double sgpa1 = s1.calcSgpa(1);
        double sgpa2 = s1.calcSgpa(2);
        double cgpa = s1.calcCgpa();
        System.out.printf("SGPA of first semester: %.2f\n", sgpa1);
        System.out.printf("SGPA of second semester: %.2f\n", sgpa2);
        System.out.printf("CGPA: %.2f\n", cgpa);
    }
}
