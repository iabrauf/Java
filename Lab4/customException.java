class newException extends Exception {
    int value;

    newException(int v) {
        this.value = v;
    }

    // String representation pf every object
    public String toString() {
        return "New Exception " + value;
    }
}

public class customException {
    public static void main(String[] args) {
        try {
            doWork(3);
            doWork(2);
            doWork(0);
        } catch (newException e) {
            System.out.println("Exception: " + e);
        }
        // doWork(3);
        // doWork(2);
        // doWork(0);
    }

    static void doWork(int value) throws newException {
        // try {
        if (value == 0) {
            throw new newException(value);
        } else {
            System.out.println("No problem");
        }
        // } catch (newException e) {
        // // both will produce same output
        // System.out.println("Exception: " + e);

        // }
    }
}
