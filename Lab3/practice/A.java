
// Quiz Q#1
//Check how many objects are created in memory?
import java.lang.*;

public class A {
    int number;
    public static int count = 0;

    A() {
        count = count + 1;
    }

    A(int n) {
        this.number = n;
        count = count + 1;
    }

    // java.lang pakage
    // java.lang object.finalize()
    // use for deletion of object
    protected void finalize() {
        count--;
    }

    public static void main(String[] args) {

        A a1 = new A();
        A a2 = new A(4);
        A a3 = new A();
        A a4 = new A(4);
        A a5 = new A();
        A a6 = new A(4);
        A a7 = new A();
        A a8 = new A(4);
        a1.finalize();
        a5.finalize();

        System.out.println(count);
    }
}