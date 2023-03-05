
import java.util.*;

public class quiz2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Input 5 numbers");
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }
        if ((arr[0] / arr[4]) == 1 && (arr[1] / arr[3]) == 1) {
            System.out.println("Palindrome Array");
        } else {
            System.out.println("Not Palindrome Array");
        }
    }
}