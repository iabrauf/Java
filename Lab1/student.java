import javax.swing.*;
import java.util.*;

public class student {
    String name, gender;
    int rollNo;
    double CGPA;

    student() {

    }

    student(String n, int r, String g, double c) {
        this.name = n;
        this.rollNo = r;
        this.gender = g;
        this.CGPA = c;
    }

    int addStudent(String n, int r, String g, double c) {
        this.name = n;
        this.rollNo = r;
        this.gender = g;
        this.CGPA = c;
        return rollNo;
    }

    void viewStudent() {
        System.out.println(this.name + " " + this.rollNo + " " + this.gender + " " + this.CGPA);
    }

    public static void main(String[] args) {
        int totalStudent;
        System.out.println("Enter Total Student");
        Scanner in = new Scanner(System.in);
        totalStudent = in.nextInt();
        int currentStudent = 0;
        student st[] = new student[totalStudent];
        int choice = 0;
        while (choice != -1) {
            System.out.println("Select Option");
            choice = in.nextInt();
            switch (choice) {
                case 1:

                    String name = JOptionPane.showInputDialog("Enter name");
                    String rollNo = JOptionPane.showInputDialog("Enter Roll Number");
                    int x = new Integer(rollNo);
                    String gender = JOptionPane.showInputDialog("Enter gender");
                    String CGPA = JOptionPane.showInputDialog("Enter CGPA");
                    double y = new Double(CGPA);
                    st[currentStudent] = new student();
                    st[currentStudent].addStudent(name, x, gender, y);
                    currentStudent++;
                    System.out.println("Completed");
                    break;
                case 2:
                    String rn = JOptionPane.showInputDialog("Enter Roll Number");
                    int x1 = new Integer(rn);
                    x1 = x1 - 1;
                    st[x1].viewStudent();
                    break;

            }
        }
    }
}