import java.io.*;

public class FOS1 {
    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("test.txt");
            fout.write(65); // write(int a) //write does not accept string at all. only except bytes
            fout.close();
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
