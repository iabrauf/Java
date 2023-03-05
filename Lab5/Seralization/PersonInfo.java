import java.io.*;

public class PersonInfo implements Serializable {
    String name;
    String city;
    transient String houseNo; // Will show null transient is used for private information like PIN

    PersonInfo(String n, String c, String h) {
        this.name = n;
        this.city = c;
        this.houseNo = h;
    }

    void displayInfo() {
        System.out.println("Name " + name + " City " + city + " House No. " + houseNo);
    }
}
