public class exception1 {
    public static void main(String[] args) {
        try {
            int n1 = 0;
            int n2 = 2;
            System.out.println(n2 / n1);
            System.exit(1);
        } catch (ArithmeticException e) {
            System.out.println("Something went wrong.");
        } catch (Exception e) { // ignore this block as it has already found the Arithmatic Exception
            System.out.println("Something went wrongdweudewfgwe.");
        } finally {
            System.out.println("Exception occured");
        }
    }
}
