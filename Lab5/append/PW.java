import java.io.*;

public class PW {
    public static void main(String args[]) {

        try {
            File file = new File("test2.txt");
            FileWriter fr = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fr);
            PrintWriter pr = new PrintWriter(br);
            pr.println("data");
            pr.close();
            br.close();
            fr.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
