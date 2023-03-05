// package Seralization;

import java.time.Period;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class OOS {
    public static void main(String args[]) {
        PersonInfo p1 = new PersonInfo("Rauf", "Lahore", "137");
        PersonInfo p2 = new PersonInfo("Roshaan", "Lahore", "137");
        try {
            FileOutputStream fout = new FileOutputStream("person.txt");
            ObjectOutputStream obj = new ObjectOutputStream(fout);

            obj.writeObject(p1);
            obj.writeObject(p2);
        } catch (Exception e) {
            System.out.println(e);
        }
        p1.displayInfo(); // house number is visible when we do not deal with file stream or network. here
                          // houseno is visible
        p2.displayInfo();
    }

}
