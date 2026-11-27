import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = {8, 25, 13, 30, 6, 17, 21};

        System.out.print("Original array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.print("Enter the limit: ");
        while (!sc.hasNextInt()) {
            System.out.print("This is not an integer. Try again: ");
            sc.next();
        }
        int limit = sc.nextInt();


        for (int i = 0; i < a.length; i++) {
            if (a[i] > limit) {
                a[i] = limit;
            }
        }

        System.out.print("Changed array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
