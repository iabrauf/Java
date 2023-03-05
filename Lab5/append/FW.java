import java.io.*;

public class FW {
    public static void main(String args[]) {

        try {
            File file = new File("test2.txt");
            FileWriter fr = new FileWriter(file, true);
            fr.write("data");
            fr.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
