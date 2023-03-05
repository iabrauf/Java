import java.util.*;

public class Input {
    public static void main(String[] args) {
        String Rollno;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Your Roll No.");
        Rollno = in.nextLine(); // read full line
        in.close();
        System.out.println("Your Rollno. is " + Rollno);
    }
}