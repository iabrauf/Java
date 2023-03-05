import java.io.*;

public class BufIn {
    public static void main(String args[]) {
        // FileInputStream fin = null;
        // BufferedInputStream bin = null;
        try {
            FileInputStream fin = new FileInputStream("test.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i = 0;
            while ((i = bin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
