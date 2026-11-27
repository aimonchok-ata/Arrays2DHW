import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];


        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            while (!sc.hasNextInt()) {
                System.out.print("This is not an integer. Try again: ");
                sc.next();
            }
            a[i] = sc.nextInt();
        }


        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0) {
                count++;
            }
        }

        System.out.println("Count: " + count);
        sc.close();
    }
}
