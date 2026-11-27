import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {

        int[] a = {5, 9, 3, 6, 8, 2, 7, 4};
        System.out.println(Arrays.toString(a));

        int sum = 0;

        for (int i = 1; i < a.length; i += 2) {
            sum = sum + a[i];
        }

        System.out.println("Sum: " + sum);
    }
}
