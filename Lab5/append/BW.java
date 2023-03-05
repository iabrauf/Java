import java.io.*;

public class BW {
    public static void main(String args[]) {

        try {
            File file = new File("test2.txt");
            FileWriter fr = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fr);
            br.write("data");
            br.close();
            fr.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
