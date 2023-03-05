import java.util.*;

class student {
    String name, rollNo, CGPA, degree;

    student() {

    }

    student(String n, String r, String c, String d) {
        this.name = n;
        this.rollNo = r;
        this.CGPA = c;
        this.degree = d;
    }

    String getname() {
        return this.name;
    }

    String getrollno() {
        return this.rollNo;
    }

    String getcgpa() {
        return this.CGPA;
    }

    String getdegree() {
        return this.degree;
    }
}

public class driver {
    public static void main(String[] args) {
        int num; // how much object you want to create
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter Students number");
        num = in1.nextInt();

        for (int i = 0; i < num; i++) {
            String name, rollno, cgpa, degree;
            Scanner in2 = new Scanner(System.in);
            System.out.println("Enter Student name");
            name = in2.nextLine();
            System.out.println("Enter Student Roll no.");
            rollno = in2.nextLine();
            System.out.println("Enter Student cgpa");
            cgpa = in2.nextLine();
            System.out.println("Enter Student degree");
            degree = in2.nextLine();
            student arr[] = new student[num]; // assigning memory for n number of objects
            arr[i] = new student(name, rollno, cgpa, degree); // making each object one by one
            System.out.println(" Name of the Student: " + arr[i].getname() + " Roll number: " + arr[i].getrollno()
                    + " CGPA: " + arr[i].getcgpa() + " Degree: " + arr[i].getdegree());

        }
    }
}

// System.out.println(arr[i].getname());
// System.out.println(arr[i].getrollno());
// System.out.println(arr[i].getcgpa());
// System.out.println(arr[i].getdegree());
