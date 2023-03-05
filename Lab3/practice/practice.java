/*    
Imagine a publishing company that markets both book and audiocassette versions of its works. Create a class Publication that stores
the title (a string) and price (type float) of a publication. From this class derive two classes: Book, which adds a page count (pages of
type int); and Tape, which adds a playing time in minutes (time of type float). Each of these three classes should have a getData()
function to get its data from the user at the keyboard, and a putData() function to display its data. The Book and Tape classes should
inherit the Publication class.
While taking input for Book and Tape objects you have to take the title and price for any of these. So when you overriding methods
(getData and putData) in Book and Tape classes, you must take and display information for the above mentioned variables in these
functions as well.
Write main() function to test the Book and Tape classes by creating instances of them, asking the user to fill in data with getData(),
and then displaying the data with putData(). 
*/

import java.util.*;

class Publication {
    String title;
    double price;

    Publication() {

    }

    Publication(String t, double p) {
        this.title = t;
        this.price = p;
    }

    void getData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter title");
        title = in.nextLine();
        System.out.println("Enter price");
        price = in.nextInt();

    }

    void displayData() {
        System.out.println("Title of the book is: " + title);
        System.out.println("Price of the book is: " + price);

    }
}

class Book extends Publication {
    int pageCount;

    Book() {

    }

    Book(String title, double price, int pageCount) {
        super(title, price);
        this.pageCount = pageCount;
    }

    void getData() {
        super.getData();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter pageCount");
        pageCount = in.nextInt();
    }

    void displayData() {
        super.displayData();
        System.out.println("Total pages of the book is: " + pageCount);
    }
}

class Audiocaste extends Publication {
    double time;

    Audiocaste() {

    }

    Audiocaste(String title, double price, double time) {
        super(title, price);
    }

    void getData() {
        super.getData();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter time");
        time = in.nextDouble();
    }

    void displayData() {
        super.displayData();
        System.out.println("Total time of the audio caste is: " + time);
    }
}

public class practice {
    public static void main(String[] args) {
        Publication p1 = new Book();
        p1.getData();
        p1.displayData();
        p1 = new Audiocaste();
        p1.getData();
        p1.displayData();

    }
}
