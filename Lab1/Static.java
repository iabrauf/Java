public class Static {

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 5;

        Static a1 = new Static();
        int add = a1.addition(n1, n2);

        System.out.println("your sum is:" + " " + add);
    }

    public int addition(int n1, int n2) {
        return n1 + n2;
    }

}