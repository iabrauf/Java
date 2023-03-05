import java.io.*;

public class FOS {
    public static void main(String args[]) {

        try {
            FileOutputStream os = new FileOutputStream(new File("test2.txt"), true);
            os.write("data".getBytes(), 0, "data".length());
            os.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
