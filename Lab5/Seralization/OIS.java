
import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class OIS {
    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("person.txt");
            ObjectInputStream obj = new ObjectInputStream(fin);

            PersonInfo person1 = (PersonInfo) obj.readObject(); // house number is not visible when we deal with file
                                                                // stream or network. here houseno is not visible
            PersonInfo person2 = (PersonInfo) obj.readObject();

            person1.displayInfo();
            person2.displayInfo();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
