import javax.swing.*;

public class Input2 {
    public static void main(String[] args) {
        String rollno;
        rollno = JOptionPane.showInputDialog("Enter Roll Number");

        JOptionPane.showMessageDialog(null, "Your roll number is" + rollno);
    }
}