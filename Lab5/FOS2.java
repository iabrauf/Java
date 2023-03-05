import java.io.*;

public class FOS2 {
    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("test.txt");
            String s = "Welcome to java.";
            byte b[] = s.getBytes();// converting string into byte array
            // System.out.println(b);
            fout.write(b); // only except bytes
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
