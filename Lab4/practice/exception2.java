public class exception2 {
    public static void main(String[] args) {
        try {
            int n1 = 0;
            int n2 = 2;
            System.out.println(n2 / n1);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
        // error: exception ArithmeticException has already been caught

        catch (ArithmeticException e) {
            System.out.println("Something went wrong.");
        }
    }
}


//Nested Exception
//https://beginnersbook.com/2013/04/nested-try-catch/
